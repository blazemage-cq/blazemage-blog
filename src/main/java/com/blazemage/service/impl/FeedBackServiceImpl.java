package com.blazemage.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.blazemage.common.ResponseResult;
import com.blazemage.common.FieldConstants;
import com.blazemage.entity.FeedBack;
import com.blazemage.mapper.FeedBackMapper;
import com.blazemage.service.FeedBackService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blazemage.util.PageUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author blazemage
 * @since 2022-01-13
 */
@Service
public class FeedBackServiceImpl extends ServiceImpl<FeedBackMapper, FeedBack> implements FeedBackService {

    /**
     * 反馈列表
     * @param type
     * @return
     */
    @Override
    public ResponseResult listFeedBack(Integer type) {
        QueryWrapper<FeedBack> queryWrapper = new QueryWrapper<FeedBack>()
                .orderByDesc(FieldConstants.CREATE_TIME).eq(type != null, FieldConstants.TYPE,type);
        Page<FeedBack> feedBackPage = baseMapper.selectPage(new Page<>(PageUtils.getPageNo(), PageUtils.getPageSize()), queryWrapper);
        return ResponseResult.success(feedBackPage);
    }

    /**
     * 删除反馈
     * @param ids
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResponseResult deleteBatch(List<Integer> ids) {
        int rows = baseMapper.deleteBatchIds(ids);
        return rows > 0 ? ResponseResult.success(): ResponseResult.error("删除反馈失败");
    }

    /**
     * 添加反馈
     * @param feedBack
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResponseResult insertFeedback(FeedBack feedBack) {
        int rows = baseMapper.insert(feedBack);
        return rows > 0 ? ResponseResult.success(): ResponseResult.error("添加反馈失败");
    }
}
