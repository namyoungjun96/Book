package com.study.pattern.behavioral.observer.eventbus;

import com.google.common.eventbus.Subscribe;
import com.study.pattern.behavioral.observer.PromotionService;

public class RegPromotionObserver implements RegObserver {
    private PromotionService promotionService;

    @Subscribe
    public void handleRegSuccess(long userId) {
        promotionService.issueNewUserExperienceCash(userId);
    }
}
