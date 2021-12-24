package look.newbee;

import look.newbee.config.IOManager;
import look.newbee.config.Tags;
import look.newbee.procedure.MenuProcedure;
import look.newbee.procedure.MenuProcedureFactory;

import java.io.IOException;

public class EmployeeManager {
    // IO
    private void print(String s)    { System.out.print(s); }
    private void println(String s)  { System.out.println(s); }
    private void println()          { System.out.println(); }
    private int nextInt()           { return IOManager.sc.nextInt(); }
    private void clearConsole()     { int n=20; while(n-->0) println(); }
    private void pause() throws IOException     { System.in.read(); }

    private int getMenuNumInput() {
        println(" -----------------------------------------------------------------------------------");
        println(" 1.사원등록 | 2.사원조회 | 3.경력별 연봉 증가률 조회 | 4.사원 추후 5년 경력별 연봉 조회 | 5.종료");
        println(" -----------------------------------------------------------------------------------");
        print("선택>");
        return nextInt();
    }

    public void run() throws IOException {
        clearConsole();
        int userInput = -1;
        while( (userInput = getMenuNumInput()) != Tags.MENU.M5_EXIT) {
            MenuProcedure menuProcedure = MenuProcedureFactory.getMenuProcedure(userInput);
            menuProcedure.proc();

            System.out.println("아무 키나 누르시면 메뉴로 돌아갑니다.");
            pause();
            clearConsole();
        }
    }
}
