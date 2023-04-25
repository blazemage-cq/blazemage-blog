package com.blazemage.service;


import com.blazemage.common.ResponseResult;
import com.blazemage.dto.LoginDTO;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * @author blazemage
 * @description:
 * @date 2021/7/30 14:58
 */
public interface LoginService {

    Map<String, String> getCode(HttpServletResponse response) throws IOException;


    ResponseResult login(LoginDTO vo);
}
