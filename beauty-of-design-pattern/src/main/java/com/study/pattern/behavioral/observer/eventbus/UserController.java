package com.study.pattern.behavioral.observer.eventbus;

import com.study.pattern.behavioral.observer.UserService;

import java.util.List;

public class UserController {
    private UserService userService;
    private EventBus eventBus;
    private static final int DEFAULT_EVENTBUS_THREAD_POOL_SIZE = 20;

    public UserController() {
        // eventBus = new EventBus();       // 동기식 차단 옵저버 패턴
        eventBus = new AsyncEventBus
                (Executors.nexFixedThreadPool(DEFAULT_EVENTBUS_THREAD_POOL_SIZE));
        // 비동기식 비차단 옵저버 패턴
    }

    // 한 번 설정하면 이후 동적으로 수정 불가능
    public void setRegObservers(List<Object> observers) {
        for (Object observer: observers) {
            eventBus.register(observer);
        }
    }

    public Long register(String phone, String password) {
        // 입력 매개변수의 인증 코드 생략
        // userService.register() 예외 처리용 try-catch 코드 생략
        long userId = userService.register(phone, password);
        eventBus.post(userId);
        return userId;
    }
}
