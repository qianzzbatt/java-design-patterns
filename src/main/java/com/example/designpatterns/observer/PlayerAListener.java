package com.example.designpatterns.observer;

/**
 * @author huangquan
 * @date 2022/8/18
 **/
public class PlayerAListener implements EventListener{

    @Override
    public void handleEvent(EventVo eventVo) {
        System.out.println("玩家A收到消息："+eventVo.getMessage());
    }
}
