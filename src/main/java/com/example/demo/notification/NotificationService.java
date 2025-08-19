package com.example.demo.notification;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.modulith.events.ApplicationModuleListener;

@Slf4j
@Service
public class NotificationService {

    @ApplicationModuleListener
    public void notificationEvent(NotificationDTO notification) {
        log.info("Received notification by event for product {} in date {} by {}.",
                notification.productName(),
                notification.date(),
                notification.format());
    }
}
