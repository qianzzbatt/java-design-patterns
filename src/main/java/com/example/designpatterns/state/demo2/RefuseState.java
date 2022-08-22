package com.example.designpatterns.state.demo2;

/**
 * 审核不通过
 * @author huangquan
 * @date 2022/8/22
 **/
public class RefuseState extends State{
    /**
     * 提交审核
     *
     * @param flowId        流程ID
     * @param currentStatus 当前状态
     * @return 执行结果
     */
    @Override
    public Result submit(String flowId, Enum<Status> currentStatus) {
        return new Result("0001","已审核状态不可重复提交！");
    }

    /**
     * 审核通过
     *
     * @param flowId        流程ID
     * @param currentStatus 当前状态
     * @return 执行结果
     */
    @Override
    public Result checkPass(String flowId, Enum<Status> currentStatus) {
        return new Result("0001", "已审核状态不可重复审核");
    }

    /**
     * 审核不通过
     *
     * @param flowId        流程ID
     * @param currentStatus 当前状态
     * @return 执行结果
     */
    @Override
    public Result checkRefuse(String flowId, Enum<Status> currentStatus) {
        return new Result("0001", "已审核状态不可重复审核");
    }

    /**
     * 撤审撤销
     *  退回到编辑状态
     * @param flowId        流程ID
     * @param currentStatus 当前状态
     * @return 执行结果
     */
    @Override
    public Result checkRevoke(String flowId, Enum<Status> currentStatus) {
        TaskService.execStatus(flowId, currentStatus, Status.Editing);
        return new Result("0000","审核撤回到编辑状态");
    }

    /**
     * 审核完成
     *
     * @param flowId        流程ID
     * @param currentStatus 当前状态
     * @return 执行结果
     */
    @Override
    public Result finish(String flowId, Enum<Status> currentStatus) {
        return new Result("0001", "审核中不可完成审核");
    }
}
