package com.blazemage.controller.api;


import com.blazemage.annotation.BusinessLogger;
import com.blazemage.common.ResponseResult;
import com.blazemage.entity.Message;
import com.blazemage.service.MessageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author blazemage
 * @since 2021-09-03
 */
@RestController
@RequestMapping("/web/message")
@Api(tags = "评论留言接口")
@RequiredArgsConstructor
public class ApiMessageController {

    private final MessageService messageService;

    @BusinessLogger(value = "留言模块-留言列表",type = "查询",desc = "留言列表")
    @RequestMapping(value = "/webMessage",method = RequestMethod.GET)
    @ApiOperation(value = "留言列表", httpMethod = "GET", response = ResponseResult.class, notes = "留言列表")
    public ResponseResult webMessage(){
        return messageService.webMessage();
    }


    @BusinessLogger(value = "留言模块-用户留言",type = "添加",desc = "用户留言")
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ApiOperation(value = "添加留言", httpMethod = "POST", response = ResponseResult.class, notes = "添加留言")
    public ResponseResult addMessage(@RequestBody Message message){
        return messageService.webAddMessage(message);
    }

}

