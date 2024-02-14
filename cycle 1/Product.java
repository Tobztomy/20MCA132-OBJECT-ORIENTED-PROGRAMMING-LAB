public class Product{
String pname,pcode;
int price;

public String getPname(){
return pname;
}

public Product(){
}

public Product(String pname, String pcode, int price){
this.pname=pname;
this.pcode=pcode;
this.price=price;
}

public void setPname(String pname){
this.pname=pname;
}

public String getPcode(){
return pcode;
}

public void setPcode(String pcode){
this.pcode=pcode;
}

public int getPrice(){
return price;
}

public void setPrice(int price){
this.price=price;
}

public void display(){
System.out.println("pcode :"+this.pcode);
System.out.println("pname :"+this.pname);
System.out.println("price :"+this.price);
}
public static void main(String[] args){
System.out.println("Name: Tobin K Tomy");
System.out.println("Roll No: 59");
System.out.println("Date: 14-02-2024");
System.out.println("Program1: find lowest price");
Product p1= new Product("Car123","Benz",10000);
System.out.println("Displaying p1");
p1.display();

Product p2= new Product("Jaguar","car426",25000);
System.out.println("Displaying p2");
p2.display();

Product p3= new Product("Maruthi","Car800",50000);
System.out.println("Displaying p3");
p3.display();

Product p=p3.getPrice()<(p1.price<p2.price?p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);
System.out.println("Displaying lowest price");
p.display();
}
}

