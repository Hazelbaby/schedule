package com.schedule.demo.service;

public class GetDailyWork implements IDailyWorkService{
    @Override
    public String getDailyWork(String weekday){
        String DailyWork="工作";
        switch (weekday){
            case "Monday":
                DailyWork="支付开会";
                break;
            case "Tuesday":
                DailyWork="网关开发";
                break;
            case "Wednesday":
                DailyWork="交易开发";
                break;
            case "Thursday":
                DailyWork="支付前置开发";
                break;
            case "Friday":
                DailyWork="支付引擎开发";
                break;
            case "Saturday":
                DailyWork="加班联调";
                break;
            case "Sunday":
                DailyWork="加班测试";
                break;
        }
        return DailyWork;
    }


    }

