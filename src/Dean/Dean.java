package Dean;

import Student.Student;

public class Dean {
    public static int CountBySpec(Student student) {
        int count = 0;
        if(student.getSpeciality() == Student.spec.DEIVI.ordinal())
            count++;
        return count;
    }
    public static double AvarageMark(Student student) {
        int avarageMarks = 0;
        if(student.getMarks().length != 0)
            for (int mark:student.getMarks()) {
                avarageMarks+=mark;
            }
        return avarageMarks/student.getMarks().length;
    }
}
