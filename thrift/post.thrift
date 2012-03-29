namespace java simple

struct Post {
    1: i32 postId,
    2: i32 snsId,
    3: string nickName,
    4: string title,
    5: string content,
    6: string imgUrl
}

service PostService {
    void store(1: Post post),
    Post getPost(1: i32 postId),
    list<Post> getPostsBySnsId(1: i32 snsId),
    list<Post> getPostsAll()
}
