package simple;

import java.sql.SQLException;
import java.util.List;
import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ibatis.sqlmap.client.SqlMapClient;

@Component
public class PostHandler implements PostService.Iface {

    @Autowired SqlMapClient sqlMap;
	
	@Override
	public void store(Post post) throws TException {
		
		System.out.println("in post store");
		try {
			sqlMap.update("postSvc.addPost", post);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("out post store");
	}

	@Override
	public Post getPost(int postId) throws TException {
		Post post = null;
		try {
			
			post = (Post) sqlMap
					.queryForObject("postSvc.getPost", postId);
			//System.out.println("delete count " + sqlMap.update("postSvc.deletePost", post.getPostId()));
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		System.out.println(post);
		return post;
	}
    
    @Override
    public List<Post> getPostsByUid(int uid) throws TException{
        List<Post> posts = null;
        try{
            posts = (List<Post>) sqlMap
                    .queryForList("postSvc.getPostsByUid", uid);
            System.out.println("out getPostsByUid");
        } catch (SQLException e) {
    		e.printStackTrace();
		}
        return posts;
    }

    @Override
    public List<Post> getPostsAll() throws TException{
        List<Post> posts = null;
        try{
            posts = (List<Post>) sqlMap
                    .queryForList("postSvc.getPostsAll");
            System.out.println("out getPostsAll");
        } catch (SQLException e) {
        	e.printStackTrace();
		}
        return posts;
    }

}
