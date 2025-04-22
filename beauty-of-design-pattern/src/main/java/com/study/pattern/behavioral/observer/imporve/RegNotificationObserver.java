package com.study.pattern.behavioral.observer.imporve;

import com.study.pattern.behavioral.observer.NotificationService;

public class RegNotificationObserver implements RegObserver {
    private NotificationService notificationService;

    @Override
    public void handleRegSuccess(long userId) {
        notificationService.sendInboxMessage(userId, "Welcome...");
    }
}
