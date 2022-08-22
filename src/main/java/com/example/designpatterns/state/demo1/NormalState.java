package com.example.designpatterns.state.demo1;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author huangquan
 * @date 2022/8/22
 **/
@AllArgsConstructor
@NoArgsConstructor
public class NormalState implements SkillState{

    private Hero hero;

    /**
     * 用于注册唯一标识
     *
     * @return
     */
    @Override
    public String getNo() {
        return "NormalState";
    }

    @Override
    public String Q() {
        return "电能震荡";
    }

    @Override
    public String W() {
        return "超能电荷";
    }

    @Override
    public String E() {
        return "速之门";
    }

    @Override
    public String R() {
        hero.changeStatus(new CrazyState(hero));
        return "墨丘利之炮切换至墨丘利之锤";
    }
}
