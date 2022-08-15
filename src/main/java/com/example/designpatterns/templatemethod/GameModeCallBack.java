package com.example.designpatterns.templatemethod;

/**
 * @author huangquan
 * @date 2022/8/15
 **/
public interface GameModeCallBack {

    /**
     * 构建游戏模式
     * @param mode
     */
    void build(GameMode mode);

}
