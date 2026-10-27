#  4 — Java

я лабораторна робота демонструє патерн Strategy.

## пис задачі

отрібно реалізувати механізм вибору способу годування тварини без прив'язки до конкретного класу.

## сновні елементи

- `FeedingStrategy` — інтерфейс зі стратегією годування.
- `DryFoodFeeding` — конкретна реалізація стратегії.
- `MainLR4` — демонстрація роботи патерна.

## Як запустити

```bash
javac -d out src/lr4/*.java
java -cp out lr4.MainLR4
```

## риклад виведення

```text
--- Strategy Pattern Demo ---
Cleaning bowl before feeding...
Dispensing 100g of dry kibble food.
```
