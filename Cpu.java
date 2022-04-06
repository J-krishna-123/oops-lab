import java.util.*;
class Cpu
{
int price;
class processor
{
int cores;
String producer;
processor(int noc,String manu)
{
cores=noc;
producer=manu;
}
void display()
{
System.out.println("\n processor info");
System.out.println("no:of cores="+ cores);
System.out.println("manufacture="+producer+"\n");
}
}
static class ram
{
int mem;
String manuf;
ram(int memory,String producer)
{
mem=memory;
manuf=producer;
}
void display()
{
System.out.println("\nRAM info");
System.out.println("memory="+mem+"GB");
System.out.println("manufacture="+manuf+"\n");
}
}
public static void main(String[] args)
{
Cpu.ram obj1=new Cpu.ram(8,"intel");
Cpu obj2=new Cpu();
Cpu.processor obj3=obj2.new processor(8,"sumsung");
obj1.display();
obj3.display();
}
}
