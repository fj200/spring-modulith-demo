package com.example.demo.notification;

import com.example.demo.notification.internal.NotificationType;

import java.util.Date;

public record NotificationDTO(Date date, String format, String productName) {
}
