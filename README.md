# Ylab University - Java Core

## Lesson 1
1) Task 1.\
   Fill a 2D array with random numbers and find max, min and average value.
2) Task 2.\
   Sort the array: [5, 6, 3, 2, 5, 1, 4, 9].
* Extra task: write simple tests.
* Extra task: take into account duplicates in the array of task 2.\
(An algorithm must work correctly with duplicates).

## Lesson 2
1) Task 1.\
   Remove duplicates, sort by ID, group by name.\
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
   Print a pair (in brackets) from the array whose sum is equal to the given number.\
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
   Implement a fuzzy search function: fuzzySearch("String", "String").\
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
