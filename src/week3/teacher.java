package week3;
import java.util.ArrayList;

public class teacher extends person{

    public teacher()
    {

        super();

    }
    int coursenumber=1;

    ArrayList<course> numberofcourseteacher=new ArrayList<>();

    public void teachercourse (course courseteacher)
    {
        if(coursenumber<3){

            for(int i=3; i>coursenumber; coursenumber++)

            {

                numberofcourseteacher.add(courseteacher);

            }
        }

        else
            System.out.println("Maximum course number is 3 for teacher!!!");
    }
}