package com.study.pattern.behavioral.observer.imporve;

import com.study.pattern.behavioral.observer.PromotionService;

public class RegPromotionObserver implements RegObserver {
    private PromotionService promotionService;

    @Override
    public void handleRegSuccess(long userId) {
        promotionService.issueNewUserExperienceCash(userId);
    }
}
