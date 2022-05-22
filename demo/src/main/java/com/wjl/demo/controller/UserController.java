package com.wjl.demo.controller;

import com.wjl.demo.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/user")
@Api(tags = "用户")
public class UserController {

    @GetMapping("/getUserInfo")
    @ResponseBody
    @ApiOperation(value = "获取用户信息")
    public User getUserInfo(@ApiParam(value = "用户名",required = true) @RequestParam(name="userName",defaultValue = "张三") String userName){
        User user = new User();
        user.setName(userName);
        user.setAge(20);
        return user;
    }
}
