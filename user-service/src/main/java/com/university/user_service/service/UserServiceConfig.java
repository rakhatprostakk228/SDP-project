package com.university.user_service.service;

public class UserServiceConfig {

    // Приватное статическое поле, содержащее единственный экземпляр класса
    private static UserServiceConfig instance;

    // Приватный конструктор предотвращает создание экземпляров извне
    private UserServiceConfig() {
        // Инициализация конфигураций (если необходимо)
    }

    // Публичный статический метод для доступа к единственному экземпляру
    public static synchronized UserServiceConfig getInstance() {
        if (instance == null) {
            instance = new UserServiceConfig();
        }
        return instance;
    }

    // Методы для работы с конфигурацией
    public void loadConfig() {
        System.out.println("Загрузка конфигурации User Service...");
    }
}