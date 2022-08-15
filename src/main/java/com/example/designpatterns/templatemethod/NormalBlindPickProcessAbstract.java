package com.example.designpatterns.templatemethod;

import java.util.*;

/**
 * 模拟匹配模式流程
 * @author huangquan
 * @date 2022/8/15
 **/
public abstract class NormalBlindPickProcessAbstract {

    //英雄选择列表
    protected List<String> heroList;

    private Map<String,Object> environment = new HashMap<>();

    public void gameStart() {

        //初始化游戏环境
        prepareEnvironment();
        //初始化英雄列表
        initHeroList();
        //选择英雄
        pickHero();
        //选择符文
        chooseTalents();
        //选择召唤师技能
        chooseBaseSkill();
        //启动游戏
        System.out.println("游戏开始！");
    }


    protected abstract void pickHero();
    protected abstract void chooseTalents();
    protected abstract void chooseBaseSkill();

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
