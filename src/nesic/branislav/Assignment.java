package nesic.branislav;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment extends ArrayList<Object> {

	ArrayList<Object> stack;

	public Assignment(ArrayList<Object> stack) {
		this.stack = stack;
	}

	public Object pop() {
		Object moved = (Object) stack.get(stack.size() - 1);
		stack.remove(stack.size() - 1);
		System.out.println("Moved element is:" + moved);
		System.out.println("New list consist next elements" + stack);
		return moved;
	}

	public void print() {
		System.out.println(stack.toString());
	}

	public Object insert() {

		Scanner S = new Scanner(System.in);
		if (stack.size() == 0) {
			System.out.println("Enter an element!");
			Object enteredElement = S.next();
			stack.add(0,enteredElement);
			System.out.println(stack);
		} else {
			System.out.println("Enter next element!");
			Object nextElement = S.next();
			System.out.println("Enter index <=" + stack.size() + ":");
			int enteredIndex = S.nextInt();
			stack.add(enteredIndex, nextElement);
			System.out.println(stack);
		}
		return stack;
	}

	public static void main(String[] args) {

		ArrayList<Object> A = new ArrayList<Object>();
		Assignment H = new Assignment(A);
		H.insert();
		H.insert();
		H.insert();
		H.pop();
		H.print();
		H.pop();
		H.print();
		H.insert();

	}

}
