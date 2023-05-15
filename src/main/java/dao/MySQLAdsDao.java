package dao;

import model.Ad;
import model.User;
import com.mysql.cj.jdbc.Driver;
import config.Config;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private final Connection connection;

    public MySQLAdsDao() {
        try {
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
    public List<Ad> all() {
        Users usersDao = new UsersDao();
        List<User> users = usersDao.all();
        List<Ad> ads = new ArrayList<>();

        try {
            //create the statement
            Statement statement = connection.createStatement();
            //execute the statement
            ResultSet resultSet = statement.executeQuery("SELECT * FROM adlister_db.ads");
            //iterate over the resultSet
            while (resultSet.next()) {
                long user_id = resultSet.getInt("user_id");
                User userName = null;
                for (User user : users) {
                    if (user.getId() == user_id) {
                        userName = user;
                    }
                }

                Ad ad = new Ad(
                        resultSet.getLong("id"),
                        resultSet.getString("title"),
                        resultSet.getString("description"),
                        userName
                );
                ads.add(ad);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return ads;
    }



    @Override
    public void insert(Ad ad) {

    }
}

