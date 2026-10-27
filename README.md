#  2 — Java

ей проект містить виконання другої лабораторної роботи на Java.

## пис задачі

рограма:
- запитує кількість тварин;
- збирає дані про кожну тварину;
- записує їх у масив об'єктів `Pet`;
- виводить весь список;
- сортує тварин за вагою за допомогою методу Bubble Sort.

## Структура проекту

```text
PetProject/
+-- .gitignore
+-- README.md
+-- src/
¦   +-- lr1/
¦   ¦   +-- Pet.java
¦   ¦   L-- MainLR1.java
¦   L-- lr2/
¦       L-- MainLR2.java
L-- out/
```

## Як запустити

```bash
javac -d out src/lr1/*.java src/lr2/*.java
java -cp out lr2.MainLR2
```

## риклад вводу

```text
3
Max
Dog
3
12.5
Luna
Cat
2
4.0
Rex
Dog
5
20.0
```

## риклад виведення

```text
--- Sorted Pets by Weight (Bubble Sort) ---
Pet[Name: Luna, Species: Cat, Age: 2 y.o., Weight: 4,00 kg]
Pet[Name: Max, Species: Dog, Age: 3 y.o., Weight: 12,50 kg]
Pet[Name: Rex, Species: Dog, Age: 5 y.o., Weight: 20,00 kg]
```
