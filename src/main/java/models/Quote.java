package models;


import java.io.Serializable;

public class Quote implements Serializable {
    private Long id;
    private String content;
    private String author;

    public Quote(Long id, String quote, String author) {
        this.id = id;
        this.content = quote;
        this.author = author;
    }

    public Quote() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}