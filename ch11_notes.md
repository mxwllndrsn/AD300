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