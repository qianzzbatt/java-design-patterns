package com.example.designpatterns.templatemethod;

import java.util.*;

/**
 * @author huangquan
 * @date 2022/8/15
 **/
public class GameModeTemplate {

    //如何初始化这个？
    private GameMode gameMode;

    //英雄选择列表
    protected List<String> heroList;

    private Map<String,Object> environment = new HashMap<>();

    private void start(GameModeCallBack action){
        //初始化游戏环境
        prepareEnvironment();
        //初始化英雄列表
        initHeroList();
        //创建游戏模式
        action.build(gameMode);
        //启动游戏
        System.out.println("游戏开始！");

    }

    /**
     * 模拟游戏环境
     */
    private final void prepareEnvironment (){
        //游戏唯一id
        String gameId = UUID.randomUUID().toString();
        //玩家列表
        List<String> players = new ArrayList<>();
        environment.put("gemaId",gameId);
        environment.put("players",players);
    }

    /**
     * 初始化英雄列表
     */
    private final void initHeroList (){
        //模拟英雄列表算法
        heroList = new ArrayList<>();
        heroList.add("Ez");
        heroList.add("Vn");
        heroList.add("GayLun");
    }
}
