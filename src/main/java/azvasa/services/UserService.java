package azvasa.services;

import azvasa.model.User;
import azvasa.repository.SignUpException;
import azvasa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class UserService {
    @Autowired
    UserRepository userRepository;
    public void signUpUser(User user) throws SignUpException {
        final String time = new Long(new Date().getTime()).toString();
        user.setId(Integer.valueOf(time.substring(time.length()-6,time.length())));
        userRepository.save(user);
    }
}
