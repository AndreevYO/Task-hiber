package jm.task.core.jdbc.service;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class UserServiceImpl implements UserService {
    UserDaoJDBCImpl us = new UserDaoJDBCImpl();

    public void createUsersTable() {
        us.createUsersTable();

    }

    public void dropUsersTable() {
        us.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        us.saveUser(name,lastName,age);
    }

    public void removeUserById(long id) {
        us.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return us.getAllUsers();
    }

    public void cleanUsersTable() {
        us.cleanUsersTable();
    }
}
