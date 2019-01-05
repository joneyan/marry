package com.gx.cm.yj.job;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import com.gx.cm.yj.TimeoutBase;
import com.gx.cm.yj.enums.TimeoutTypeEnum;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

import static com.gx.cm.yj.enums.TimeoutTypeEnum.JOB_ONE;
import static com.gx.cm.yj.enums.TimeoutTypeEnum.JOB_TWO;

/**
 * @Author: yanjing
 * @Date: 2019/1/4 下午5:20
 * @Description:
 */
public class MyTestJob  implements SimpleJob {
    @Autowired
    private Map<String, TimeoutBase> handlers;
    @Override
    public void execute(ShardingContext shardingContext) {
        System.out.println(handlers);
        TimeoutBase job1 = handlers.get(JOB_ONE.getName());
        TimeoutBase job2 = handlers.get(JOB_TWO.getName());
        job1.run(null);
        job2.run(null);
    }
}
