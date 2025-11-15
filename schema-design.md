# Проект схемы базы данных (MySQL)

Схема разработана для поддержки пользовательских историй Врача, Пациента и Администратора.

## Таблица `Roles`
* **Назначение:** Хранение ролей пользователей.

| Поле | Тип данных | Ограничения | Описание |
| :--- | :--- | :--- | :--- |
| `role_id` | INT | PRIMARY KEY, AUTO_INCREMENT | Уникальный ID роли. |
| `name` | VARCHAR(50) | NOT NULL, UNIQUE | Название роли (e.g., 'Врач', 'Пациент'). |

## Таблица `Users`
* **Назначение:** Хранение общих учетных данных.

| Поле | Тип данных | Ограничения | Описание |
| :--- | :--- | :--- | :--- |
| `user_id` | INT | PRIMARY KEY, AUTO_INCREMENT | Уникальный ID пользователя. |
| `role_id` | INT | FOREIGN KEY (Roles) | Роль пользователя. |
| `username` | VARCHAR(100) | NOT NULL, UNIQUE | Логин для входа. |
| `password_hash` | VARCHAR(255) | NOT NULL | Хеш пароля. |
| `full_name` | VARCHAR(255) | NOT NULL | Полное имя пользователя. |

## Таблица `Appointments`
* **Назначение:** Хранение данных о запланированных приемах.

| Поле | Тип данных | Ограничения | Описание |
| :--- | :--- | :--- | :--- |
| `appointment_id` | INT | PRIMARY KEY, AUTO_INCREMENT | ID приема. |
| `patient_id` | INT | FOREIGN KEY (Users) | ID пациента. |
| `doctor_id` | INT | FOREIGN KEY (Users) | ID врача. |
| `start_time` | DATETIME | NOT NULL | Время начала приема. |
| `status` | ENUM | NOT NULL | Статус ('Запланирован', 'Завершен', 'Отменен'). |
