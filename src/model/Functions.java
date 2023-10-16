package model;

import view.Text;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Functions implements Calculate {



    public String sum(Number numA, Number numB) {
        double result = 0;
        result = numA.doubleValue() + numB.doubleValue();
        return numA + " + " + numB + " = " +  result;
    }

    @Override
    public String subtraction(Number numA, Number numB) {
        double result = 0;
        result = numA.doubleValue() - numB.doubleValue();
        return numA + " - " + numB + " = " + result;
    }

    @Override
    public String division(Number numA, Number numB) {
        double result = 0;
        result = numA.doubleValue() / numB.doubleValue();
        return numA + " / " + numB + " = " + result;
    }

    @Override
    public String multiplication(Number numA, Number numB) {
        double result = 0;
        result = numA.doubleValue() * numB.doubleValue();
        return numA + " * " + numB + " = " + result;
    }
}
