# Ylab University Core
## Homework
### Lesson 1
1) Task 1.\
   Заполните двумерный массив случайными числами и выведите максимальное, минимальное и среднее значение.
2) Task 2.\
   Отсортируйте массив [5, 6, 3, 2, 5, 1, 4, 9].
* Задача со звездочкой: написать простые тесты.
* Задача со звездочкой: учесть дубликаты в массиве 2 задачи\
(Надо сделать так, чтобы алгоритм работал правильно с дублями).
### Lesson 2
1) Task 1.\
   Убрать дубликаты, отсортировать по идентификатору, сгруппировать по имени.\
   Input (raw data):
   ```
   0 - Harry
   0 - Harry
   1 - Harry
   2 - Harry
   3 - Emily
   4 - Jack
   4 - Jack
   5 - Amelia
   5 - Amelia
   6 - Amelia
   7 - Amelia
   8 - Amelia
   ```
   Output:
   ```
   Key: Amelia
   Value:4
   Key: Emily
   Value:1
   Key: Harry
   Value:3
   Key: Jack
   Value:1
   ```
2) Task 2.\
   Вывести пару именно в скобках, которые дают сумму - 10.\
   Input:
   ```
   [3, 4, 2, 7]
   10
   ```
   Output:
   ```
   [3, 7]
   ```
3) Task 3.\
   Реализовать функцию нечеткого поиска fuzzySearch("String", "String").\
   Example 1.\
   Input:
   ```
   car
   ca6$$#_rtwheel
   ```
   Output:
   ```
   true
   ```
   Example 2.\
   Input:
   ```
   cwhl
   cartwheel
   ```
   Output:
   ```
   true
   ```
   Example 3.\
   Input:
   ```
   cwhee
   cartwheel
   ```
   Output:
   ```
   true
   ```
   Example 4.\
   Input:
   ```
   cartwheel
   cartwheel
   ```
   Output:
   ```
   true
   ```
   Example 5.\
   Input:
   ```
   cwheeel
   cartwheel
   ```
   Output:
   ```
   false
   ```
   Example 6.\
   Input:
   ```
   lw
   cartwheel
   ```
   Output:
   ```
   false
   ```