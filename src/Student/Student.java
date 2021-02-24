package Student;

public abstract class Student implements Printabl {
    public Student (){}
    public Student(String secondName, int age, int[] marks, int speciality) throws Exception {
        checkNumbInName(secondName);
        this.secondName = secondName;
        checkAge(age);
        this.age = age;
        checkMarks(marks);
        this.marks = marks;
        checkSpec(speciality);
        this.speciality = speciality;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String Name) throws Exception {
        checkNumbInName(Name);
        secondName = Name;
    }
    void checkNumbInName(String secondName)throws Exception{
        for(char symb: secondName.toCharArray())
            if(Character.isDigit(symb))
                throw new Exception("Exception: numbers in the Name");
    }

    String secondName;


    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        checkAge(age);
        this.age = age;
    }
    void checkAge(int age)throws Exception {
        if(0>age)
            throw new Exception("Age can't be less then 0");
    }
    int age;

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) throws Exception {
        checkMarks(marks);
        this.marks = marks;
    }
    void checkMarks(int[] marks) throws Exception {
        for (int m:marks)
            if(0>m)
                throw new Exception("Marks can't be less 0");
    }
    int[] marks = new int[5];

    static public enum spec{
        POIT,
        ISIT,
        POIBMS,
        DEIVI
    }

    public int getSpeciality() {
        return speciality;
    }

    public void setSpeciality(int speciality) throws Exception {
        checkSpec(speciality);
        this.speciality = speciality;
    }

    void checkSpec(int speciality)throws Exception
    {
        if(speciality<spec.POIT.ordinal() || speciality>spec.DEIVI.ordinal())
            throw new Exception("We don't have this speciality in our university");

    }
    int speciality;
    public void printStudent()
    {
        System.out.println("I'm a student");
    }

}
