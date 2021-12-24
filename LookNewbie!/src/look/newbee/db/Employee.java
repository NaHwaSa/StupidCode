package look.newbee.db;

import look.newbee.config.EmployeeNoFactory;

public class Employee {
    private String name;
    private int age;
    private int career;
    private int pay;
    private int no;

    public Employee(String name, int age, int career, int pay) {
        this.name = name;
        this.age = age;
        this.career = career;
        this.pay = pay;
        this.no = EmployeeNoFactory.nextNo();
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getCareer() {
        return career;
    }
    public int getNo() {
        return no;
    }
    public int getPay() { return pay; }
}
