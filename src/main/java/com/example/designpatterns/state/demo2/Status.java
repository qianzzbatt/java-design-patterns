package com.example.designpatterns.state.demo2;

public enum Status {

    // 1创建编辑、2待审核、3审核中、4审核拒绝(可以撤审到编辑状态)、5审核关闭
    Editing, Check, Pass, Refuse, Finish

}