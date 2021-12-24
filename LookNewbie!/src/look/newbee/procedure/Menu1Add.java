package look.newbee.procedure;

import look.newbee.db.Employee;
import look.newbee.db.EmployeeDb;

public class Menu1Add extends MenuProcedure {
    @Override
    public void proc() {
        println();
        println("사원등록을 선택하셨습니다.");
        print("성명> ");
        String name = nextLine();
        print("나이> ");
        int age = nextInt();
        print("경력> ");
        int career = nextInt();
        print("입사연봉(만원단위)> ");
        int pay = nextInt();

        Employee employee = new Employee(name, age, career, pay);
        EmployeeDb.getInstance().insert(employee);
        print("사원이 등록되었습니다. 사원번호 " + employee.getNo() + "입니다.");
        println();
    }
}
