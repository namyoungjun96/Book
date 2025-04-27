package com.study.pattern.behavioral.observer.eventbus;

import com.google.common.eventbus.Subscribe;
import com.study.pattern.behavioral.observer.NotificationService;

public class RegNotificationObserver implements RegObserver {
    private NotificationService notificationService;

    @Subscribe
    public void handleRegSuccess(long userId) {
        notificationService.sendInboxMessage(userId, "Welcome...");
    }
}
