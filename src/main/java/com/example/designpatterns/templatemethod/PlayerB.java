package com.example.designpatterns.templatemethod;

import lombok.Data;

/**
 * @author huangquan
 * @date 2022/8/15
 **/
@Data
public class PlayerB extends NormalBlindPickProcessAbstract{

    private String hero;

    @Override
    protected void pickHero() {
        //选择Ez
        this.hero = heroList.get(2);
        System.out.println("玩家B选择英雄："+hero);
    }

    @Override
    protected void chooseTalents() {
        System.out.println("玩家B选择精密符文！");
    }

    @Override
    protected void chooseBaseSkill() {
        System.out.println("玩家B选择治疗和闪现");
    }
}
