package Student.NotFullStudent;

import Student.Student;

public class NotFullStudent extends Student {
    public boolean isFullStudent() {
        return isFullStudent;
    }
    public NotFullStudent(String secondName, int age, int[] marks, int speciality) throws Exception {
        super(secondName,age,marks,speciality);
        this.isFullStudent = false;
    }
    public void setNotFullStudent(boolean isFullStudent)throws Exception {
        if(!isFullStudent)
            throw new Exception("Extramural student can't be full-time");
        this.isFullStudent = isFullStudent;
    }

    boolean isFullStudent;
    public NotFullStudent(){isFullStudent = false;}
    @Override
    public void printInfo() {
        System.out.println("I'm " + getSecondName() + ' ' + getAge() + " years old " + " speciality: " + getSpeciality() + ".\nAnd ");
        printStudent();
    }

    @Override
    public void printStudent() {
        System.out.println("I'm extramural student");
    }
    public class JustEmptyClass{}
}
