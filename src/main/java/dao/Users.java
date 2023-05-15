package dao;

import model.User;

import java.util.List;

public interface Users {
    //get a list of all the users
    List<User> all();

    //insert a new ad and return the new ad's id
    void insert(User user);
}
