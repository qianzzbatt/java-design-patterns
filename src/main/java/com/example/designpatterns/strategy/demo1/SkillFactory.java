package com.example.designpatterns.strategy.demo1;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * 策略工厂
 * @author huangquan
 * @date 2022/8/11
 **/
@Component
public class SkillFactory implements InitializingBean, ApplicationContextAware {

    private static final Map<String,Skill> HERO_SKILL_MAP = new HashMap<>();

    private static final String SKILL_SUFFIX = "Skill";

    private ApplicationContext appContext;


    public static Skill getSkill(String hero) {
        return HERO_SKILL_MAP.get(hero+SKILL_SUFFIX);
    }

    @Override
    public void afterPropertiesSet(){
        // 将 Spring 容器中所有的 Skill 注册到 HERO_SKILL_MAP
        appContext.getBeansOfType(Skill.class)
                .values()
                .forEach(skill -> HERO_SKILL_MAP.put(skill.getNo(), skill));
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.appContext = applicationContext;
    }
}
