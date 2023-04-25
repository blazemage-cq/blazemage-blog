package com.blazemage.controller.system;


import cn.dev33.satoken.annotation.SaCheckLogin;
import cn.dev33.satoken.annotation.SaCheckPermission;
import com.blazemage.annotation.OperationLogger;
import com.blazemage.common.ResponseResult;
import com.blazemage.entity.WebConfig;
import com.blazemage.service.WebConfigService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 网站配置表 前端控制器
 * </p>
 *
 * @author blazemage
 * @since 2021-11-27
 */
@RestController
@RequestMapping("/system/webConfig")
@Api(tags = "网站配置管理")
@RequiredArgsConstructor
public class WebConfigController {

    private final WebConfigService webConfigService;

    @GetMapping(value = "/list")
    @SaCheckLogin
    @ApiOperation(value = "网站配置列表", httpMethod = "GET", response = ResponseResult.class, notes = "网站配置列表")
    public ResponseResult list() {
        return webConfigService.listWebConfig();
    }

    @PostMapping(value = "/update")
    @SaCheckPermission("/system/webConfig/update")
    @ApiOperation(value = "修改网站配置", httpMethod = "POST", response = ResponseResult.class, notes = "网站配置列表")
    @OperationLogger(value = "修改网站配置")
    public ResponseResult update(@RequestBody WebConfig webConfig) {
        return webConfigService.updateWebConfig(webConfig);
    }
}

