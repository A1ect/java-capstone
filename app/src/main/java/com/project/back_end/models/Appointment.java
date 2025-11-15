package com.project.backend.models.app.src.main.java.com.project.back_end.models;

import java.time.LocalDateTime;

public class Appointment {

    // Поля для сущности "Запись на приём"
    private Long id;
    private Long patientId;    // ID Пациента
    private Long doctorId;     // ID Врача
    private LocalDateTime startTime; // Время начала приема
    private String status;     // Статус (Запланирован, Завершен и т.д.)

    // Конструкторы, геттеры и сеттеры (Getters and Setters)
    // ...
}