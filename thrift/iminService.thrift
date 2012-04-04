namespace java com.kthcorp.imin.server.thrift

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
  
  AuthToken login(1: string username, 2: string password),
  
  AuthToken loginByToken(1: string token),
  
  void logout(1: AuthToken token),
  
  User findUserById(1: i32 id),
  
  User findUserByName(1: string username)
  /*
  List<User> findUsers(1: string expr),
  
  List<User> getFollowers(1: User user),
  
  List<User> getFollowings(1: User user),
  
  Post findPostById(1: i32 id),

  List<Post> findPostsByPoi(1: Poi poi),

  List<Post> findPostsByUser(1: User user),

  List<Post> findPosts(1: Position position, 2: double radius, 3: string expr),

  void submitPost(1: Post post),
    
  void deletePost(1: Post post),
  
  Comment findCommentById(1: i32 id),

  List<Comment> findCommentsByUser(1: User user),

  List<Comment> findCommentsByPost(1: Post post),

  void submitComment(1: Post post, 2: Comment comment),
    
  void deleteComment(1: Comment comment),
  
  Attachment findAttachmentById(1: i32 id),
  
  List<Attachment> findAttachmentsByUser(1: User user),
  
  List<Attachment> findAttachmentsByPost(1: Post post),
  
  void submitAttachment(1: Post post, 2: Attachment attachment),
  
  void deleteAttachment(1: Attachment attachment)
*/
}
