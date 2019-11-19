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
		return result;
	}
	public void remove(){
		if(!removeOK)
			throw new IllegalStateException("bad man");	
		list.remove(position-1);
		position--;
		removeOK = false;
	}
}