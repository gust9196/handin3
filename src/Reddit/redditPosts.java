package comparable;

public class redditPosts implements Comparable<posts> {
    private String topic;

    private int upvotes;
    private int comments;

    public redditPosts(String topic, int upvotes, int comments) {
        this.topic = topic;
        this.upvotes = upvotes;
        this.comments = comments;
    }


    @Override
    public String toString() {
        return "redditPosts{" +
                "topic='" + topic + '\'' +
                ", upvotes=" + upvotes +
                ", comments=" + comments +
                '}';
    }

}

    public int compareTo(redditPosts comparePost) {
        System.out.println(this);
        System.out.println(comparePost);

        if(this.post > comparePost.upvotes) {
            return -1;
        } else {
            return 1;
        }
    }
}