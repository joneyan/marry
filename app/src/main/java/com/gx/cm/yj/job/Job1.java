package com.gx.cm.yj.job;

import com.gx.cm.yj.TimeoutBase;
import com.gx.cm.yj.TimeoutEvent;
import org.springframework.stereotype.Component;

/**
 * @Author: yanjing
 * @Date: 2019/1/5 下午3:06
 * @Description:
 */
@Component(value = "job1")
public class Job1 extends TimeoutBase {
    @Override
    public void run(TimeoutEvent timeoutEvent) {
        System.out.println("我是job1");
    }
}
