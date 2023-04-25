package com.blazemage.service;

import com.blazemage.common.ResponseResult;
import com.blazemage.entity.Message;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author blazemage
 * @since 2021-09-03
 */
public interface MessageService extends IService<Message> {

    ResponseResult listMessage(String name);

    ResponseResult deleteMessageById(int id);

    ResponseResult passBatch(List<Integer> ids);

    ResponseResult deleteBatch(List<Integer> ids);




    //    ------web端方法开始-----
    ResponseResult webAddMessage(Message message);

    ResponseResult webMessage();


}
