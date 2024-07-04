import java.util.Scanner;
public class ComplexNumber{
double real,img;

ComplexNumber(double r,double i){
this.real=r;
this.img=i;
}

public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2){
ComplexNumber temp=new ComplexNumber(0,0);

temp.real=c1.real+c2.real;
temp.img=c1.img+c2.img;
return temp;
}
public static void main(String args[]){

	int real, img;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first complex number");
        System.out.print("Enter the real part : ");
        real = scanner.nextInt();
        System.out.print("Enter the imaginary part : ");
        img = scanner.nextInt();
        ComplexNumber c1 = new ComplexNumber(real, img);               

        System.out.println("Enter the second complex number");
        System.out.print("Enter the real part : ");
        real = scanner.nextInt();
        System.out.print("Enter the imaginary part : ");
        img = scanner.nextInt();
        ComplexNumber c2 = new ComplexNumber(real, img);               

ComplexNumber temp=sum(c1,c2);
System.out.print("sum is:"+temp.real+"+"+temp.img+"i");
}
}
