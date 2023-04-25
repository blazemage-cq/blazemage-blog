package com.blazemage.service;

import com.blazemage.common.ResponseResult;
import com.blazemage.entity.PhotoAlbum;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 相册 服务类
 * </p>
 *
 * @author blazemage
 * @since 2021-12-29
 */
public interface PhotoAlbumService extends IService<PhotoAlbum> {

    ResponseResult listAlbum(String name);

    ResponseResult getAlbumById(Integer id);

    ResponseResult insertAlbum(PhotoAlbum photoAlbum);

    ResponseResult updateAlbum(PhotoAlbum photoAlbum);

    ResponseResult deleteAlbumById(Integer id);





    //web端方法开始
    ResponseResult webAlbumList();

    ResponseResult webListPhotos(Integer albumId);

}
