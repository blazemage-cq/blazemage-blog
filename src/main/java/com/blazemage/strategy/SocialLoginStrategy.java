package com.blazemage.strategy;

import com.blazemage.vo.UserInfoVO;

/**
 * @author blazemage
 * @date 2022/1/5
 * @apiNote
 */
public interface SocialLoginStrategy {
    /**
     * 登录
     *
     * @param data 数据
     * @return {@link UserInfoVO} 用户信息
     */
    UserInfoVO login(String data);
}
