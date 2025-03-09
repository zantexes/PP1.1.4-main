package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;


import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Эдуард", "Меркюри" , (byte) 52);
        userService.saveUser("Леопольд", "Да" , (byte) 52);
        userService.saveUser("Светлана", "Здраствуите" , (byte) 52);
        userService.saveUser("Дмитрий", "Пядухов" , (byte) 52);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
