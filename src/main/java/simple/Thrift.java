package simple;

import org.apache.thrift.server.THsHaServer;
import org.apache.thrift.server.THsHaServer.Args;
import org.apache.thrift.server.TServer;
import org.apache.thrift.transport.TNonblockingServerSocket;
import org.apache.thrift.transport.TNonblockingServerTransport;
import org.apache.thrift.transport.TTransportException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import simple.PostService.Iface;
import simple.PostService.Processor;

public class Thrift {
    	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(
				Config.class);
				
		try {
			PostService.Iface handler  = (PostService.Iface) context.getBean("postHandler");
			PostService.Processor<PostService.Iface> processor = new Processor<Iface>(handler);
			
			TNonblockingServerTransport serverTransport = new TNonblockingServerSocket(8081);
			TServer server = new THsHaServer(new Args(serverTransport).workerThreads(10).processor(processor));
			System.out.println("Server is ready!!!");
			server.serve();
		} catch (TTransportException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
