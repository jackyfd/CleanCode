package jacky.cleancode.controller;

import jacky.cleancode.domain.User;
import jacky.cleancode.message.AddUserRequest;
import jacky.cleancode.message.AddUserResponse;
import jacky.cleancode.service.UserService;

public class UserController {
    public final UserService userService;

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
