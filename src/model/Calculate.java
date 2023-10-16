package model;

public interface Calculate {
    /** sum() - Функция суммирует число numberA и numberB
     */
    String sum(Number numberA, Number numberB);
    /** subtraction() - Функция вычитает число numberA и numberB
     */
    String subtraction(Number numberA, Number numberB);
    /** division() - Функция делит число numberA на numberB
     */
    String division(Number numberA, Number numberB);
    /** multiplication() - Функции умножает число numberA на numberB
     */
    String multiplication(Number numberA, Number numberB);


}
