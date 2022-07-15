package com.jeethink.web.controller.export;

import com.jeethink.common.core.domain.AjaxResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/system/aaa")
public class ExportController {


    @ApiOperation("获取用户列表")
    @GetMapping("/test1")
    public AjaxResult userList(HttpServletRequest request, HttpServletResponse response)
    {
        return AjaxResult.success("qwer");
    }

}
