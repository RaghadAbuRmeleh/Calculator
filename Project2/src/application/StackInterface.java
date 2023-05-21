package application;

    
public interface StackInterface <T> {
	void push(Object data);
	T pop();
	T peek();
	boolean isEmpty();
	void clear();
	int size(int i ); 
}

    
