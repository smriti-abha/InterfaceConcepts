import java.util.*;


interface person{
    void changeIdNumber(int id);
    void changeClass(String name);
    void changeNumberOfSubjects(int tot_no);
}

class Student implements person{
    String name;
    int adm_num;
    int numOfSubjects;

    @Override
    public void changeIdNumber(int id){
       adm_num=id;
    }
    @Override
    public void changeClass(String stu_name){
        name=stu_name;
    }

    @Override
    public void changeNumberOfSubjects(int tot_num_of_subjects){
        numOfSubjects=tot_num_of_subjects;
    }

    public void printStates(){
        System.out.println("name: "+name+" adm_num: "+adm_num+" numOfSubjects: "+numOfSubjects);
    }
}
public class Main {
    public static void main(String[] args) {
        Student student= new Student();
        student.changeClass("Abha");
        student.changeIdNumber(20);
        student.changeNumberOfSubjects(7);
        student.printStates();

    }
}