class conversion2
{
public static void main(String[]args)
{
byte b;
int i = 300;
double d = 123.456;
System.out.println("Conversion of int to byte.");
b = (byte)i;
System.out.println("i = " + i + " b = " + b);
System.out.println("\nconversion of double to byte.");
b = (byte)d;
System.out.println("d = " + d + " b= " + b);
}
}