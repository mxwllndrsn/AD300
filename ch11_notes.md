Chapter 11 Lists
================

### Linked Lists, Tree Lists, Queues, etc. 

#### Iterators

Classic design pattern for walking through a data structure without having to expose the details of how data is stored in the data structure.

*Collection interface extends the Iterable interface.*

Only one method named ```iterator()```.

A class that implements the Iterable interface can be iterated with the Java *for-each loop*. 

All subtypes of collection interface are iterable. 

```java

ArrayList<String> persons = new ArrayList<>(Arrays.asList("a","b","c"));

for(String person:persons){
	System.out.println(person);
}
```

similar to:

```python
for item in items:
	print(item)
```

Iterators must be declared: 

```java

ArrayList<Integer> lsit = new ArrayList<>(Arrays.asList(1,2,3));
Iterator<Integer> iterator = list.iterator();

while(iterator.hasNext()){
	System.out.println(iterator.next());
}
```

Iterator behavior is similar to scanner objects allowing for object (list) data access without mutation.

### List Iterator

*Iterator specific to list sub interface of entire _Collections_ interface.*

ListIterator allows user to traverse a Collection in both directions:

```java
LinkedList<Integer> list = new LinkedList<Integer>();

// ListIterator of the linkedlist
ListIterator<Integer> listIterator = list.listIterator();
```

Sets
======

#### Sets are represented by Set interface in java.util

_Set_ is implemented by HashSet and TreeSet classes
	
  - HashSet implemented using hash table array - very fast
    - stored in unpredictable order
  - TreeSet implemented using binary trees - search oriented

```java
List<String> list = new ArrayList<String>();

Set<Integer> set = new TreeSet<Integer>();
//empty
Set<String> set2 = new HashSet<String>(list);
```

*See in class exercises.*

Maps
=======

*A dictionary.*

"Marty"->(phoneMAP)->"206-234-9873"
KEY			VALUE

Each key is associated with one value, however multiple keys may point to the same value. 

*AKA associative array, hash*

```java
put(key, value)
// adds a mapping from key to value
get(key)
// returns value associated w/ key
```

#### Maps implemented by HashMap and TreeMap classes

  - HashMap implemented by an array called a hash table
  - TreeMap implemented as a linked binary tree structure
    - keys stored in sorted order

```java
// declaration requires two types (key, value)
Map<String, Integer> votes = new HashMap<String, Integer>();
```
```java
// declare new map
Map<String, Integer> ages = new TreeMap<String, Integer>();

ages.put("Marty", 19);
ages.put("Geneva", 2);
ages.put("Vicki", 57);

// return set of all keys as a set using .keySet()
for (String name : ages.keySet()){
	int age = ages.get(name);
	System.out.println(name + " -> " + age);
}
```