public class Product {
int pCode;
String pName;
int price;
public Product(int pCode, String pName, int price) {
this.pCode = pCode;
this.pName = pName;
this.price = price;
}
public void display() {
System.out.println("Product code : " + pCode);
System.out.println("Product name : " + pName);
System.out.println("Price : " + price);
}
public static void main(String[] args) {
System.out.println("Name : TOBIN K TOMY\nRoll No : 23MCA059\nDate :14/02/2024");
System.out.println("Program 1: Define a class 'product' with data members pcode, pname and price. Create 3 objects of the class and find the product having the lowest price.");
Product p1 = new Product(1, "Bag", 5000);
Product p2 = new Product(2, "Light", 1000);
Product p3 = new Product(3, "Watch", 7000);
System.out.println("Displaying p1");
p1.display();
System.out.println("Displaying p2");
p2.display();
System.out.println("Displaying p3");
p3.display();
if(p1.price < p2.price && p1.price < p3.price){
System.out.println("Displaying lowest price: "+p1.pName);

}else if (p2.price < p3.price && p2.price < p1.price) {
System.out.println("Displaying lowest price: "+p2.pName);

} else {
System.out.println("Displaying lowest price: "+p3.pName);

}
}
}