package com.leozhou.quartz.task;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.Date;

/**
 * Created by zhouchunjie on 16/3/28.
 */
public class SampleQuartzJob extends QuartzJobBean {

    private static final Logger logger = LoggerFactory.getLogger(SampleQuartzJob.class);

    public void run() {
        logger.info("date: {}", new Date());
    }

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.info("date: {}", new Date());
    }

}
