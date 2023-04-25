package com.blazemage.service;

import com.blazemage.common.ResponseResult;
import com.blazemage.entity.WebConfig;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 网站配置表 服务类
 * </p>
 *
 * @author blazemage
 * @since 2021-11-27
 */
public interface WebConfigService extends IService<WebConfig> {

    ResponseResult listWebConfig();

    ResponseResult updateWebConfig(WebConfig webConfig);
}
