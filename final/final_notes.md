//final_notes.md

##### ArrayIntListIterator Implementation

*Iterators* keep track of a particular position in a structure. 3 Methods:

  - `hasNext()` returns true if more elements remain
  - `next()` returns next element 
  - `remove()` removes element recently returned by next

*Its a separate class:*

```java
import java.util.*; // required for exceptions

public class ArrayIntListIterator {
	private ArrayIntList list; // list structure
	private int position; 
	private boolean removeOK; 

	public ArrayIntListIterator(ArrayIntList list){
		this.list = list;
		position = 0;
		removeOK = false;
	}
	public boolean hasNext(){
		return position < list.size();
	}
	public int next() {
		if(!hasNext()){
			throw new NoSuchElementException();
		}
		int result = list.get(position);
		position++;
		removeOK = true;
	}
	public void remove(){
		if(!removeOK)
			throw new IllegalStateException("bad man");	
		list.remove(position-1);
		position--;
		removeOK = false;
	}
}
```

##### Selection Sort
*Runtime: O(N^2)*

```java
public static void selectionSort(int[] list){

	for(int i=0; i< list.length; i++){
		int currentMin = list[i];
		int currentMinIndex = i;

		for(int j=i+1; j < list.length; j++){
			if(currentMin > list[j]){
				currentMin = list[j];
				currentMinIndex = j;
			}
		}

		if(currentMinIndex != i){
			list[currentMinIndex] = list[i];
			list[i] = currentMin;
		}
	}
}
```

##### Binary Search
*Runtime: O(Log N)*

```java
public static int binarySearchR(int[] list, int key){
	return binarySearchR(list, key, 0, list.length-1);
}
public static int binarySearchR(int[] list, int key, int low, int high){
	if(low>high)
		return -low-1;
	else{
		int mid=(low+high)/2;
		if(key==list[mid])
			return mid;
		else if(key>list[mid]){
			low=mid+1;
			return binarySearchR(list, key, low, high);
		} else {
			high=mid-1;
			return binarySearchR(list, key, low, high);
		}
	}
}
```

##### ListNode

```java
public class ListNode{
	int data;
	ListNode next;
	// default constructor in use

	// supplied constructors
	public ListNode(){
		this(0, null);
	}
	public ListNode(int data){
		this(data, null);
	}
	public ListNode(int data, ListNode next){
		this.data = data;
		this.next = next;
	}
}
```
##### LinkedIntList

```java
public class LinkedIntList implements IntList{
	private ListNode head;

	// constructor	
	public LinkedIntList(){
		head = null;
	}
	public void add(int value){
		if(head==null)
			head = new ListNode(value);
		else {
			ListNode curr = head;
			// traverse to end
			while(curr.next!=null){
				curr = curr.next;
			}
			// add node at end 
			curr.next = new ListNode(value);
		}	
	}
	public void remove(int index){
		if(index==0)
			head=head.next;
		else {
			ListNode curr = head;
			for(int i=0; i<index-1; i++)
				curr = curr.next;
			curr.next = curr.next.next;
		}
	}
}
```

###### Binary Tree

```java 
public class IntTreeNode {
    public int data;     
    public IntTreeNode left; 
    public IntTreeNode right;  
        
    // Constructs a leaf node with the given data.
    public IntTreeNode(int data) {
        this(data, null, null);
    }
                
    // Constructs a branch node with the given data and links.
    public IntTreeNode(int data, IntTreeNode left,
                                 IntTreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

public IntTree(int max) {
	if (max <= 0) {
		throw new IllegalArgumentException("max: " + max);
	}
	overallRoot = buildTree(1, max);
}

// post: returns a sequential tree with n as its root unless n is
//greater than max, in which case it returns an empty tree
private IntTreeNode buildTree(int n, int max) {
	if (n > max) {
		return null;
	} else {
		return new IntTreeNode(n, buildTree(2 * n, max),
								buildTree(2 * n + 1, max));
	}
}
// printing
public void print() {
	print(overallRoot);
	System.out.println();
}
private void print(IntTreeNode root) {
	// (base case is implicitly to do nothing on null)
	if (root != null) {
		// recursive case: print left, center, right
		print(root.left);
		System.out.print(root.data + " ");
		print(root.right);
		// system.out statement position conditional on 
		// pre-in-post ordering
	}
}

// sums
public int sum(){
	return sum(overallRoot);
}
private int sum(IntTreeNode root) {
	if (root == null) {
		return 0;
  } else {
		return root.data + sum(root.left) + sum(root.right);
  }
}
// levels
public int countLevels (){
	return countLevels(overallRoot);
}
private int countLevel(IntTreeNode root) {
	if (root ==null) {
		return 0;
  } else {
		return 1 + Math.max(countLevel(root.left), countLevel(root.right);
  }
}
// leaves
public int countLeaves (){
	return countLeaves(overallRoot);
}
private int countLeaves(IntTreeNode root) {
	if (root == null) {/ /tree is empty, no nodes at all
		return 0; 
	} else if (root.left == null && root.right == null){
		return 1;  //this node is itself a leaf node
  }else {	
		return countLeaves(root.left) + countLeaves(root.right);
  }
}
// contains
private boolean contains(IntTreeNode root, int value) {
    if (root == null) {
        return false;
    } else if (root.data == value) {
        return true;
    } else if (root.data > value) {
        return contains(root.left, value);
    } else {   // root.data < value
        return contains(root.right, value);
    }
}
```
