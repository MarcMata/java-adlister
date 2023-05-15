package dao;

import com.mysql.cj.jdbc.Driver;
import models.Author;
import config.Config;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class AuthorsDao implements Authors{
    private final Connection connection;

    public AuthorsDao(){
        try {
            DriverManager.registerDriver(new Driver());
            this.connection = DriverManager.getConnection(
                    Config.getUrl(),
                    Config.getUsername(),
                    Config.getPassword()
            );
        } catch(SQLException sqlx){
            throw new RuntimeException("Error connecting to the database", sqlx);
        }
    }

    @Override
    public List<Author> all() {
        List<Author> authors = new ArrayList<>();
        try {
            //Create statement
            Statement statement = connection.createStatement();
            //Execute statement
            ResultSet resultSet = statement.executeQuery("SELECT * FROM codeup_test_db.authors");
            //iterate over the resultSet
            while (resultSet.next()) {
                Author author = new Author(
                        resultSet.getLong("id"),
                        resultSet.getString("name"));
                authors.add(author);
            }
        } catch (SQLException sqlx) {
            throw new RuntimeException("Error connecting to database", sqlx);
        }
        return authors;
    }


    @Override
    public void insert(Author author) {

    }
}
