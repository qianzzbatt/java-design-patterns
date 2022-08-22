package com.example.designpatterns.state.demo2;

/**
 * 编辑状态
 */
public class EditingState extends State {

    @Override
    public Result submit(String flowId, Enum<Status> currentStatus) {
        TaskService.execStatus(flowId, currentStatus, Status.Check);
        return new Result("0000", "任务提交成功!");
    }

    public Result checkPass(String activityId, Enum<Status> currentStatus) {
        return new Result("0001", "编辑中不可审核通过");
    }

    public Result checkRefuse(String activityId, Enum<Status> currentStatus) {
        return new Result("0001", "编辑中不可审核拒绝");
    }

    @Override
    public Result checkRevoke(String activityId, Enum<Status> currentStatus) {
        return new Result("0001", "编辑中不可撤销审核");
    }

    @Override
    public Result finish(String flowId, Enum<Status> currentStatus) {
         return new Result("0001", "编辑中不可完成审核");
    }
}
