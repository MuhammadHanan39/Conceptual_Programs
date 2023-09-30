public class LoopConcept{
public static void main(String args[]){

//int i;


//for(i;i<3;i++) this statement gives error because we must need to initialize the i variable

for(int i=0;i<3;i++){}//this is valid but it wont display anything 



for(int i=0;i<3;i++)
System.out.println(i);// the output will be 0 1 2



for(int i=0;i<3;i++)
for(i=2;i<5;i++)
System.out.println(i);// print 2 3 4


for(int i=0;i<3;i++)
for(;i<5;i++)
System.out.println(i);// prints value from 0 to 4



//for(;;)
//System.out.println(i); This prints the infinite values




System.out.println("Nothing will be printed after previous execution"); 
for(int i=0 ;i>5;i++)
System.out.println(i);// No Output because condition is not true in for loop syntax







}
}