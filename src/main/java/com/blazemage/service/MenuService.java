package com.blazemage.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.blazemage.common.ResponseResult;
import com.blazemage.entity.Menu;
import java.util.List;

/**
 * @author blazemage
 * @description:
 * @date 2021/8/20 9:30
 */
public interface MenuService extends IService<Menu>{

    List<Menu> listMenuTree(List<Menu> list);

    ResponseResult listMenuApi(Integer id);

    ResponseResult insertMenu(Menu menu);

    ResponseResult updateMenu(Menu menu);

    ResponseResult deleteMenuById(Integer id);
}
