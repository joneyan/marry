package com.gx.cm.yj.enums;

/**
 * @Author: yanjing
 * @Date: 2019/1/4 下午5:39
 * @Description:
 */
public enum TimeoutTypeEnum {
    JOB_ONE(1,"job1","任务1"),
    JOB_TWO(2,"job2","任务2"),
    ;
    private int type;
    private String name;
    private String desc;

    TimeoutTypeEnum(int type, String name, String desc) {
        this.type = type;
        this.name = name;
        this.desc = desc;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
