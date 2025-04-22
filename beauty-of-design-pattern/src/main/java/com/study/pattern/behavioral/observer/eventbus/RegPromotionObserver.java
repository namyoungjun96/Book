package com.study.pattern.behavioral.observer.eventbus;

import com.study.pattern.behavioral.observer.PromotionService;

public class RegPromotionObserver implements RegObserver {
    private PromotionService promotionService;

    @Override
    public void handleRegSuccess(long userId) {
        promotionService.issueNewUserExperienceCash(userId);
    }
}
