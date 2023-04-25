package com.blazemage.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.blazemage.entity.Tags;
import com.blazemage.common.ResponseResult;

import java.util.List;

/**
 * <p>
 * 博客标签表 服务类
 * </p>
 *
 * @author blazemage
 * @since 2021-09-09
 */
public interface TagsService extends IService<Tags> {

    ResponseResult listTags(String name);

    ResponseResult insertTag(Tags tags);

    ResponseResult updateTag(Tags tags);

    ResponseResult deleteById(Long id);

    ResponseResult deleteBatch(List<Long> ids);

    ResponseResult getTagsById(Long id);

    ResponseResult top(Long id);


    //    -----web端方法开始-----
    ResponseResult webList();

}
