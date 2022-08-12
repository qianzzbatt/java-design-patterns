package com.example.designpatterns.strategy.demo1;

/**
 * 技能上下文
 * @author huangquan
 * @date 2022/8/11
 **/
public class SkillContext {

    private Skill skill;

    public SkillContext(Skill skill) {
        this.skill = skill;
    }

    public void changeSkill(Skill skill) {
        this.skill = skill;
    }

    public String Q() {
        return skill.Q();
    }

    public String W() {
        return skill.W();
    }

    public String E() {
        return skill.E();
    }

    public String R() {
        return skill.R();
    }

}
