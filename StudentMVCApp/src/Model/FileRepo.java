package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import Controller.iGetModel;
/**
 * Класс, представляющий список студентов, в отличие от Model работает с файлами
 */

public class FileRepo implements iGetModel {
    private String fileName;// Название файла, где хранятся данные
    private List<Student> students;// Объявляем список, куда будем помещать студентов
// Конструктор
    public FileRepo(String fileName) {
        this.fileName = fileName;
        this.students = new ArrayList<Student>();// При инициализации создаём пустой список студентов
         // Проверяем доступность файла
        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
 // Метод добавления студентов в List
    public void addStudent(Student student) {
        this.students.add(student);
    }
// Чтение данных студентов из файла
    public void readAllStudensFromFile() {
        try {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            // Перечисляем все строки в цикле
            String line=br.readLine();
            while(line != null)
            {
                String[] param=line.split(" ");
                Student pers=new Student(param[0], param[1], Integer.parseInt(param[2]),param[3], Long.parseLong(param[4]));
                students.add(pers);
                line=br.readLine();
            }
            br.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    // Сохранение данных студентов в файл
    public void saveAllStudentToFile()
    {
        try (FileWriter fw = new FileWriter(fileName, true)) {
            for(Student pers:students)
            {
                fw.write(pers.getFirstName()+" "+pers.getSecondName()+" "+pers.getAge()+" "+pers.getAddress()+" "+pers.getStudentID());
                fw.append('\n');
            }
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
// Переопределяем метод из интерфейса iGetModel
    @Override
    public List<Student> getAllStudent() {
        readAllStudensFromFile();
        return students;
    }
   // Удаляем студента, зная его ID
    // Переопределяем метод из интерфейса iModel
    @Override
    public boolean deleteStudent(long studentID) {        
        
        for (int i = 0; i < students.size(); i ++) {
            if (students.get(i).getStudentID() == studentID) {
                students.remove(i);       
                // Очищаем файл со студентами и сохраняем обновлённый список
                try (FileWriter fw = new FileWriter(fileName, false)) {
                    fw.flush();
                } catch(Exception e) {
                    System.out.println(e.getMessage());
                }
                saveAllStudentToFile();
                return true;
            }
        }
        return false;
}}
