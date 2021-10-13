package week3;
import java.util.ArrayList;

public class course {

    String coursename;
    int coursecredit;
    int studentcount;

    course()

    {
        this.coursename=coursename;
        this.coursecredit=coursecredit;
        this.studentcount=studentcount;
    }

    int coursenumber=1;

    ArrayList<student> countstudent=new ArrayList<>();
    public void studentcourse (student student)
    {

        if(coursenumber<20)
        {

            for(int i=20; i>coursenumber; coursenumber++)

            {
                countstudent.add(student);
            }
        }

        else System.out.println("Maximum capacity of course is 20 student.");

    }
}
