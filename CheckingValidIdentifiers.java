//Program to Check valid and invalid identifiers in java
public class CheckingValidIdentifiers{
public static void main(String args[]){

//As we know that $ (dollar) and _ (underscore) are allowed as identifiers
//int _=20;  This Line of code gives compile time error because underscore(_) is now reserved keyword in java from java 9
//System.out.println(_);

int $=10;
System.out.println($); // It works fine

String my_name="Hanan";//we can use underscore with other letter
System.out.println(my_name);

//int 123abc=9; we can not use numerics in beginning

//char gender#='M'; # is not valid 

byte _$_=12*10;
System.out.println(_$_);

short a=1*10;
System.out.println(a*10);


float __=0.25f;
System.out.println(__);

double $_=.22;
System.out.println($_);

//main is not a keyword it is the identifier of main method
int main=10;
System.out.println(main);


}
}