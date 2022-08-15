package com.example.designpatterns.templatemethod;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author huangquan
 * @date 2022/8/15
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class PlayerA extends NormalBlindPickProcessAbstract{

    private String hero;

    @Override
    protected void pickHero() {
        //模拟选择英雄
        this.hero = heroList.get(0);
        System.out.println("玩家A选择英雄："+hero);
    }

    @Override
    protected void chooseTalents() {
        System.out.println("玩家A选择主宰符文！");
    }

    @Override
    protected void chooseBaseSkill() {
        System.out.println("玩家A选择闪现和和点燃");
    }
}
