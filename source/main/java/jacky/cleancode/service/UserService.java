package jacky.cleancode.service;

import jacky.cleancode.access.UserAccess;
import jacky.cleancode.domain.User;

public class UserService {

    public final MailService mailService;
    public final UserAccess userAccess;

    public UserService(MailService mailService, UserAccess userAccess) {
        this.mailService = mailService;
        this.userAccess = userAccess;
    }

    public void addUser(User user){
        userAccess.addUser(user);
        mailService.sendMail(user.name);
    }

}
