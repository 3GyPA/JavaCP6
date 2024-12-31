# Робота з колекціями в мові програмування Java

## Опис

Цей проект демонструє використання стандартних та власних колекцій в мові програмування Java. Основним завданням є реалізація однозв'язного списку (Singly Linked List) для зберігання об'єктів типу `MusicComposition` та його підкласів (наприклад, `RockComposition` і `ClassicalComposition`).

Колекція реалізує інтерфейс `MyList` та містить методи для додавання елементів, видалення, доступу до елементів за індексом, а також виведення всіх елементів списку. Проект також включає документацію у форматі Javadoc, що пояснює використання кожного методу та класу.

## Структура проекту

1. **MyList.java** — Інтерфейс для визначення основних операцій колекції (додавання елементів, отримання за індексом, видалення елементів).
2. **SinglyLinkedList.java** — Клас, що реалізує інтерфейс `MyList` і використовує однозв'язний список для зберігання елементів.
3. **MusicComposition.java** — Абстрактний клас для музичних композицій, з основними властивостями, такими як назва та тривалість.
4. **RockComposition.java** — Клас для опису рок-композиції.
5. **ClassicalComposition.java** — Клас для опису класичної композиції.
6. **Main.java** — Головний клас для демонстрації роботи з колекцією: створення та додавання елементів, виведення інформації.

## Інструкції по використанню

1. Клонування репозиторію:
   ```bash
   git clone https://github.com/user/javacp6.git
