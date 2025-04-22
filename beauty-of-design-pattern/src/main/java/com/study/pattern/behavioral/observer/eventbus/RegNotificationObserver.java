package com.study.pattern.behavioral.observer.eventbus;

import com.study.pattern.behavioral.observer.NotificationService;

public class RegNotificationObserver implements RegObserver {
    private NotificationService notificationService;

    @Override
    public void handleRegSuccess(long userId) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                notificationService.sendInboxMessage(userId, "Welcome...");
            }
        });
        thread.start();
    }
}
