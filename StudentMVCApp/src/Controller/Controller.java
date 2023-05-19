package Controller;

import java.util.ArrayList;
import java.util.List;

import Model.Dist;
import Model.Student;

/**
 * Класс контроллера, который связывает модель и представление.
 * Содержит методы для получения списка студентов, обновления представления,
 * запуска приложения и обработки команд пользователя.
 */
public class Controller {
    
    private List<Student> students; // список студентов
    private iGetView view; // объект представления
    private iGetModel model; // объект модели
    private String lang; // язык приложения
    
    /**
     * Конструктор класса.
     * @param view - объект представления
     * @param model - объект модели
     * @param lang - язык приложения
     */
    public Controller(iGetView view, iGetModel model, String lang) {
        this.view = view;
        this.model = model;
        this.lang = lang;
        this.students = new ArrayList<Student>();
    } 
    
    /**
     * Метод для получения списка всех студентов из модели.
     */
    public void getAllStudents() {
        students = model.getAllStudent();
    }

    /**
     * Метод для проверки наличия данных в списке студентов.
     * @return true, если список не пустой, иначе false.
     */
    public boolean testData() {
        if(students.size()>0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Метод для обновления представления со списком студентов.
     */
    public void updateView() {
        getAllStudents();
        if(testData()) {
            view.printAllStudent(students);
        } else {
            System.out.println(Dist.get("emptyList", lang));
        }
    }

    /**
     * Метод для получения команд от пользователя.
     */
    public void run() {
        boolean getNewIteration = true; // флаг
        while (getNewIteration) {
            String command = view.prompt(Dist.get("enterCommand", lang));
            
            try {
                Commands com = Commands.valueOf(command.toUpperCase());
                switch (com) {
                    // Командя для выхода из программы
                    case EXIT:
                        getNewIteration = false;
                        System.out.println(Dist.get("exit", lang));
                        break;
                    // Вывод списка студентов
                    case LIST:
                        getAllStudents();
                        updateView();
                        System.out.println("");
                        break;
                    // Удаление Студента
                    case DELETE:
                        updateView();
                        Long studentID = Long.parseLong(view.prompt(Dist.get("enterStudentId", lang)));
                        boolean isDeleted = model.deleteStudent(studentID);
                        if (!isDeleted) {
                            System.out.println(Dist.get("notFound", lang));
                        } else {
                            System.out.println(Dist.get("deleted", lang));
                            updateView();
                            System.out.println("");
                        }
                        break;
                    default:
                        System.out.println(Dist.get("notCorrect", lang));
                        break;
                }
            } catch (Exception e) {
                System.out.println(Dist.get("notCorrect", lang) + " = " + e.getMessage());
                System.out.println("");
            }
        }
    }

}