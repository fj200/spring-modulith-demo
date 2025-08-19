package com.example.demo.notification;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class NotificationService {

    public void createNotification(NotificationDTO notification){
        log.info("Received notification by module dependency for product {} in date {} by {}.",
                notification.productName(),
                notification.date(),
                notification.format());
    }
}
