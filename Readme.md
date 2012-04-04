##thrift 설치 환경 CentOS

  1. 필요 라이브러리 설치

    sudo yum install automake libtool flex bison pkgconfig gcc-c++ boost-devel libevent-devel zlib-devel python-devel ruby-devel openssl-devel

  2. thrift 다운로드
    
    wget http://apache.tt.co.kr/thrift/0.8.0/thrift-0.8.0.tar.gz

  3. 압축 해제
  
    tar zxvf 파일명
  
  4. configure 실행
  
    ./configure JAVAC=자바 설치 위치 --prefix=/usr/local/thrift
  
  5. make
  
  6. make install
  
  7. path 설정 또는 /usr/local/bin에 ln -s 로 링크 생성

  0. 참고

    (CentOS에서 git 설치 방법 : http://www.how-to-linux.com/centos-52/install-git-161-on-centos-52/)


##thrift 로 코드 생성
  
  1. .thrift 파일 작성
  
    /thrift/user.thrift 참고
    
    (thrift type : http://thrift.apache.org/docs/types/)
  
  2. thrift 로 코드 생성
  
    thrift --gen \<language\> \<Thrift filename\>
    
    ex) \<language\> = java  또는 js:node 등등
  
  3. gen-\<language\> 폴더에 파일 사용 코딩
    
##maven 설치

  1. maven 다운로드
    wget http://ftp.daum.net/apache/maven/binaries/apache-maven-3.0.4-bin.zip
  2. 압축 해제
    unzip 압축파일
  3. 링크 생성
    ln -s 설치폴더/bin/mvn /usr/bin/mvn 
  4. 환경변수 등록
    vi /etc/profile
      export M2_HOME="설치 폴더"
      export PATH=$PATH:$M2_HOME/bin
    source /etc/profile
  5. maven repository 설정
    vi 설치폴더/conf/settings.xml 
      \<!-- localRepository
        | The path to the local repository maven will use to store artifacts.
        |
        | Default: ~/.m2/repository
      --\>
      \<localRepository\>원하는 폴더\</localRepository\>
    
##실행
  1. git clone
  2. thrift port 수정, mysql 설정 수정
  3. maven package 
  4. cd target
  5. java -jar 파일
