package com.example.designpatterns.strategy.demo1;

import org.springframework.stereotype.Component;

/**
 * @author huangquan
 * @date 2022/8/11
 **/
@Component
public class GayLunSkill implements Skill{
    /**
     * 用于注册唯一标识
     *
     * @return
     */
    @Override
    public String getNo() {
        return "GayLunSkill";
    }

    @Override
    public String Q() {
        return "致命打击";
    }

    @Override
    public String W() {
        return "勇气";
    }

    @Override
    public String E() {
        return "审判";
    }

    @Override
    public String R() {
        return "德玛西亚正义";
    }
}
