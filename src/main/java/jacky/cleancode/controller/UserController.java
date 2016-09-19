package jacky.cleancode.controller;

import jacky.cleancode.domain.User;
import jacky.cleancode.message.AddUserRequest;
import jacky.cleancode.message.AddUserResponse;
import jacky.cleancode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public AddUserResponse addUser(AddUserRequest request ){
        User user = userOf(request);
        userService.addUser(user);
        return new AddUserResponse();
    }

    private User userOf(AddUserRequest request) {
        User result = new User();
        result.name = request.userName;
        return result;
    }
}
