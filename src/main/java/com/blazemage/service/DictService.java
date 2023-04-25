package com.blazemage.service;

import com.blazemage.common.ResponseResult;
import com.blazemage.entity.Dict;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 字典表 服务类
 * </p>
 *
 * @author blazemage
 * @since 2021-11-25
 */
public interface DictService extends IService<Dict> {

    ResponseResult listDict(String name, Integer isPublish, String descColumn, String ascColumn);

    ResponseResult insertDict(Dict dict);

    ResponseResult updateDict(Dict dict);

    ResponseResult deleteDict(int id);

    ResponseResult deleteBatch(List<Long> list);

}
