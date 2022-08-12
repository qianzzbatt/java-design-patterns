package com.example.designpatterns.strategy;

import lombok.Data;

/**
 * @author huangquan
 * @date 2022/8/11
 **/
@Data
public class RequestParams {

    /**
     * 英雄名称
     */
    private String hero;

    /**
     * 技能名称
     */
    private String skillName;

}
