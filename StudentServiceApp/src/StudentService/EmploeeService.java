package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Emploee;
import StudentDomen.UserComparator;

/**
 * Класс EmployeeService реализует интерфейс iUserService для работы с объектами
 * типа Employee.
 */
public class EmploeeService implements iUserService<Emploee> {
    private int count;
    private List<Emploee> emploees;

    /**
     * Конструктор класса EmployeeService.
     */
    public EmploeeService() {
        this.emploees = new ArrayList<Emploee>();
    }

    /**
     * Метод для создания нового объекта типа Employee.
     * 
     * @param firstName  имя сотрудника.
     * @param secondName фамилия сотрудника.
     * @param age        возраст сотрудника.
     * @param address    адрес сотрудника.
     */
    @Override
    public void create(String firstName, String secondName, int age, String address) {
        Emploee emp = new Emploee(firstName, secondName, age, address, count);
        count++;
        emploees.add(emp);
    }

    /**
     * Метод для получения всех объектов типа Employee.
     * 
     * @return список всех объектов типа Employee.
     */
    @Override
    public List<Emploee> getAll() {
        return emploees;
    }

    /**
     * Метод для получения списка объектов типа Employee, отсортированных по ФИО и
     * группе.
     * 
     * @param empId идентификатор сотрудника.
     * @return отсортированный список объектов типа Employee.
     */
    public List<Emploee> getSortedByFIOStudentGroup(long empId) {
        List<Emploee> emploees = new ArrayList<Emploee>(this.emploees);
        emploees.sort(new UserComparator<Emploee>());
        return emploees;

    }
}
