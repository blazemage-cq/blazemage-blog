package com.blazemage.service;

import com.blazemage.common.ResponseResult;
import com.blazemage.entity.UserAuth;
import com.baomidou.mybatisplus.extension.service.IService;
import com.blazemage.dto.EmailLoginDTO;
import com.blazemage.dto.EmailRegisterDTO;
import com.blazemage.dto.QQLoginDTO;
import com.blazemage.dto.UserAuthDTO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author blazemage
 * @since 2021-12-25
 */
public interface UserAuthService extends IService<UserAuth> {

    ResponseResult emailRegister(EmailRegisterDTO emailRegisterDTO);

    ResponseResult updatePassword(EmailRegisterDTO emailRegisterDTO);

    ResponseResult emailLogin(EmailLoginDTO emailLoginDTO);

    ResponseResult qqLogin(QQLoginDTO qqLoginDTO);

    ResponseResult weiboLogin(String code);

    ResponseResult giteeLogin(String code);

    ResponseResult sendEmailCode(String email);

    ResponseResult bindEmail(UserAuthDTO vo);

    ResponseResult updateUser(UserAuthDTO vo);

}
