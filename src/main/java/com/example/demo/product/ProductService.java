package com.example.demo.product;

import com.example.demo.notification.NotificationDTO;
import com.example.demo.notification.NotificationService;
import com.example.demo.product.internal.Product;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ProductService {
    private final NotificationService notificationService;
    private final ApplicationEventPublisher events;

    public ProductService(ApplicationEventPublisher events, NotificationService notificationService){
        this.events = events;
        this.notificationService = notificationService;
    }

    public void create(Product product){
        notificationService.createNotification(new NotificationDTO(new Date(), "SMS", product.getName()));
    }


}
