package MethodOverriding;

import java.util.concurrent.Flow;

public class good {

    String Name ;
    String Roll ;
    String Number;
    String StudentID;


    public good(String name, String roll, String number, String studentID) {
        Name = name;
        Roll = roll;
        Number = number;
        StudentID = studentID;

    }
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getRoll() {
        return Roll;
    }

    public void setRoll(String roll) {
        Roll = roll;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String studentID) {
        StudentID = studentID;
    }



    void boy(){

    }
}
