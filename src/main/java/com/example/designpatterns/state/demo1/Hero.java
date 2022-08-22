package com.example.designpatterns.state.demo1;

import com.example.designpatterns.strategy.demo1.Skill;

/**
 * @author huangquan
 * @date 2022/8/22
 **/
public class Hero implements Skill {

    /**
     * 英雄名称
     */
    private String name;


    /**
     * 英雄技能状态
     */
    private SkillState skillState;

    public Hero(){
        //默认普通形态
        this.skillState = new NormalState(this);
        //默认英雄
        this.name = "Jayce";
    }

    public SkillState getStatus(){
        return this.skillState;
    }

    public void changeStatus(SkillState skillState){
        this.skillState = skillState;
    }

    /**
     * 用于注册唯一标识
     *
     * @return
     */
    @Override
    public String getNo() {
        return this.name+skillState.getNo();
    }

    @Override
    public String Q() {
        return skillState.Q();
    }

    @Override
    public String W() {
        return skillState.W();
    }

    @Override
    public String E() {
        return skillState.E();
    }

    @Override
    public String R() {
        return skillState.R();
    }

}
