package repository;

import bean.User;

import java.sql.SQLException;
import java.util.List;

public interface
IUserRepository {
    public List<User> selectAllUser();
    public List<User> showAllUser();
    public User selectUser(int id);
    public void insertUser(User user);
    public void addUserTran();
    public void updateUser(User user) ;
    public void editUser(User user) ;
    public void deleteUser( int id) ;
    public void dropUser( int id) ;
    public List<User> orderByName();
    public List<User> selectByCountry(String countryName);



}
