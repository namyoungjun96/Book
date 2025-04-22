package com.study.pattern.behavioral.observer.original;

import com.study.pattern.behavioral.observer.PromotionService;
import com.study.pattern.behavioral.observer.UserService;

public class UserController {
    private UserService userService;
    private PromotionService promotionService;

    public Long register(String phone, String password) {
        // 입력 매개변수의 인증 코드 생략
        // userService.register() 예외 처리용 try-catch 코드 생략
        long userId = userService.register(phone, password);
        promotionService.issueNewUserExperienceCash(userId);
        return userId;
    }
}
