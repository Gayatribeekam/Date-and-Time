class conversion3
{
public static void main(String[]args)
{
byte b = 42;
char c = 'a';
short s = 123;
int i = 986754;
float f = 45.76f;
double d = .957892;
double result = (f* b) + (i / c) - (d* s);
 System.out.println("result = " + result);
}
}