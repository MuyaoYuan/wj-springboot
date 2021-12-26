package my.study.controller;

import my.study.entity.User;
import my.study.result.Result;
import my.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.HtmlUtils;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired
    UserService userService;

    @CrossOrigin
    @PostMapping(value = "/api/login")
    @ResponseBody
    public Result login(@RequestBody User requestUser, HttpSession session) {
        String username = requestUser.getUsername();
        username = HtmlUtils.htmlEscape(username);

        User user = userService.getByNameAndPassword(username, requestUser.getPassword());
        if (null == user) {
            return new Result(400);
        } else {
            session.setAttribute("user",user);
            return new Result(200);
        }
    }
}
