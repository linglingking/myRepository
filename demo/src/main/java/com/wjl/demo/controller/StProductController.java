package com.wjl.demo.controller;


import com.wjl.demo.model.StProduct;
import com.wjl.demo.model.User;
import com.wjl.demo.service.IStProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * 产品表 前端控制器
 * </p>
 *
 * @author wjl
 * @since 2022-05-14
 */
@Controller
@RequestMapping("/system/st-product")
@Api(tags = "产品")
public class StProductController {

    @Autowired
    IStProductService iStProductService;

    @GetMapping("/getUserInfo")
    @ResponseBody
    @ApiOperation(value = "获取用户信息")
    public StProduct getStProduct(@RequestParam(name="id") String id){

        return iStProductService.getStProduct(id);
    }
}
