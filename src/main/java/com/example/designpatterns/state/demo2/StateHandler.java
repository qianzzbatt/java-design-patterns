package com.example.designpatterns.state.demo2;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class StateHandler {

    private Map<Enum<Status>, State> stateMap = new ConcurrentHashMap<Enum<Status>, State>();

    public StateHandler() {
        stateMap.put(Status.Check, new CheckState());     // 待审核
        stateMap.put(Status.Finish, new FinishState());     // 已关闭
        stateMap.put(Status.Editing, new EditingState()); // 编辑中
        stateMap.put(Status.Pass, new PassState());       // 审核通过
        stateMap.put(Status.Refuse, new RefuseState());   // 审核拒绝
    }

    public Result submit(String activityId, Enum<Status> currentStatus) {
        return stateMap.get(currentStatus).submit(activityId, currentStatus);
    }

    public Result checkPass(String activityId, Enum<Status> currentStatus) {
        return stateMap.get(currentStatus).checkPass(activityId, currentStatus);
    }

    public Result checkRefuse(String activityId, Enum<Status> currentStatus) {
        return stateMap.get(currentStatus).checkRefuse(activityId, currentStatus);
    }

    public Result checkRevoke(String activityId, Enum<Status> currentStatus) {
        return stateMap.get(currentStatus).checkRevoke(activityId, currentStatus);
    }

    public Result finish(String activityId, Enum<Status> currentStatus) {
        return stateMap.get(currentStatus).finish(activityId, currentStatus);
    }


}