package com.example.designpatterns.state.demo2;

import lombok.Data;

import java.util.Date;

/**
 * @author huangquan
 * @date 2022/8/22
 **/
@Data
public class TaskInfo {

    private String taskName;

    private String flowId;

    private Enum<Status> status;

    private Date createDate;

}
