package com.example.designpatterns.state.demo2;

public abstract class State {

    /**
     * 提交审核
     *
     * @param flowId    流程ID
     * @param currentStatus 当前状态
     * @return 执行结果
     */
    public abstract Result submit(String flowId, Enum<Status> currentStatus);

    /**
     * 审核通过
     *
     * @param flowId    流程ID
     * @param currentStatus 当前状态
     * @return 执行结果
     */
    public abstract Result checkPass(String flowId, Enum<Status> currentStatus);

    /**
     * 审核拒绝
     *
     * @param flowId    流程ID
     * @param currentStatus 当前状态
     * @return 执行结果
     */
    public abstract Result checkRefuse(String flowId, Enum<Status> currentStatus);

    /**
     * 撤审撤销
     *
     * @param flowId    流程ID
     * @param currentStatus 当前状态
     * @return 执行结果
     */
    public abstract Result checkRevoke(String flowId, Enum<Status> currentStatus);

    /**
     * 审核完成
     *
     * @param flowId    流程ID
     * @param currentStatus 当前状态
     * @return 执行结果
     */
    public abstract Result finish(String flowId, Enum<Status> currentStatus);

}
 