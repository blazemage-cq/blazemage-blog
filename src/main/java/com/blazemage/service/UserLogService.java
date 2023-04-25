package com.blazemage.service;

import com.blazemage.common.ResponseResult;
import com.blazemage.entity.UserLog;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 日志表 服务类
 * </p>
 *
 * @author blazemage
 * @since 2021-11-09
 */
public interface UserLogService extends IService<UserLog> {

    ResponseResult listUserLog();

    ResponseResult deleteBatch(List<Long> ids);
}
