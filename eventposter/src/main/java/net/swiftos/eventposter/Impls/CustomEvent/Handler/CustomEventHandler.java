package net.swiftos.eventposter.Impls.CustomEvent.Handler;

import net.swiftos.eventposter.Entity.EventAnnoInfo;
import net.swiftos.eventposter.Interface.IEventEntity;
import net.swiftos.eventposter.Interface.IHandler;

/**
 * Created by gy939 on 2016/10/5.
 */
public class CustomEventHandler implements IHandler{
    @Override
    public void init(Object... objects) {

    }

    @Override
    public void destory(Object... objects) {

    }

    @Override
    public IEventEntity parse(EventAnnoInfo annoInfo) {
        return null;
    }

    @Override
    public void load(IEventEntity annoInfo) {

    }

    @Override
    public void unload(IEventEntity annoInfo) {

    }

    @Override
    public void inject(Object object) {

    }

    @Override
    public void remove(Object object) {

    }
}