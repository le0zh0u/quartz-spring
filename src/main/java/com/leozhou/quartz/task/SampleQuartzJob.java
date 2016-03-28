package com.leozhou.quartz.task;

import com.leozhou.quartz.service.TaskService;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.Date;

/**
 * Created by zhouchunjie on 16/3/28.
 */
public class SampleQuartzJob extends QuartzJobBean {

    private static final Logger logger = LoggerFactory.getLogger(SampleQuartzJob.class);

    @Autowired
    private TaskService taskService;

    public void run() {
        logger.info("date: {}", new Date());
    }

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        taskService.printTime();
    }

}
