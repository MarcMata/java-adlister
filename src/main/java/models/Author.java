package models;

import java.io.Serializable;
import java.util.List;

public class Author implements Serializable {
    private Long id;
    private String firstName;
    private String lastName;
    private List<Quote> quotes;

    public List<Quote> getQuotes() {
        return quotes;
    }

    public void setQuotes(List<Quote> quotes) {
        this.quotes = quotes;
    }

    public Author(Long id, String firstName, String lastName, List<Quote> quotes) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.quotes = quotes;
    }

    public Author(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Author() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}