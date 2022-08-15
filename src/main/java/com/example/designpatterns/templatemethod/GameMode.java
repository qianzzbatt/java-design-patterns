package com.example.designpatterns.templatemethod;

/**
 * @author huangquan
 * @date 2022/8/15
 **/
public interface GameMode {

    /**
     * 禁掉英雄
     */
    void banHero();

    /**
     * 选择英雄
     */
    void pickHero();

    /**
     * 选择天赋
     */
    void chooseTalents();

    /**
     * 选择召唤师技能
     */
    void chooseBaseSkill();

}
