package com.example.designpatterns.observer;

/**
 * @author huangquan
 * @date 2022/8/18
 **/
public class PlayerServiceImpl implements PlayerService{


    private final EventManager eventManager;

    public PlayerServiceImpl(){
        eventManager = new EventManager();
        //注册监听者
        eventManager.addListener(new PlayerAListener());
        eventManager.addListener(new PlayerBListener());
    }

    /**
     * 击杀信息
     */
    @Override
    public void kill() {
        EventVo eventVo = new EventVo("GayLun击杀Ez");
        //击杀敌人
        System.out.println(eventVo.getMessage());
        //将消息通知给玩家A
        //将消息通知给玩家B
        eventManager.notifyAll(eventVo);
    }

}
