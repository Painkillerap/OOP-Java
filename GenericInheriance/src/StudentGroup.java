

import java.util.Iterator;
import java.util.List;


/**
 * Класс представляет группу студентов и содержит список студентов.
 * Класс также реализует интерфейс Iterable для возможности итерации по списку студентов.
 */
public class StudentGroup<T, V, S extends Comparable<S>> implements Iterable<Student<T,V,S>> {

    /*
     * Список студентов
     */
    private List<Student<T,V,S>> students;
    private int numOfGroup;


    /**
     * Конструктор класса StudentGroup.
     * @param listStud список студентов
     */
    public StudentGroup(int numOfGroup, List<Student<T,V,S>> listStud) {
        this.numOfGroup = numOfGroup;
        this.students = listStud;
    }

    /**
     * Метод для получения списка студентов.
     * @return список студентов
     */
    public List<Student<T,V,S>> getStudents() {
        return students;
    }

    /**
     * Метод для установки списка студентов.
     * @param students список студентов
     */
    public void setStudents(List<Student<T,V,S>> students) {
        this.students = students;
    }
    
    /**
     * Метод для получения номера группы студентов
     * @return номер группы
     */
    public int getNumOfGroup() {
        return numOfGroup;
    }

    /**
     * Метод для установки номера группы студентов
     * @param numOfGroup номер группы
     */
    public void setNumOfGroup(int numOfGroup) {
        this.numOfGroup = numOfGroup;
    }

    /**
     * Реализация метода iterator() интерфейса Iterable для возможности итерации по списку студентов.
     * @return итератор списка студентов
     */
    // @Override
    // public Iterator<Student> iterator() {
    //     return new StudentGroupIterator(students);
    // }
@Override 
public Iterator<Student<T,V,S>> iterator() {
    return new Iterator<Student<T,V,S>>() {
    private int index = 0;
    @Override
    public boolean hasNext() {
        return index < students.size();
    }
    @Override
    public Student<T,V,S> next() {
        if(!hasNext())
        {
            return null;
        }
        return students.get(index++);
    }
    
    };
}
    /**
     * Реализация метода compareTo() интерфейса Comparable для сравнения групп по размеру.
     * @param o группа, с которой нужно сравнить текущую группу
     * @return результат сравнения в виде целого числа (0 - равны, 1 - текущая группа больше, -1 - текущая группа меньше)
     */
    // @Override
    // public int compareTo(StudentGroup<T,V,S> o) {
    //     return this.students.compareTo(o.students);
    // }

    /**
     * Переопределенный метод toString() для вывода информации о группе.
     * @return информация о группе в виде строки
     */
    @Override
    public String toString() {
        String result = "Номер группы = " + numOfGroup +
                ", количество студентов = " + this.students.size() +
                ", список студентов:\n";
        for (Student<T,V,S> student : students) {
            result += "Имя: " + student.getFirstName()  +
            "\tФамилия: " + student.getSecondName() +
            "\tВозраст: " + student.getAge() +
            "\tАдрес: " + student.getAddress() + 
            "\tstudentID: " + student.getStudentID() +"\n";
        }
        return result;
    }

}
