package com.example.designpatterns.state.demo2;

import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;

/**
 * @author huangquan
 * @date 2022/8/22
 **/
public class TestApi {

    public static void main(String[] args) {
            String flowId = "100001";
            TaskService.init(flowId, Status.Editing);
            StateHandler stateHandler = new StateHandler();
            Result result = stateHandler.submit(flowId, Status.Editing);
            System.out.println(JSONUtil.toJsonStr(result));
            System.out.println(TaskService.queryActivityStatus(flowId));
    }

}
