package com.project.backend.models;

// Импорт необходимых библиотек (например, для JPA или Lombok)

public class Doctor {

    // Поля для сущности "Врач"
    private Long id;
    private String firstName;
    private String lastName;
    private String specialty; // Специальность врача

    // Конструкторы
    public Doctor() {}

    public Doctor(Long id, String firstName, String lastName, String specialty) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
    }

    // Геттеры и сеттеры (Getters and Setters)
    // ... (код геттеров/сеттеров)
}
