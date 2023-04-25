package com.blazemage.quartz;

import com.blazemage.entity.Job;
import org.quartz.JobExecutionContext;

/**
 * @author blazemage
 * @date 2021/12/8
 * @apiNote 定时任务处理（禁止并发执行）
 */
public class QuartzDisallowConcurrentExecution extends AbstractQuartzJob {
    @Override
    protected void doExecute(JobExecutionContext context, Job job) throws Exception {
        JobInvokeUtil.invokeMethod(job);
    }
}
