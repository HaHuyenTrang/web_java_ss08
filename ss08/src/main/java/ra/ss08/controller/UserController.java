package ra.ss08.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import ra.ss08.model.User;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/users")
    public ModelAndView showUserList() {
        List<User> userList = new ArrayList<>();

        userList.add(new User("Hà Huyền Trang", 18, "15/06/2005", "a@gmail.com", "033456756"));
        userList.add(new User("Chenggggggg", 19, "11/6/2004", "b@gmail.com", "0987654"));
        userList.add(new User("Chang Chang", 20, "5/5/2004", "c@gmail.com", "01234567"));

        ModelAndView mav = new ModelAndView("userList");
        mav.addObject("users", userList);

        return mav;
    }
}