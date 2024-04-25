package pro.sky.domRab2_8;

public class Employee {
    private String lastNameEmployee;
    private String nameEmployee;
    private String surnameEmployee;

    private int departEmployee;
    private float salaryEmployee;
    private final String valute = "руб.";

    public Employee(String lastNameEmployee, String nameEmployee, String surnameEmployee, int depart, float salaryEmployee) {
        this.lastNameEmployee = lastNameEmployee;
        this.nameEmployee = nameEmployee;
        this.surnameEmployee = surnameEmployee;
        this.departEmployee = depart;
        this.salaryEmployee = salaryEmployee;
    }

    @Override
    public String toString() {
        return "\n" + lastNameEmployee + " " + nameEmployee + " " + surnameEmployee + " " +
                "отдел: " + departEmployee +
                ", зарплата: " + salaryEmployee + " " + valute;
    }

    public String getLastNameEmployee() {
        return lastNameEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public String getSurnameEmployee() {
        return surnameEmployee;
    }

    public float getSalaryEmployee() {
        return salaryEmployee;
    }

    public int getDepartEmployee() {
        return departEmployee;
    }

}
