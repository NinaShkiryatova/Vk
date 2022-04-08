import org.omg.CORBA.Object

class Likes(
    var count: UInt,
    var userLikes: Boolean,
    var canLike: Boolean,
    var canPublish: Boolean
) {
}

class Comments(
    var count: UInt,
    var canPost: Boolean,
    var groupsCanPost: Boolean,
    var canClose: Boolean,
    var canOpen: Boolean
) {
}

class Reposts(
    var count: UInt,
    var userReposted: Boolean
) {
}

class Views(
    var count: UInt
) {
}

class PostSource(
    var accessKey: UInt
) {
}

class Geo(
    var type: String,
    var coordinates: String,
    var place: Object ?
) {
}

class CopyHistory(
    var historyArray: Array<Post>
) {
}

enum class PostType {
    Post, Copy, Reply, Postpone, Suggest
}

