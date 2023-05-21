package application;

import java.lang.Math;
import java.util.Arrays;

public class CursorStack<T extends Comparable<T>> implements StackInterface<T> {

	CursorArray<T> stack = new CursorArray<T>(100);
	int list = stack.createList();
	int top = -1;

	@Override
	public void push(Object data) {
		if (!stack.insertAtHead(data, list))
			System.out.println("Error Satck Overflow!!!!");
	}

	@Override
	public T pop() {
		return  (T)stack.deleteFirst(list);
	}



	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return  (T)stack.getFirst(list);
	}


	@Override
	public boolean isEmpty() {
		return stack.isEmpty(list);
	}

	@Override
	public void clear() {
		while (!isEmpty()) {
			stack.deleteFirst(list);
		}
	}

	@Override
	public int size(int i) {
		return top + 1;

	}

	

	





	/*
	 * for (int i = 0; i < str2.length(); i++) { if (postFixEva.peek() != null) {
	 * char c = str2.charAt(i); if (Character.isDigit(c)) postFixEva.push(c - '0');
	 * 
	 * else { int op1 = (int) postFixEva.pop(); int op2 = (int) postFixEva.pop();
	 * 
	 * switch (c) { case '+': postFixEva.push(op2 + op1); break;
	 * 
	 * case '-': postFixEva.push(op2 - op1); break;
	 * 
	 * case '×': postFixEva.push(op2 * op1); break;
	 * 
	 * case '/': postFixEva.push(op2 / op1); break;
	 * 
	 * case '%': postFixEva.push(op2 % op1); break;
	 * 
	 * case 'e': postFixEva.push(Math.exp(op1)); break;
	 * 
	 * case '^': postFixEva.push(Math.pow(op2, op1)); break;
	 * 
	 * case '√': postFixEva.push(Math.sqrt(op1)); break; }
	 * 
	 * } /* else { int operand = postfix.charAt(i) - '0'; postFixEva.push(operand);
	 * }
	 * 
	 * } } str += postFixEva.pop(); return str; }
	 */

}
