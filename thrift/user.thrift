namespace java simple

struct User {
  1: i32 uid,
  2: string nickName,
  3: string email,
  4: string imgUrl
}

service UserService {
  void setUser(1: User user),
  User getUserByEmail(1: string email),
  User getUserByUid(1: i32 uid),
  User getUserByNickName(1: string nickName)
}
