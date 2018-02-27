package com.cui.job.task;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 简单测试任务，需要实现SimpleJob
 *
 * @author cuishixiang
 * @date 2018-02-27
 */
public class MySimpleJob implements SimpleJob {
    static final Logger logger = LoggerFactory.getLogger(MySimpleJob.class);

    static int count = 0;

    /**
     * 执行作业.
     *
     * @param shardingContext 分片上下文
     */
    @Override
    public void execute(ShardingContext shardingContext) {
        logger.info("----Thread ID: {}, 任务总片数: {}, 当前分片项: {}，执行次数：{}",
                Thread.currentThread().getId(), shardingContext.getShardingTotalCount(), shardingContext.getShardingItem(), ++count);

        /**
         * 实际开发中，有了任务总片数和当前分片项，就可以对任务进行分片执行了
         * 比如 SELECT * FROM user WHERE status = 0 AND MOD(id, shardingTotalCount) = shardingItem
         */
        switch (shardingContext.getShardingItem()) {
            case 0:
                logger.info("sharding item 0");
                break;
            case 1:
                logger.info("sharding item 1");
                break;
            case 2:
                logger.info("sharding item 2");
                break;
            default:
                logger.info("sharding item other");
        }

    }
}
