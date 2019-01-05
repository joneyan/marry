package com.gx.cm.yj.handler;

import com.gx.cm.yj.TimeoutBase;
import com.gx.cm.yj.TimeoutEvent;
import com.gx.cm.yj.enums.TimeoutTypeEnum;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * @Author: yanjing
 * @Date: 2019/1/4 下午5:33
 * @Description:
 */
public class TimeOutHandler {
    @Autowired
    private Map<String, TimeoutBase> handlers;

    public void run(TimeoutEvent timeoutEvent) {

        TimeoutTypeEnum timeoutTypeEnum = timeoutEvent.getType();
        for (TimeoutTypeEnum typeEnum : TimeoutTypeEnum.values()) {
            if (timeoutTypeEnum == typeEnum) {
                handlers.get(typeEnum.getName()).run(timeoutEvent);
            }
        }
    }
}
