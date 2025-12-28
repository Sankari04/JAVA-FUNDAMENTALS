import java.util.Scanner;
class find{
    String evenorOdd(int num){
       if(num%2==0){
           return "even";
       } 
       return "odd";
    }
};

public class OddEvenUsingObjects
{
	public static void main(String[] args) {
		
		Scanner c=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=c.nextInt();
		find obj=new find();
		String result=obj.evenorOdd(num);
		 	System.out.println("result:"+result);
		
	}
}

