class CPU{
double price;
class Processor{

double cores(){
return 4;
}
String manufacturer(){
return "AMD";
}

}

protected class RAM{

double memory(){
return 2048;
}
String manufacturer(){
return "Blaze";
}

}
}

public class CPUDetails{
public static void main(String[] args){

CPU cpu = new CPU();
CPU.Processor processor=cpu.new Processor();
CPU.RAM ram=cpu.new RAM();

System.out.println("Processor Details:");
System.out.println("Processor cores:"+processor.cores());
System.out.println("Processor manufactures:"+processor.manufacturer());

System.out.println("RAM Details:");
System.out.println("Ram memory:"+ram.memory());
System.out.println("Ram manufacturer:"+ram.manufacturer());
}
}
