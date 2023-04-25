package com.blazemage.controller.system;


import cn.dev33.satoken.annotation.SaCheckLogin;
import cn.dev33.satoken.annotation.SaCheckPermission;
import com.blazemage.annotation.OperationLogger;
import com.blazemage.common.ResponseResult;
import com.blazemage.service.UserLogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 日志表 前端控制器
 * </p>
 *
 * @author blazemage
 * @since 2021-11-09
 */
@RestController
@RequestMapping("/system/userLog")
@RequiredArgsConstructor
@Api(tags = "用户日志管理")
public class UserLogController {

    private final UserLogService userLogService;

    @GetMapping(value = "/list")
    @SaCheckLogin
    @ApiOperation(value = "用户日志列表", httpMethod = "GET", response = ResponseResult.class, notes = "用户日志列表")
    public ResponseResult list() {
        return userLogService.listUserLog();
    }

    @DeleteMapping(value = "/delete")
    @SaCheckPermission("/system/userLog/delete")
    @OperationLogger(value = "删除用户日志")
    @ApiOperation(value = "删除用户日志", httpMethod = "DELETE", response = ResponseResult.class, notes = "删除用户日志")
    public ResponseResult deleteBatch(@RequestBody List<Long> ids) {
        return userLogService.deleteBatch(ids);
    }
}

