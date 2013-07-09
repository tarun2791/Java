public class TestEvenOdd {
public static void main(String arg[]){
int num=6;
int result=num;
while(result>=2){
result=result-2;
}
if(result==1){
System.out.println("The number is odd");
}else{
System.out.print("The number is even");
}
}
}