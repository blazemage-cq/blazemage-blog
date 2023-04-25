package com.blazemage.mapper;

import com.blazemage.entity.JobLog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 定时任务调度日志表 Mapper 接口
 * </p>
 *
 * @author blazemage
 * @since 2021-12-08
 */
@Repository
public interface JobLogMapper extends BaseMapper<JobLog> {

    void clean();

}
