Array Lists
===========

### Collections
An object that stores data (data structure)

  - stored objects are *elements*
  - some collections feature ordering and duplicates
  - operations include: *add, remove, clear, contains(search), size*

#### examples:

  - ArrayList
  - LinkedList
  - HashMap
  - TreeSet
  - PriorityQueue

_All collections featured in java.util_

```java
import java.util.*;
```

#### Array list is a dynamically sized array object

Standard arrays are declared with an explicit size.

#### Dynamic conditions

```java
//condition changes w/ operation
for(int i = 0; i<list.size(); i++){
	list.remove(i);
}
//as items removed, list.size() reduces, i increments
//resulting in removal of every other element
```



