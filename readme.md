
  

# 🌌 Астрологический справочник

  

  

Мобильное приложение для астрологии, нумерологии и анализа лунных циклов. Генерирует персонализированные гороскопы, натальные карты и расчёты совместимости.

  

  

## ✨ Возможности

  

  

- 📅 Ежедневные/ежемесячные гороскопы

  

  

- 🌙 Прогнозы по фазам Луны

  

  

- 🔢 Нумерологический анализ

  

  

- 💑 Совместимость знаков зодиака

  

  

- 🗺️ Построение натальных карт

  

  

## ⚙️ Установка

  

  

### Серверная часть

  

  

```bash

  

  

git  clone  https://github.com/ваш-репозиторий/астрологический-справочник

  

  

cd  server

  

  

./gradlew  run

  

  

```

  

### Мобильное приложение

  

  

1. Скачайте `.apk` из [Releases](https://github.com/mifoxti)

  

2. Установите на Android ≥ 8.0

  

  

## 📡 API

  

  

### Получить гороскоп

  

  

```http

  

GET /api/horoscope/daily?sign=aries&date=2024-05-20

  

```

  

### Совместимость

  

```http

POST /api/compatibility

Body: {"sign1": "taurus", "sign2": "scorpio"}

```
## 🛠️ Зависимости

```http
// Сервер
implementation("io.ktor:ktor-server-core:2.3.0")
implementation("io.ktor:ktor-serialization-json:2.3.0")

// Клиент
implementation("com.squareup.retrofit2:retrofit:2.9.0")
```
## 🧪 Тестирование
```http
./gradlew test
```
## 📜 Лицензия
```text
MIT License
Copyright (c) 2025 RTU MIREA & DaTiOlIl Team
```
## 🤝 Контрибьютинг
1.  Форкните репозиторий
    
2.  Создайте ветку:  `git checkout -b feature/new-feature`
    
3.  Запушьте:  `git push origin feature/new-feature`
    
4.  Откройте Pull Request
    

## 📩 Контакты

-   **Тимофей**:  [@mifoxti](https://github.com/mifoxti)  |  [microfoxti@gmail.com](https://microfoxti@gmail.com/)
    
-   **Дарья**:  [@abbdora](https://github.com/https://github.com/abbdora)  |  [dabarenova@gmail.com](https://mailto:dabarenova@gmail.com/)
    
-   **Илья**:  [@msnthr0pe](https://github.com/@msnthr0pe)  |  [msnthr0pe@gmail.com](https://mailto:msnthr0pe@gmail.com/)
    
-   **Олег**:  [@Pro100_KoFi](https://github.com/Pro100_KoFi)  |  [pro100_kofi@gmail.com](https://mailto:pro100_kofi@gmail.com/)

![Kotlin](https://img.shields.io/badge/Kotlin-3.4.0-blue)  
![License](https://img.shields.io/badge/License-MIT-green)