public class ifelse {
    public static void main(String[] args){
        int mark=50,mark1=51;

        if(mark>35)
        {
            System.out.println("pass");
        }
        else{
            System.out.println("pass");
        }
        System.out.println(System.identityHashCode(mark));
        System.out.println(System.identityHashCode(mark1));
    }
}
