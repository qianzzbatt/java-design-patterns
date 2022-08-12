package com.example.designpatterns.strategy.demo1;

import com.example.designpatterns.strategy.RequestParams;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Method;

/**
 * @author huangquan
 * @date 2022/8/11
 **/
@RestController
@RequestMapping("/strategy")
public class StrategyController {

    @PostMapping("/execute")
    public String executeSkill(@RequestBody RequestParams params) throws Exception {
        //获取英雄所有技能
        Skill heroSkill = SkillFactory.getSkill(params.getHero());
        //释放技能
        Method method = heroSkill.getClass().getMethod(params.getSkillName());
        return params.getHero()+"释放"+method.invoke(heroSkill).toString()+"技能";
    }
}
