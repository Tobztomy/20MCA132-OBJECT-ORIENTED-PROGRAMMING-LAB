import java.util.Scanner;
public class StringManip
{
String str1,str2;
StringManip(String s1){
str1=s1;
}

public void strLen(){
System.out.println("The length of string: "+str1.length());
}

public void uppercase(){
System.out.println("Uppercase: "+(str1.toUpperCase()));
}

public void lowercase(){
System.out.println("Lowercase: "+(str1.toLowerCase()));
}

public void strConcat(){
System.out.println("Concatenated String with 'HELLO': "+(str1.concat("HELLO")));
}

public void substring(){
if (str1.contains("hello")){
System.out.println("Substring exist in the string");
}else {
System.out.println("Substring not exist in the string");
}
}

public void charpos(){
System.out.println("Character at position 3 in string: "+(str1.charAt(2)));
}

public void compare(){
System.out.println("Compare to 'JAVA': "+(str1.compareTo("JAVA")));
}

public static void main(String[] args) {
String str;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the String");
str = sc.nextLine();
StringManip s1 = new StringManip(str);

s1.strLen();
s1.uppercase();
s1.lowercase();
s1.strConcat();
s1.substring();
s1.charpos();
s1.compare();

}
}
