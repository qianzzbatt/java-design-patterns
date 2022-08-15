package com.example.designpatterns.templatemethod;

/**
 * @author huangquan
 * @date 2022/8/15
 **/
public class TestApi {

    public static void main(String[] args) {
        NormalBlindPickProcessAbstract playerA = new PlayerA();
        playerA.gameStart();
        NormalBlindPickProcessAbstract playerB = new PlayerB();
        playerB.gameStart();
    }

}
