package dz;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
//        Employees emp1 = new Employees("Ховрин", 500000, 1984, "Бухгалтер");
//        arr[0] = emp1;
//        Employees emp2 = new Employees("Чуркин", 35000, 1991, "Грузчик");
//        Employees emp3 = new Employees("Фомин", 60000, 1973, "Начальник склада");
//        Employees emp4 = new Employees("Зотов", 48000, 1967, "Кладовщик");
//        Employees emp5 = new Employees("Горин", 115000, 1969, "Ген. директор");
//        System.out.println(Arrays.deepToString(arr));
        Employees[] employees = { new Employees("Ховрин", 500000, 1984, "Бухгалтер"),
                new Employees("Чуркин", 35000, 1991, "Грузчик"),
                new Employees("Фомин", 60000, 1973, "Начальник склада"),
                new Employees("Зотов", 48000, 1967, "Кладовщик"),
                new Employees("Горин", 115000, 1969, "Ген. директор")};
        for (int i = 0; i < employees.length; i++)
            System.out.println(employees[i].getFullInfo());

    }

}
