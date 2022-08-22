package com.example.designpatterns.state.demo2;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TaskService {

    /**
     * 模拟数据库状态
     */
    private static Map<String, Enum<Status>> statusMap = new ConcurrentHashMap<String, Enum<Status>>();

    /**
     * 初始化任务流程
     * @param flowId
     * @param status
     */
    public static void init(String flowId, Enum<Status> status) {
        TaskInfo task = new TaskInfo();
        task.setFlowId(flowId);
        task.setTaskName("请假审批流程");
        task.setStatus(status);
        task.setCreateDate(new Date());
        statusMap.put(flowId, status);
    }


    /**
     * 查询当前状态
     *
     * @param flowId 活动ID
     * @return 查询结果
     */
    public static Enum<Status> queryActivityStatus(String flowId) {
        return statusMap.get(flowId);
    }

    /**
     * 执行状态变更
     *
     * @param flowId   流程ID
     * @param beforeStatus 变更前状态
     * @param afterStatus  变更后状态 b
     */
    public static synchronized void execStatus(String flowId, Enum<Status> beforeStatus, Enum<Status> afterStatus) {
        if (!beforeStatus.equals(statusMap.get(flowId))) return;
        statusMap.put(flowId, afterStatus);
    }

}
