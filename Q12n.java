import java.util.Stack;
import java.util.Scanner;
public class Q12n {
public static void removeElementAtPosition(Stack<String> stack, int position) {
if (position >= 1 && position <= stack.size()) {
Stack<String> tempStack = new Stack<>();
for (int i = 1; i < position; i++) {
tempStack.push(stack.pop());
}
stack.pop();
while (!tempStack.isEmpty()) {
stack.push(tempStack.pop());
}
System.out.println("Element at position " + position + " removed successfully.");
} else {
System.out.println("Invalid position. Please provide a valid position within the stack range.");
}
}
public static void main(String[] args) {
Stack<String> stack = new Stack<>();
stack.push("Element 1");
stack.push("Element 2");
stack.push("Element 3");
stack.push("Element 4");
stack.push("Element 5");

Scanner s=new Scanner(System.in);
System.out.println("position to remove") ;
int positionToRemove = s.nextInt();

System.out.println("\nName : TOBIN K TOMY\nRoll No : 23MCA059\nDate : 15/04/2024");
System.out.println("Program 22 : Program to remove an object from the Stack when the position is passed as parameter");
System.out.println("Before removal: " + stack);
removeElementAtPosition(stack, positionToRemove);
System.out.println("After removal: " + stack);
}
}