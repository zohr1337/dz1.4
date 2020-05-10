package dz;


import java.util.Scanner;

class Employees {
    private static final int CURRENT_YEAR = 2020;
    private static String surname;
    private static int salary;
    private static int birthYear;
    private static String position;
    private static int age;
    private static final Scanner SCANNER = new Scanner(System.in);

    Employees(String surname, int salary, int birthYear, String position){
        this.surname = surname;
        this.salary = salary;
        this.birthYear = birthYear;
        this.position = position;
        getAge();

    }
    String getFullInfo() {
        return  this.surname + ", " +
                this.getAge() + "год(лет), " +
                this.position + ". Зарплата: " +
                this.getSalary() + " RUR.";
    }



    public int getAge() {
       return CURRENT_YEAR - birthYear;
    }

    private void setAge(int birthYear) {
        this.birthYear = birthYear;
    }


    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return this.position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary() {
       this.salary = salary;
    }

}
