package look.newbee.procedure;

import look.newbee.db.Employee;
import look.newbee.db.EmployeeDb;

public class Menu2List extends MenuProcedure {
    @Override
    public void proc() {
        println();
        println("사원조회를 선택하셨습니다.");
        print("사원번호> ");
        int no = nextInt();

        Employee tmp = EmployeeDb.getInstance().select(no);
        if (tmp == null) {
            println("해당하는 사원이 없습니다.");
            return;
        }

        println("성명 : " + tmp.getName());
        println("나이 : " + tmp.getAge());
        println("경력 : " + tmp.getCareer());
        println();
    }
}
