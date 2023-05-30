package Operation;

import Classes.ComplexNumber;
import Interface.iOperation;

/**
 * Класс Division реализует интерфейс iOperation и представляет операцию деления
 */
public class Division implements iOperation {
    
    /**
     * Метод execute выполняет операцию деления двух комплексных чисел
     * @param a первый комплексный операнд
     * @param b второй комплексный операнд
     * @return результат операции в виде нового комплексного числа
     */
    public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
        // Вычисляем знаменатель
        double denominator = b.getReal() * b.getReal() + b.getImaginary() * b.getImaginary();
        // Вычисляем действительную часть результата
        double real = (a.getReal() * b.getReal() + a.getImaginary() * b.getImaginary()) / denominator;
        // Вычисляем мнимую часть результата
        double imaginary = (a.getImaginary() * b.getReal() - a.getReal() * b.getImaginary()) / denominator;
        // Возвращаем новое комплексное число
        return new ComplexNumber(real, imaginary);
    }
}
