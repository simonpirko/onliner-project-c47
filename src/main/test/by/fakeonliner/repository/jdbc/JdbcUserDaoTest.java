package by.fakeonliner.repository.jdbc;

import by.fakeonliner.entity.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JdbcUserDaoTest {

    @Test
    void save() {
        User user = new User(1,"FN","LN","UN","PSSW","PN", "EM","user");
         JdbcUserDao dao = new JdbcUserDao();
         dao.save(user);
         boolean result = dao.existByLogin("UN");
         assertEquals(true, result);
    }
}