import java.util.*;
import java.util.Scanner;
public class Q11n {
public static void main(String[] args){
System.out.println("Name : TOBIN K TOMY\nRoll No : 23MCA059\nDate : 15/04/2024");
System.out.println("Program 21 : Program to remove all the elements from a linked list");
LinkedList<String> L=new LinkedList<>();
Scanner s=new Scanner(System.in);

System.out.println("no of elements");
int n = s.nextInt();
s.nextLine();

System.out.println("enter elements");
for(int i=0; i<n; i++){
String a=s.nextLine();
L.add(a);
}
System.out.println(L);
System.out.println("position to remove");
int pos = s.nextInt();

 if (pos >= 0 && pos < L.size()) {
            L.remove(pos);
            System.out.println("Element removed successfully.");
        } else {
            System.out.println("Invalid position. No element removed.");
        }
System.out.println(L);

s.close();
}
}