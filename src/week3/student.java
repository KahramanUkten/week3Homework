package week3;
import java.util.ArrayList;

public class student extends person{

    int year;

    student()

    {
        super();
        this.year=year;
    }

    int creditnumber=0;
    ArrayList<course> course2=new ArrayList<>();
    public void studentcourse (course coursestudent)

    {
        if(creditnumber<20)

        {

            for(int i=20; i>creditnumber; creditnumber++)
            {
                course2.add(coursestudent);
            }

        }

        else
            System.out.println("Maximum credit is 20 for student.");
    }
}