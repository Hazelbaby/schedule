package com.schedule.demo.enums;

import java.util.Date;

public enum WorkInfo {
    MONDAY_WORK("支付开会"),
    TUESDAY_WORK("网关开发"),
    WEDNESDAY_WORK("交易开发"),
    THURSDAY_WORK("支付前置开发"),
    FRIDAY_WORK("支付引擎开发"),
    SATURDAY_WORK("加班联调"),
    SUNDAY_WORK("加班测试");


    private final String dateWork;
    private String id;
    private Date startDate;
    private String startTime;
    private Date endDate;
    private String endTime;
    private String definition;
    private String remark;

    WorkInfo(String dateWork){
        this.dateWork=dateWork;
    }
}
