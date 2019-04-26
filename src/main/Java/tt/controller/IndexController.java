package tt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tt.pojo.User;
import tt.service.UserService;

import java.util.List;

@RestController
public class IndexController {
    @Autowired
    UserService userService;
    @RequestMapping(value = "/")
    public List<User> Index(){
        return userService.getUsers();
    }
}
