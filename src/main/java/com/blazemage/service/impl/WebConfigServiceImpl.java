package com.blazemage.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.blazemage.common.ResponseResult;
import com.blazemage.entity.WebConfig;
import com.blazemage.mapper.WebConfigMapper;
import com.blazemage.service.WebConfigService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import static com.blazemage.common.FieldConstants.LIMIT_ONE;

/**
 * <p>
 * 网站配置表 服务实现类
 * </p>
 *
 * @author blazemage
 * @since 2021-11-27
 */
@Service
public class WebConfigServiceImpl extends ServiceImpl<WebConfigMapper, WebConfig> implements WebConfigService {

    /**
     * 网站配置
     * @return
     */
    @Override
    public ResponseResult listWebConfig() {
        WebConfig webConfig = baseMapper.selectOne(new QueryWrapper<WebConfig>()
                .last(LIMIT_ONE));
        return ResponseResult.success(webConfig);
    }

    /**
     * 修改网站配置
     * @param webConfig
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResponseResult updateWebConfig(WebConfig webConfig) {
        baseMapper.updateById(webConfig);
        return ResponseResult.success();
    }
}
