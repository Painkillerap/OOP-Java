import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
    Student<String,Integer,Long> s1=new Student<String,Integer,Long>("Сергей","Иванов",24,"Москва",(long)104);
    System.out.println(s1);
    Student<String,Integer,Long> s2=new Student<String,Integer,Long>("Андрей","Иванов",24,"Москва",(long)102);
    Student<String,Integer,Long> s3=new Student<String,Integer,Long>("Владимир","Иванов",24,"Москва",(long)103);

    List<Student<String,Integer,Long>> listStud=new ArrayList<>();
    listStud.add(s1);
    listStud.add(s2);
    listStud.add(s3);

    StudentGroup<String,Integer,Long> group = new StudentGroup<String,Integer,Long>(1, listStud);

    for(Student<String,Integer,Long> stud: group){
        System.out.println(stud);
    }

    Collections.sort(group.getStudents());  
    }
}
