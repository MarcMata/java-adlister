package dao;

import com.mysql.cj.jdbc.Driver;
import model.User;
import config.Config;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsersDao implements Users{
    private final Connection connection;

    public UsersDao(){
        try{
            DriverManager.registerDriver(new Driver());
            this.connection = DriverManager.getConnection(
                    Config.getURL(),
                    Config.getUser(),
                 Config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<User> all() {
        List<User> users = new ArrayList<>();
        try {
            //create statement
            Statement statement = connection.createStatement();
            //execute statement
            ResultSet resultSet = statement.executeQuery("SELECT * FROM adlister_db.users");
            //iterate over the resultSet
            while (resultSet.next()) {

                User user = new User(

                        resultSet.getLong("id"),
                        resultSet.getString("username"),
                        resultSet.getString("email"),
                        resultSet.getString("password")
                );
                users.add(user);
            }
        } catch (SQLException sqlx) {
            throw new RuntimeException("Error connecting to database", sqlx);
        }
        return users;
    }

    @Override
    public void insert(User user) {

    }

}