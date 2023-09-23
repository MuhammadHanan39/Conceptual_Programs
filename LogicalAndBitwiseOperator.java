public class LogicalAndBitwiseOperator{
public static void main(String args[]){

int a =10;
int b=20;
int c=20;

System.out.println(a>b && a++<c);//if first condition is false then it wont check the second one
System.out.println(a);

System.out.println(a<b && a++<c);//if first condition is true then it checks second one
System.out.println(a);


System.out.println(a>b & a++<c);//bitwise OR operator check both condition
System.out.println(a);

System.out.println(a>b & a>c);


}
}