package com.example.designpatterns.strategy.demo1;

/**
 * @author huangquan
 * @date 2022/8/11
 **/

import org.springframework.stereotype.Component;

@Component
public class VnSkill implements Skill{

    /**
     * 用于注册唯一标识
     *
     * @return
     */
    @Override
    public String getNo() {
        return "VnSkill";
    }

    @Override
    public String Q() {
        return "闪避突袭";
    }

    @Override
    public String W() {
        return "圣银弩箭";
    }

    @Override
    public String E() {
        return "恶魔审判";
    }

    @Override
    public String R() {
        return "终极时刻";
    }
}
