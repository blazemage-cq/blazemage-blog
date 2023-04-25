package com.blazemage.service.impl;

import com.blazemage.common.ResponseResult;
import com.blazemage.entity.Page;
import com.blazemage.mapper.PageMapper;
import com.blazemage.service.PageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author blazemage
 * @since 2021-12-26
 */
@Service
public class PageServiceImpl extends ServiceImpl<PageMapper, Page> implements PageService {

    /**
     * 页面列表
     * @return
     */
    @Override
    public ResponseResult listPage() {
        List<Page> pages = baseMapper.selectList(null);
        return ResponseResult.success(pages);
    }

    /**
     * 添加页面
     * @param page
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResponseResult insertPage(Page page) {
        int rows = baseMapper.insert(page);
        return rows > 0 ? ResponseResult.success(page): ResponseResult.error("添加失败");
    }

    /**
     * 修改页面
     * @param page
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResponseResult updatePage(Page page) {
        int rows = baseMapper.updateById(page);
        return rows > 0 ? ResponseResult.success(): ResponseResult.error("修改失败");
    }

    /**
     * 删除页面
     * @param id
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResponseResult deletePageById(Long id) {
        int rows = baseMapper.deleteById(id);
        return rows > 0 ? ResponseResult.success(): ResponseResult.error("删除失败");
    }
}
