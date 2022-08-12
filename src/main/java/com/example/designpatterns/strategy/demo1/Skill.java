package com.example.designpatterns.strategy.demo1;

/**
 * 英雄技能接口
 * @author huangquan
 * @date 2022/8/11
 **/
public interface Skill {

    /**
     * 用于注册唯一标识
     * @return
     */
    String getNo();

    String Q();

    String W();

    String E();

    String R();

}
