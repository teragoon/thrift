var thrift = require('thrift'),
    Post = require('./gen-nodejs/PostService.js'),
    ptypes = require('./gen-nodejs/post_types.js');

var connection = thrift.createConnection('localhost', 8081),
    client = thrift.createClient(Post, connection);

connection.on('error', function(err) {
    console.error(err);
});


exports.setPost = function(post, callback){
    client.store(post, function(err, res){
        if(err) callback(err);
        else{
            console.log("client res: " + res);
            callback();
        }
    });
};

exports.getPost = function(postId, callback){
    client.getPost(postId, function(err, res){
        if(err) callback(err);
        else{
            console.log("client res: ");
            console.dir(res);
            callback(res);
        }
    });
};

exports.getPostsBySnsId = function(snsId, callback){
    client.getPostsBySnsId(snsId, function(err, res){
        if(err) callback(err);
        else{
            console.log("client res: ");
            console.dir(res);
            callback(res);
        }
    });
};

exports.getPostsAll = function(snsId, callback){
    client.getPostsAll(snsId, function(err, res){
        if(err) callback(err);
        else{
            console.log("client res: ");
            console.dir(res);
            callback(res);
        }
    });
};
