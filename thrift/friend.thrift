namespace java simple

struct Friend {
  1: i32 uid,
  2: string nickName,
  3: string email,
  4: string imgUrl
}

service FriendService {
  void setReqFri(1: Friend me, 2: Friend friend),
  void setRecFri(1: Friend me, 2: Friend friend),
  void setListFri(1: Friend me, 2: Friend friend),
  list<Friend> getReqFri(1: i32 uid),
  list<Friend> getRecFri(1: i32 uid),
  list<Friend> getListFri(1: i32 uid),
  void delReqFri(1: Friend me, 2: Friend friend),
  void delRecFri(1: Friend me, 2: Friend friend) 
}
