package look.newbee.procedure;

public class Menu3Inc extends MenuProcedure {
    @Override
    public void proc() {
        println();
        println("경력별 연봉 증가률 조회를 선택하셨습니다.\n" +
                "    0~6년: 11%\n" +
                "   7~10년: 5%\n" +
                "  11~19년: 3%\n" +
                " 20년 이상: 2%");
    }
}
