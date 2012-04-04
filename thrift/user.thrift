namespace com.kthcorp.imin.server.thrift

struct User {
  1: i32 id,
  2: string username
}

service UserService {
  User signup(1: string username, 2: string password),
  void finkout(1: string username),
  AuthToken login(1: string username, 2: string password),
  AuthToken login(1: string token),
  void logout(1: AuthToken token),
  User findUser(int id),
  User findUser(String username)
}
