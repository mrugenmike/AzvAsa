package azvasa.repository;

import azvasa.model.User;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserRepository {
    private final JdbcTemplate template;

    @Autowired
    public UserRepository(JdbcTemplate template){
        this.template = template;
    }

    public void save(User user) throws SignUpException{
        String insertUser = String.format("insert into users VALUES(%d,'%s','%s','%s')",user.getId(),user.getName(),user.getUserName(),user.getPassword());
        try {
            template.execute(insertUser);
        }
        catch (Exception e) {
           throw new SignUpException(e.getMessage());
        }
    }
}
