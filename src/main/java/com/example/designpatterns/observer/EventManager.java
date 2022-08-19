package com.example.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huangquan
 * @date 2022/8/18
 **/
public class EventManager {

    private final List<EventListener> listeners;

    public EventManager(){
        listeners = new ArrayList<>();
    }

    /**
     * 通知所有监听者
     * @param event 事件消息
     */
    public void notifyAll(EventVo event){
        for (EventListener listener : listeners) {
            listener.handleEvent(event);
        }
    }

    public void addListener(EventListener listener){
        listeners.add(listener);
    }

    public void removeListener(EventListener listener){
        listeners.remove(listener);
    }

}
