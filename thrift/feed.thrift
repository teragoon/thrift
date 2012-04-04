namespace java simple

struct Feed {
    1: i32 postId,
    2: i32 uid,
    3: string nickName,
    4: string title,
    5: string content,
    6: string imgUrl
}

service FeedService {
    void setFeed(1: Feed feed),
    list<Feed> getFeedsByUid(1: i32 uid)
}
