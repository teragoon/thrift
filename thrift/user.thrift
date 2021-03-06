namespace java com.kthcorp.imin.server.thrift

struct User {
  1: i32 id,
  2: string username
}

service UserService {
  User login(1: string username, 2: string password),
  User signup(1: string username, 2: string password),
  void finkout(1: string username),
  User findUserById(1: i32 id),
  User findUser(1: string username)
}
