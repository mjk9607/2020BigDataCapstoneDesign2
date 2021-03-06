package com.dictation.controller;

import java.util.List;

import com.dictation.service.UserService;
import com.dictation.vo.UserVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/myinfo")
    public UserVO get(@AuthenticationPrincipal UserVO activeUser) {
        return userService.get(activeUser.getUser_id());
    }

    @GetMapping
    @Secured("ROLE_ADMIN")
    public List<UserVO> getList() {
        return userService.getList();
    }

    @PutMapping
    public void update(@RequestBody UserVO user, @AuthenticationPrincipal UserVO activeUser) throws Exception {
        user.setUser_id(activeUser.getUser_id());
        userService.update(user);
    }

}
