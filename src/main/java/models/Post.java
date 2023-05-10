package models;

public class Post {
    private String title;
    private String post;
    private String[] topic;

    public Post(String title, String post, String[] topic) {
        this.title = title;
        this.post = post;
        this.topic = topic;
    }

    public Post(String title, String post) {
        this.title = title;
        this.post = post;
    }

    public String[] getTopic() {
        return topic;
    }

    public void setTopic(String[] topic) {
        this.topic = topic;
    }

    public Post() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}
