package model;

import java.util.ArrayList;

public interface Calculate {
    /** sum() - Функция суммирует число numberA и numberB
     */
    String sum(ArrayList<Number> list);

    /** subtraction() - Функция вычитает число numberA и numberB
     */
    String subtraction(ArrayList<Number> list);

    /** division() - Функция делит число numberA на numberB
     */
    String division(ArrayList<Number> list);

    /** multiplication() - Функции умножает число numberA на numberB
     */
    String multiplication(ArrayList<Number> list);



}
