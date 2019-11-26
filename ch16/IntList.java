// intlist interface

public interface IntList{
	public void add(int value);
	public void add(int index, int value);
	public void addSorted(int value);
	public int get(int index);
	public void remove(int index);
	public String toString();
}
