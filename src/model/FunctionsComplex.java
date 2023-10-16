package model;

import view.Text;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class FunctionsComplex implements CalculateComplex {


    public String sumComplex(Integer numA, Integer numB, Integer numA2, Integer numB2) {
        StringBuilder sB = new StringBuilder();
        if(numB + numB2 > 0){
            sB.append(numA + numA2)
                    .append("+")
                    .append(numB + numB2)
                    .append("i");
        } else if (numB + numB2 < 0) {
            sB.append(numA + numA2)
                    .append(numB + numB2)
                    .append("i");
        } else {
            sB.append(numA + numA2);
        }
        return sB.toString();
    }

    /** subtractionComplex() - Функция вычисляет выражение (A + Bi) - (A2 + B2i)
     */

    public String subtractionComplex(Integer numA, Integer numB, Integer numA2, Integer numB2) {
        StringBuilder sB = new StringBuilder();
        if(numB - numB2 > 0){
            sB.append(numA - numA2)
                    .append("+")
                    .append(numB - numB2)
                    .append("i");
        } else if (numB - numB2 < 0) {
            sB.append(numA - numA2)
                    .append(numB - numB2)
                    .append("i");
        } else {
            sB.append(numA - numA2);
        }
        return sB.toString();
    }

    /** multiplicationComplex() - Функция вычисляет выражение (A + Bi) * (A2 + B2i)
     */

    public String multiplicationComplex(Integer numA, Integer numB, Integer numA2, Integer numB2) {
        StringBuilder sB = new StringBuilder();
        if((numA * numB2 - numA2 * numB) > 0){
            sB.append(numA * numA2 - numB * numB2)
                    .append("+")
                    .append(numA * numB2 - numA2 * numB)
                    .append("i");
        } else if ((numA * numB2 - numA2 * numB) < 0) {
            sB.append(numA * numA2 - numB * numB2)
                    .append(numA * numB2 - numA2 * numB)
                    .append("i");
        } else {
            sB.append(numA * numA2 - numB * numB2);
        }
        return sB.toString();
    }

    /** divisionComplex() - Функция вычисляет выражение (A + Bi) / (A2 + B2i)
     */

    public String divisionComplex(Integer numA, Integer numB, Integer numA2, Integer numB2) {
        StringBuilder sB = new StringBuilder();
        if((numA2 * numB - numA * numB2) > 0){
            sB.append((double) (numA * numA2 + numB * numB2) / (numA2 * numA2 + numB2 * numB2))
                    .append("+")
                    .append((double)(numA2 * numB - numA * numB2) / (numA2 * numA2 + numB2 * numB2))
                    .append("i");
        } else if ((numA2 * numB - numA * numB2) < 0) {
            sB.append((double)(numA * numA2 + numB * numB2) / (numA2 * numA2 + numB2 * numB2))
                    .append((double)(numA2 * numB - numA * numB2) / (numA2 * numA2 + numB2 * numB2))
                    .append("i");
        } else {
            sB.append((double)(numA * numA2 + numB * numB2) / (numA2 * numA2 + numB2 * numB2));
        }
        return sB.toString();
    }
}
