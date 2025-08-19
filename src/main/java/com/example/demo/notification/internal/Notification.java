package com.example.demo.notification.internal;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Notification {
    private Date date;
    private NotificationType format;
    private String productName;
}
