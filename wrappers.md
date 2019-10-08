Wrapper Classes
===============

#### Allow for the use of primitive data types in operations requiring objects

```java
int -> Integer
double -> Double
char -> Character
boolean -> Boolean

//example
//once list is constructed using wrapper classes, may use primitives as normal

ArrayList<Double> grades = new ArrayList<Double>();
grades.add(3.2);
//etc.
```

_Boxing_: Converting a primitive to a wrapper object, reverse is called *unboxing*. 

```java
Integer[] intArray = {new Integer(2), ...};
//equivalent to
Integer[] intArray = {2, ...};
```

### Generic Type

*ArrayList is known as generic class with type 'E'*

You may specify a *concrete object type* to replace E when creating ArrayList<object>.