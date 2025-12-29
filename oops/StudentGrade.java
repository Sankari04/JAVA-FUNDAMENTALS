import java.util.Scanner;
class Grade{
    float total,avg;
    float avg_total(float m1,float m2,float m3){
        total=m1+m2+m3;
        avg=total/3;
        System.out.println("Total:"+total);
        return avg;
       
    }
    void result(){
        if(avg>90.0){
            System.out.println("O");
        }
        else if(avg>80.0){
            System.out.println("A");
        }
        else if(avg>60.0){
            System.out.println("B");
        }
        else if(avg>40.0){
            System.out.println("C");
        }
        else {
            System.out.println("D");
        }
    }
};

public class StudentGrade {
    public static void main(String[] args) {
        String name,rollnum;        //name.register number
        float m1,m2,m3;             //mark
        Scanner c=new Scanner(System.in);
        System.out.println("Enter Student name:") ;
        name=c.nextLine();
        System.out.println("Enter Rollnumber:") ;
        rollnum=c.nextLine();
        System.out.println("Enter marks of 3 subjects:") ;
        m1=c.nextFloat();
        m2=c.nextFloat();
        m3=c.nextFloat();
       Grade obj1=new Grade();
       float mark=obj1.avg_total(m1,m2,m3);
       System.out.println("Average:"+mark);
        obj1.result();
         c.close();
}
}
