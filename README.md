# ЛР 1 — Java

Цей проект містить просту Java-програму для роботи з класом `Pet`.

## Опис задачі

Програма запитує у користувача дані про домашню тварину:
- ім'я;
- вид;
- вік;
- вагу.

Після цього створюється об'єкт `Pet`, виводиться інформація про нього та розраховується добова норма їжі:

`dailyFood = weight * 25`

## Структура проекту

```text
PetProject/
├── .gitignore
├── README.md
└── src/
    └── lr1/
        ├── Pet.java
        └── MainLR1.java
```

## Як запустити

### 1. Компіляція

```bash
javac -d out src/lr1/*.java
```

### 2. Запуск

```bash
java -cp out lr1.MainLR1
```

## Приклад введення

```text
Enter pet name: Max
Enter pet species: Dog
Enter pet age (years): 3
Enter pet weight (kg): 12.5
```

## Приклад виведення

```text
--- Pet Info ---
Pet[Name: Max, Species: Dog, Age: 3 y.o., Weight: 12,50 kg]
Estimated daily food intake: 312,50 grams
```

## Автор

ЛР 1 — Java
