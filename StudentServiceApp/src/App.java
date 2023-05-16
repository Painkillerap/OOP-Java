
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controllers.EmploeeController;
import StudentDomen.Emploee;
import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentSteam;
import StudentDomen.Teacher;
import StudentDomen.User;
import StudentService.AverageAge;

/*
 * Главный класс приложения.
 */
public class App {
    /**
     * Метод main, запускающий приложение.
     * @param args аргументы командной строки.
     * @throws Exception возможные исключения.
     */
    public static void main(String[] args) throws Exception {

        // Создание объекта сотрудника
        Emploee peron1 = new Emploee("Олег", "Иванов", 55, "СПб", 110);

        // Выплата зарплаты сотруднику
        EmploeeController.paySalary(peron1);

        // Вычисление среднего количества часов и средней ЗП
        Integer studHour[] = { 124, 234, 231, 1, 45 };
        System.out.printf("Среднее количество часов: %.2f\n", EmploeeController.mean(studHour));
        Double emplSalary[] = { 12555.23, 34213.5, 10000.0 };
        System.out.printf("Средняя ЗП: %.2f\n", EmploeeController.mean(emplSalary));

        // Вычисление среднего возраста студентов, преподавателей и сотрудников
        AverageAge<Student> averageAgeStudents = new AverageAge<>();
        averageAgeStudents.add(new Student("Сергей", "Иванов ", 24, "Москва", 102));
        averageAgeStudents.add(new Student("Андрей", "Сидоров ", 23, "Питербург", 101));
        averageAgeStudents.add(new Student("Иван", "Петров ", 25, "Казань", 105));
        System.out.println(averageAgeStudents);

        AverageAge<Teacher> averageAgeTeachers = new AverageAge<>();
        averageAgeTeachers.add(new Teacher("Аркадий", "Цветков ", 40, "Москва", 1012, "Кандидат наук"));
        averageAgeTeachers.add(new Teacher("Максим", "Прохоров ", 44, "Москва", 1301, "Доктор наук"));
        averageAgeTeachers.add(new Teacher("Юрий", "Гагарин ", 39, "Москва", 1005, "Кандидат наук"));
        System.out.println(averageAgeTeachers);
        
        AverageAge<Emploee> averageAgeEmployees = new AverageAge<>();
        averageAgeEmployees.add(new Emploee("Олег", "Игнатов ", 33, "Москва", 42));
        averageAgeEmployees.add(new Emploee("Валерий", "Кипелов ", 36, "Москва", 51));
        averageAgeEmployees.add(new Emploee("Екатерина", "Лесова ", 31, "Москва", 35));
        System.out.println(averageAgeEmployees);

         /*
         * Создаем экземпляры класса Student
         */
        
        Student s1 = new Student("Василий", "Петров", 26," Казань", 175);
        Student s2 = new Student("Андрей", "Сидоров", 22,"Москва", 135);
        Student s3 = new Student("Василий", "Васильев", 26,"Питер", 150);
        Student s4 = new Student("Игорь", "Титков", 21,"Новгород", 145);
        Student s5 = new Student("Даша", "Цветкова", 22,"Ростов", 180);
        Student s6 = new Student("Маша", "Ромашковна", 23,"Краснодар", 155);
        Student s7 = new Student("Сергей", "Иванов", 25,"Сочи",120);

        Student s11 = new Student("Василий", "Петров", 26," Казань", 245);
        Student s12 = new Student("Андрей", "Сидоров", 22,"Москва", 255);
        Student s13 = new Student("Василий", "Васильев", 26,"Питер", 240);
        Student s14 = new Student("Игорь", "Титков", 21,"Новгород", 225);
        Student s15 = new Student("Даша", "Цветкова", 22,"Ростов", 210);
  

        Student s21 = new Student("Василий", "Петров", 26," Казань", 375);
        Student s22 = new Student("Андрей", "Сидоров", 22,"Москва", 335);
        Student s23 = new Student("Василий", "Васильев", 26,"Питер", 360);
        Student s24 = new Student("Игорь", "Титков", 21,"Новгород", 345);
        Student s25 = new Student("Даша", "Цветкова", 22,"Ростов", 350);
        Student s26 = new Student("Маша", "Ромашковна", 23,"Краснодар", 370);
        Student s27 = new Student("Сергей", "Иванов", 25,"Сочи",365);        
        Student s28 = new Student("Маша", "Сидорова", 23,"Самара", 325);
        Student s29 = new Student("Сергей", "Есенин", 25,"Белгород",380); 
        
         /*
         * Создаем и заполняем коллекции экземплярами класса Student
         */
        List<Student> listStud1 = new ArrayList<Student>();
        listStud1.add(s1);
        listStud1.add(s2);
        listStud1.add(s3);
        listStud1.add(s4);
        listStud1.add(s5);
        listStud1.add(s6);
        listStud1.add(s7);

        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s11);
        listStud2.add(s12);
        listStud2.add(s13);
        listStud2.add(s14);
        listStud2.add(s15);

        List<Student> listStud3 = new ArrayList<Student>();
        listStud3.add(s21);
        listStud3.add(s22);
        listStud3.add(s23);
        listStud3.add(s24);
        listStud3.add(s25);
        listStud3.add(s26);
        listStud3.add(s27);
        listStud3.add(s28);
        listStud3.add(s29);

   /*
         * Создаем экземпляры класса StudentGroup
         */
        StudentGroup group1 = new StudentGroup(1, listStud1);
        StudentGroup group2 = new StudentGroup(2, listStud2);
        StudentGroup group3 = new StudentGroup(3, listStud3);

        /*
         * Создаем и заполняем коллекцию экземплярами класса StudentGroup
         */
        List<StudentGroup> listSteam = new ArrayList<StudentGroup>();
        listSteam.add(group1);
        listSteam.add(group2);
        listSteam.add(group3);

          /*
         * Создаем экземпляр класса StudentSteam
         */
        StudentSteam steam1 = new StudentSteam(1, listSteam);

        /*
         * С помощью цикла построчно выводим группы со списком студентов, не отсортированно
         */
        for(StudentGroup group: steam1){
            System.out.printf("Группа %d\n", group.getNumOfGroup());
            for(Student stud : group){
                System.out.println(stud);
            }
        }

        System.out.println("============= после сортировки =============");

             /*
         * Сортируем
         */
        Collections.sort(steam1.getGroups());
        Collections.sort(group1.getStudents());
        Collections.sort(group2.getStudents());
        Collections.sort(group3.getStudents());

        /*
         * С помощью цикла построчно выводим группы со списком студентов, отсортированые по колличеству студентов в группе
         */
        for(StudentGroup group: steam1){
            System.out.println(group);
        }

 /*
         * Вывод на экран экземпляра класса StudentSteam с помощью переопределенного метода ToString
         */
        System.out.println(steam1);        

             // /*
        //  * С помощью цикла построчно выводим студентов, не отсортированно
        //  */
        // for(Student stud : group1){
        //     System.out.println(stud);
        // }

        // System.out.println("___________________");

        // /*
        //  * Сортируем
        //  */
        // Collections.sort(group1.getStudents());

        // /*
        //  * С помощью цикла построчно выводим студентов, отсортированно 
        //  * согласно логике метода compareTo() интерфейса Comparable для сравнения студентов по возрасту и идентификатору.
        //  */
        // for(Student stud : group1){
        //     System.out.println(stud);
        // }
}}
