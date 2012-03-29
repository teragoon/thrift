namespace java simple

struct Post {
    1: int postId,
    2: int snsId,
    3: string nickName,
    4: string title,
    5: string content,
    6: string imgUrl
}

service PostService {
    void store(1: Post post),
    Post getPost(1: int postId),
    List<Post> getPostsBySnsId(1: int snsId),
    List<Post> getPostsAll()
}
