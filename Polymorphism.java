public class Polymorphism{


public int sum(int a, int b){
System.out.println("int method is invoked");
return a+b;
}

public double sum(double a, double b){
System.out.println("double method is invoked");
return a+b;
}

public int sum(int a , int b ,int c){
return a+b+c;
}




public static void main(String args[]){

Polymorphism p=new Polymorphism();
p.sum(10,20);
p.sum(3.5,6.4);

p.sum(2.3,5);


System.out.print(p.sum(3,4,5));


}
}