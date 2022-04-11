# 3. Nonogram row

This is an exercise number 3 from exam conducted after 1st month of Scala Academy at [Adform](https://github.com/adform).

### Task description
A binary array is an array consisting of only the values `0` and `1`. Given a binary array of any length, return an array of positive integers that represent the lengths of the sets of consecutive 1's in the input array, in order from left to right.
```
nonogramrow([]) => []
nonogramrow([0,0,0,0,0]) => []
nonogramrow([1,1,1,1,1]) => [5]
nonogramrow([0,1,1,1,1,1,0,1,1,1,1]) => [5,4]
nonogramrow([1,1,0,1,0,0,1,1,1,0,0]) => [2,1,3]
nonogramrow([0,0,0,0,1,1,0,0,1,0,1,1,1]) => [2,1,3]
nonogramrow([1,0,1,0,1,0,1,0,1,0,1,0,1,0,1]) => [1,1,1,1,1,1,1,1]
```
Description adapted from: [source](https://www.reddit.com/r/dailyprogrammer/comments/o4uyzl/20210621_challenge_395_easy_nonogram_row/)

---
### Table of contents
##### Scala Coding Problems
1. [Letter value sum](https://github.com/rafalkac02/adform-scala-academy-exam0-exercise-1)
2. [Isogram](https://github.com/rafalkac02/adform-scala-academy-exam0-exercise-2)
3. [Nonogram row](https://github.com/rafalkac02/adform-scala-academy-exam0-exercise-3)
4. [Hamming](https://github.com/rafalkac02/adform-scala-academy-exam0-exercise-4)
5. [Robot Simulator](https://github.com/rafalkac02/adform-scala-academy-exam0-exercise-5)

##### Extra Scala Coding Challenges
1. [Pascals Triangle](https://github.com/rafalkac02/adform-scala-academy-exam0-extra-1)
2. [Matching Brackets](https://github.com/rafalkac02/adform-scala-academy-exam0-extra-2)
3. [Spiral Ascension](https://github.com/rafalkac02/adform-scala-academy-exam0-extra-3)