package com.example.designpatterns.observer;

/**
 * @author huangquan
 * @date 2022/8/18
 **/
public class PlayerBListener implements EventListener{

    @Override
    public void handleEvent(EventVo eventVo) {
        System.out.println("玩家B收到消息:"+eventVo.getMessage());
    }

}
