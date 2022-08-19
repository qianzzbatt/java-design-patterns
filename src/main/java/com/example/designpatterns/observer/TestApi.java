package com.example.designpatterns.observer;

/**
 * @author huangquan
 * @date 2022/8/18
 **/
public class TestApi {

    public static void main(String[] args) {
        PlayerService playerService = new PlayerServiceImpl();
        playerService.kill();
    }

}
