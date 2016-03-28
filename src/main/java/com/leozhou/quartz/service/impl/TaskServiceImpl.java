package com.leozhou.quartz.service.impl;

import com.leozhou.quartz.service.TaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by zhouchunjie on 16/3/28.
 */
@Service
public class TaskServiceImpl implements TaskService {

    private static final Logger logger = LoggerFactory.getLogger(TaskServiceImpl.class);

    public void printTime() {
        logger.info("date is {}", new Date());
    }
}
