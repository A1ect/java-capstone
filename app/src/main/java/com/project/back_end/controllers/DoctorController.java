package com.project.backend.models.app.src.main.java.com.project.back_end.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// Импорт других необходимых классов (DoctorService, Doctor)

@RestController
@RequestMapping("/api/doctors") // Базовый URL для всех методов в этом контроллере
public class DoctorController {

    // private final DoctorService doctorService; // Ссылка на сервис

    // Метод для получения списка всех врачей
    @GetMapping
    public String getAllDoctors() {
        // Здесь должен быть код для вызова сервиса и возврата данных
        return "List of all doctors";
    }

    // Здесь могут быть другие методы: @PostMapping, @PutMapping и т.д.
}