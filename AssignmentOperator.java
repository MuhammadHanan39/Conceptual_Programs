public class AssignmentOperator{
public static void main(String args[]){

short a=10;
a+=2;//a=a+2


short b=20;



//a=a+b; this gives compile time type casting error

a+=b;//but this works fine

System.out.println(a);

}
}