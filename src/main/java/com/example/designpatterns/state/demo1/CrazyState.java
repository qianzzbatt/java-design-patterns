package com.example.designpatterns.state.demo1;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author huangquan
 * @date 2022/8/22
 **/
@AllArgsConstructor
@NoArgsConstructor
public class CrazyState implements SkillState{

    private Hero hero;

    /**
     * 用于注册唯一标识
     *
     * @return
     */
    @Override
    public String getNo() {
        return "CrazyState";
    }

    @Override
    public String Q() {
        return "苍穹之跃";
    }

    @Override
    public String W() {
        return "闪电领域";
    }

    @Override
    public String E() {
        return "雷霆一击加";
    }

    @Override
    public String R() {
        //切换状态
        hero.changeStatus(new NormalState(hero));
        return "墨丘利之锤切换至墨丘利之炮";
    }
}
