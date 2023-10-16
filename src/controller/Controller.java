package controller;

import Service.Operations;
import model.Functions;
import model.FunctionsComplex;
import model.Logger;
import model.Outter;
import view.CalculationView;
import view.Text;
import view.View;

import java.util.Scanner;

public class Controller {

    /** menu() - Функция запускает меню с выбором
     *  вариантов вычислений с целыми, дробными или комплексными числами
     */
    public void menu() {

        Scanner cs = new Scanner(System.in);
        Operations operations;
        Logger logger = new Outter();

        boolean flag = true;
        while (flag) {
            Text.welcome();

            int num = cs.nextInt();

            switch (num) {
                case 1 ->{
                    operations = new Operations(new CalculationView(), new Functions(), logger);
                    operations.subMenu();
                }
                case 2 -> {
                    operations = new Operations(new CalculationView(), new FunctionsComplex(), logger);
                    operations.subMenuComplex();
                }
                case 3 -> logger.readHistory();
                case 4 -> flag = false;
                default -> Text.noThatNumber();
            }

        }

    }
}
