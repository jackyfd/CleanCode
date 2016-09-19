package jacky.cleancode.service;

import jacky.cleancode.access.UserAccess;
import jacky.cleancode.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final MailService mailService;
    private final UserAccess userAccess;

    @Autowired
    public UserService(MailService mailService, UserAccess userAccess) {
        this.mailService = mailService;
        this.userAccess = userAccess;
    }

    public void addUser(User user){
        userAccess.addUser(user);
        mailService.sendMail(user.name);
    }

}
