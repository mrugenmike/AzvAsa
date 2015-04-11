package azvasa.repository;

import azvasa.model.User;
import ch.qos.logback.classic.db.SQLBuilder;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class UserRepository {
    private final JdbcTemplate template;

    @Autowired
    public UserRepository(JdbcTemplate template){
        this.template = template;
    }

    public void save(User user) throws SignUpException{
    	System.out.println("******"+user.getId());
    	System.out.println("******"+user.getName());
    	System.out.println("******"+user.getUserName());
    	System.out.println("******"+user.getPassword());
        String insertUser = String.format("insert into users VALUES(%d,'%s','%s','%s')",user.getId(),user.getName(),user.getUserName(),user.getPassword());
        try {
            template.execute(insertUser);
        }
        catch (Exception e) {
            if(e instanceof DuplicateKeyException)
                    throw new SignUpException("Username is Already taken");
            else throw new SignUpException("Unknown error occured, please signup again");
        }
    }

    public User findByUsername(String username) {
        String findByUserName = String.format("select * from users where user_name='%s'",username);
        return template.queryForObject(findByUserName, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                return new User(rs.getInt("id"),rs.getString("name"),rs.getString("user_name"),rs.getString("password"));
            }
        });
    }
}
