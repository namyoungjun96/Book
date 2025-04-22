package com.study.pattern.behavioral.observer.imporve;

import com.study.pattern.behavioral.observer.UserService;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    private UserService userService;
    private List<RegObserver> regObservers = new ArrayList<>();

    // 한 번 설정하면 이후 동적으로 수정 불가능
    public void setRegObservers(List<RegObserver> observers) {
        regObservers.addAll(observers);
    }

    public Long register(String phone, String password) {
        // 입력 매개변수의 인증 코드 생략
        // userService.register() 예외 처리용 try-catch 코드 생략
        long userId = userService.register(phone, password);
        for (RegObserver observer: regObservers) {
            observer.handleRegSuccess(userId);
        }
        return userId;
    }
}
