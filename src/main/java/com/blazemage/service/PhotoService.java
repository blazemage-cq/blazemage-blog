package com.blazemage.service;

import com.blazemage.common.ResponseResult;
import com.blazemage.entity.Photo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 照片 服务类
 * </p>
 *
 * @author blazemage
 * @since 2021-12-29
 */
public interface PhotoService extends IService<Photo> {

    ResponseResult listPhoto(Integer albumId);

    ResponseResult getPhotoById(Integer id);

    ResponseResult insertAlbum(Photo photo);

    ResponseResult updatePhoto(Photo photo);

    ResponseResult movePhoto(Map<String,Object> map);

    ResponseResult deleteBatch(List<Integer> ids);

}
