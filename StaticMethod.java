public class StaticMethod{

public static void sum(int a ,int b){
System.out.println(a+b);
}

public static void main(String args[]){

StaticMethod.sum(3,4);
StaticMethod obj = new StaticMethod();
obj.sum(4,5);

}
}




