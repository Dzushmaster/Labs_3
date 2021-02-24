package com.company;

import Dean.Dean;
import Student.FullStudent.FullStudent;
import Student.NotFullStudent.NotFullStudent;
import Student.Student;

import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger(Main.class.getName());
        LocalDate localDate = LocalDate.now();
        logger.log(Level.INFO, "Kaminsky Dmitry " + localDate);

        int[] marks1 = {6,8,9,2,10};
        logger.log(Level.INFO, "First array with marks created");

        NotFullStudent notFullStudent = new NotFullStudent("Vasya",24,marks1,Student.spec.ISIT.ordinal());
        logger.log(Level.INFO, "Create new NotFullStudent");

        System.out.println("Avarage mark is " + Dean.AvarageMark(notFullStudent));
        int[] marks2 = {8,9,4,7,6};
        logger.log(Level.INFO, "Second array with marks created");

        FullStudent fullStudent = new FullStudent("Vitalya",18,marks2,Student.spec.DEIVI.ordinal());
        System.out.println("Avarage mark is " + Dean.AvarageMark(fullStudent));
        logger.log(Level.INFO, "Create new FullStudent");

        notFullStudent.printInfo();
        logger.log(Level.INFO, "Print all info about NotFullStudent");
        fullStudent.printInfo();

        logger.log(Level.INFO, "Print all info about NotFullStudent");
    }
}

