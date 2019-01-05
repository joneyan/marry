package com.gx.cm.yj;


import org.springframework.stereotype.Component;

/**
 * @author xiaochong
 * @create 2018/8/16 下午10:08
 * @description
 */
@Component
public abstract class TimeoutBase extends BaseTask {




    public abstract void run(TimeoutEvent timeoutEvent);


    /**
     * 该事件逻辑删除
     *
     * @param timeoutEvent
     */


}
