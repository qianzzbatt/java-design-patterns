package com.example.designpatterns.strategy.demo1;

/**
 * @author huangquan
 * @date 2022/8/11
 **/
public class TestApi {

    public static void main(String[] args) {
        SkillContext skillContext = new SkillContext(new GayLunSkill());
        //盖伦释放Q技能
        System.out.println(skillContext.Q());
        //切换成Vn
        skillContext.changeSkill(new VnSkill());
        //Vn释放Q技能
        System.out.println(skillContext.Q());
    }

}
