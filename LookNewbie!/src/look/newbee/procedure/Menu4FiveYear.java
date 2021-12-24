package look.newbee.procedure;

import look.newbee.db.Employee;
import look.newbee.db.EmployeeDb;

public class Menu4FiveYear extends MenuProcedure {
    private double getIncPercentage(int career) {
        if (career < 6)     return 1.11;
        if (career < 10)    return 1.05;
        if (career < 19)    return 1.03;
        return 1.02;
    }

    private String get5YearPay(int curCareer, int curPay) {
        StringBuilder sb = new StringBuilder();
        int pay = curPay;
        for (int i = 1; i <= 5; i++) {
            pay = (int) (pay * getIncPercentage(curCareer + i));
            sb.append(i).append("년후 : ").append(pay).append("만원\n");
        }
        return sb.toString();
    }

    @Override
    public void proc() {
        println();
        println("사원 추후 5년 경력별 연봉 조회를 선택하셨습니다.");
        print("사원번호> ");
        int no = nextInt();
        println();

        Employee tmp = EmployeeDb.getInstance().select(no);
        if (tmp == null) {
            println("해당하는 사원이 없습니다.");
            return;
        }
        println(tmp.getName()+"님의 추후 5년 예상연봉은");
        println(get5YearPay(tmp.getCareer(), tmp.getPay()));
    }
}
