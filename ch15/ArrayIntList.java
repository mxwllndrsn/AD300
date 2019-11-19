import java.util.*;

public class ArrayIntList{
	private int[] elementData;
	private int size;
	private static final int DEFAULT_CAP = 10;

	public ArrayIntList(){
		this(DEFAULT_CAP);
	}
	public ArrayIntList(int capacity){
		if(capacity<0){
			throw new IllegalArgumentException("Capacity: "+capacity+" invalid - must be greater than or equal to zero");
		}
		elementData = new int[capacity];
		size = 0;
	}
	public void add(int value){
		elementData[size] = value;
		size++;
	}
	public void add(int index, int value){
		for(int i=size; i>index; i--){
			elementData[i] = elementData[i-1];
		}
		elementData[index] = value;
		size++;
	}
	public String toString(){
		String display="";
		if(size==0)
			return "[]";
		else{
			display += "["+elementData[0];
			for(int i=1; i<size; i++){
				display+=", "+elementData[i];
			}
			display+="]";
		}
		return display;	
	}
	public int indexOf(int value){
		for(int i=0; i<size; i++){
			if(elementData[i]==value)
				return i;
		}
		return -1;
	}
	public void remove(int index){
		// must catch bad indices 
		// the element to be removed is naturally overwritten
		// by walking the list and reallocating i as i+1
		for(int i=index; i<size-1; i++){
			elementData[i] = elementData[i+1];
		}
		size--;
		elementData[size] = 0; // unneccessary 
	}
	public int size(){
		return size;
	}
	public int length(){
		return elementData.length;
	}
	public int get(int index){
		return elementData[index];
	}
}