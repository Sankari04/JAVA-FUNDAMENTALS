public class count_digits{
    public static void main(String[] args){
         int num=1337,count=0;
        while(num>=0)
        {
       
            int rem=num%10;
            if(rem>=0){
             count=count+1;
            }
             num=num/10;
        }
        System.out.println("count is"+count);
    }
}