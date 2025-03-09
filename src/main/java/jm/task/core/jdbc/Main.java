package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;


import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        UserDao userDao = new UserDaoJDBCImpl();
        userDao.createUsersTable();
        userDao.saveUser("Эдуард", "Меркюри" , (byte) 52);
        userDao.saveUser("Леопольд", "Да" , (byte) 52);
        userDao.saveUser("Светлана", "Здраствуите" , (byte) 52);
        userDao.saveUser("Дмитрий", "Пядухов" , (byte) 52);
        userDao.getAllUsers();
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}
