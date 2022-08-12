package com.example.designpatterns.strategy.demo1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author huangquan
 * @date 2022/8/11
 **/

@Component
public class EzSkill implements Skill{


    /**
     * 用于注册唯一标识
     *
     * @return
     */
    @Override
    public String getNo() {
        return "EzSkill";
    }

    @Override
    public String Q() {
        return "秘术射击";
    }

    @Override
    public String W() {
        return "精华跃动";
    }

    @Override
    public String E() {
        return "奥术跃迁";
    }

    @Override
    public String R() {
        return "精准弹幕";
    }
}
