## OOP's Assignment

Problem:
- Define a class named Person and mix it with Ordered Trait to do the comparison.
- First, check if the name parameter of both objects is equal.
- If yes, then do the comparison according to age.
- If name is not equal then do the comparison based on length.

``` scala 
class Person(val name: String, val age: Int) extends Ordered[Person]{
}
```

For example:

Input:
``` scala 
personOne = new Person("Test", 24)
personTwo = new Person("Test", 25)
personOne < personOne
Output: true
``` 

Input: 
``` scala 
personOne = new Person("TestAgain", 24)
personTwo = new Person("Test", 25)
personOne < personOne
Output: false
``` 
