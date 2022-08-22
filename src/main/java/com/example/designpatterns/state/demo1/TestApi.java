package com.example.designpatterns.state.demo1;

import org.springframework.http.codec.cbor.Jackson2CborDecoder;

/**
 * @author huangquan
 * @date 2022/8/22
 **/
public class TestApi {

    public static void main(String[] args) {
        Hero Jayce = new Hero();

        //模拟杰斯连招 炮形态：QEW + 锤形态：Q+W+E
        System.out.println(Jayce.Q());
        System.out.println(Jayce.E());
        System.out.println(Jayce.W());
        System.out.println(Jayce.R());
        System.out.println(Jayce.Q());
        System.out.println(Jayce.W());
        System.out.println(Jayce.E());

    }
}
