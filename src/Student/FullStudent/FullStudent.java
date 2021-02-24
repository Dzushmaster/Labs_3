package Student.FullStudent;

import Student.Student;

public class FullStudent extends Student {
    public boolean isFullStudent() {
        return isFullStudent;
    }
    public FullStudent(String secondName, int age, int[] marks, int speciality) throws Exception {
        super(secondName,age,marks,speciality);
        this.isFullStudent = true;
    }
    public void setFullStudent(boolean isFullStudent)throws Exception {
        if(!isFullStudent)
            throw new Exception("Full-time student can't be extramural");
        this.isFullStudent = isFullStudent;
    }

    boolean isFullStudent;
    public FullStudent(){isFullStudent = true;}
    @Override
    public void printInfo() {
        System.out.println("I'm " + getSecondName() + ' ' + getAge() + " years old " + " speciality: " + getSpeciality() + ".\nAnd ");
        printStudent();
    }

    @Override
    public void printStudent() {
        System.out.println("I'm full-time student");
    }
}
