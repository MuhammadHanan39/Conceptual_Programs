public class FunctionChain{

int sum(int a, int b){
	System.out.println("Sum of numbers are"+(a+b));
	System.out.println("End of Sum Function");
	return a+b;
}


long product(int a, int b){
	System.out.println("Product of the number is"+(a*b));
	System.out.println("End of Product Function");
	return (a*b);
}

public static void main(String args[]){

FunctionChain functionChain=new FunctionChain();
functionChain.sum(5,3).product(5,3);

}
}