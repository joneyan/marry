package com.gx.cm.yj;



import com.gx.cm.yj.enums.TimeoutTypeEnum;

import java.util.Date;


/**
 * @author xiaochong
 * @create 2018/8/16 下午10:08
 * @description
 */
public class TimeoutEvent {

    private long id;
    /**
     * 类型
     */
    private TimeoutTypeEnum type;
    /**
     * 触发时间
     */
    private Date triggerTime;
    /**
     * 携带的信息
     */
    private String value;

    public long getId() {
        return id;
    }

    public TimeoutEvent setId(long id) {
        this.id = id;
        return this;
    }

    public TimeoutTypeEnum getType() {
        return type;
    }

    public TimeoutEvent setType(TimeoutTypeEnum type) {
        this.type = type;
        return this;
    }

    public Date getTriggerTime() {
        return triggerTime;
    }

    public TimeoutEvent setTriggerTime(Date triggerTime) {
        this.triggerTime = triggerTime;
        return this;
    }

    public String getValue() {
        return value;
    }

    public TimeoutEvent setValue(String value) {
        this.value = value;
        return this;
    }
}
