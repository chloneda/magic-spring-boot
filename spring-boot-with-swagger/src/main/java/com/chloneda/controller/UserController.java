package com.chloneda.controller;

import com.chloneda.domain.User;
import com.chloneda.service.UserService;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Created by chloneda
 * @Description:
 */
@Api(value = "UserController", tags = "用户管理接口",
        consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
        produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@RestController
@RequestMapping("/users")
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @ApiOperation(value = "新增用户", notes = "新建用户", response = User.class)
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "创建成功"),
            @ApiResponse(code = 406, message = "添加失败")})
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseStatus
    public ResponseEntity<User> create(@ApiParam(value = "用户实体") @RequestBody User user) {
        User obj = userService.create(user);
        return new ResponseEntity(obj,HttpStatus.OK);
    }

    @ApiOperation(value = "删除用户", notes = "通过ID删除用户", response = Void.class)
    @ApiResponses(value = {@ApiResponse(code = 200, message = "删除成功"),
            @ApiResponse(code = 406, message = "用户不存在"),
            @ApiResponse(code = 404, message = "其他错误")})
    @RequestMapping(value = "/{userId}", method = RequestMethod.DELETE)
    @ResponseStatus
    public ResponseEntity<Void> delete(@ApiParam(value = "用户ID") @PathVariable("userId") String userId){
        userService.delete(userId);
        return new ResponseEntity(new HttpHeaders(), HttpStatus.OK);
    }

    @ApiOperation(value = "修改用户", notes = "更新用户", response = User.class)
    @ApiResponses(value = {@ApiResponse(code = 406, message = "用户不存在"),
            @ApiResponse(code = 404, message = "其他错误")})
    @RequestMapping(value = "/{userId}", method = RequestMethod.PUT)
    @ResponseStatus
    public ResponseEntity<User> update(@ApiParam(value = "用户实体") @RequestBody User user){
        User obj=userService.update(user);
        return new ResponseEntity(obj,HttpStatus.OK);
    }

    @ApiOperation(value = "获取所有用户", notes = "获取所有用户", response = List.class)
    @ApiResponses(value = {@ApiResponse(code = 406, message = "获取用户错误"),
            @ApiResponse(code = 404, message = "其他错误")})
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseStatus
    public ResponseEntity<List<User>> getUsersList() {
        List<User> userList = userService.findAll();
        return new ResponseEntity(userList,HttpStatus.OK);
    }

    @ApiOperation(value = "根据用户名获取用户", notes = "根据用户名获取用户", response = User.class)
    @ApiResponses(value = {@ApiResponse(code = 406, message = "获取用户错误"),
            @ApiResponse(code = 404, message = "其他错误")})
    @RequestMapping(value = "/{username}", method = RequestMethod.GET)
    @ResponseStatus
    public ResponseEntity<User> getUserByName(@PathVariable("username") String username) {
        User user = userService.getUserByName(username);
        LOGGER.info("=====> User: " + user);
        return new ResponseEntity<>(user,HttpStatus.OK);
    }

}
