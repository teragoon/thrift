namespace com.kthcorp.imin.server.thrift

struct User {
  1: i32 id,
  2: string username
}

struct AuthToken {
  1: User user,
  2: string password,
  3: bool authenticated
}

struct Post {
  1: i32 id,
  2: Poi poi,
  3: User user,
  4: string subject,
  5: string text,
  6: i64 time,
  7: double latitude,
  8: double longitude
}

struct Comment {
  1: i32 id,
  2: User user,
  3: Post post,
  4: string text,
  5: i64 time,
  6: double latitude,
  7: double longitude
}

struct Poi {
  1: i32 id,
  2: string name,
  3: double latitude,
  4: double longitude,
  5: i32 type
}

struct Attachment {
  1: i32 id,
  2: Post post,
  3: string name,
  4: i64 time,
  5: string type,
  6: double latitude,
  7: double longitude
}



service IminThriftService {
  User signup(1: string username, 2: string password),
  void finkout(1: string username),
  AuthToken login(1: string username, 2: string password);
  AuthToken login(1: string token);
  void logout(1: AuthToken token);
  
  User findUser(int id);

  User findUser(String username);

  List<User> findUsers(String expr);

  List<User> getFollowers(User user);

  List<User> getFollowings(User user);
  
  Post findPost(i32 id);

  List<Post> findPosts(Poi poi);

  List<Post> findPosts(User user);

  List<Post> findPosts(Position position, double radius, String expr);

  void submitPost(Post post);
    
  void deletePost(Post post);
  
  Comment findComment(i32 id);

  List<Comment> findComments(User user);

  List<Comment> findComments(Post post);

  void submitComment(Post post, Comment comment);
    
  void deleteComment(Comment comment);
  
  Attachment findAttachment(i32 id);

  List<Attachment> findAttachments(User user);

  List<Attachment> findAttachments(Post post);

  void submitAttachment(Post post, Attachment attachment);

  void deleteAttachment(Attachment attachment);
}
