public class RuntimeError{
public static void main(String []arg){

//boolean b=10;Compile Time Error

int a=10;
float b=0;
//System.out.println(a/0); Runtime Error

System.out.println(a/b);


//int c=true;

System.out.println("main method args"+arg);


RuntimeError.main(4,5);






}


public static void main(int a ,int b){
System.out.println("Overloaded main method");
}


}