package look.newbee.procedure;

public class MenuProcedureFactory {
    public static MenuProcedure getMenuProcedure(int menuNum) {
        switch (menuNum) {
            case 1 : return new Menu1Add();
            case 2 : return new Menu2List();
            case 3 : return new Menu3Inc();
            case 4 : return new Menu4FiveYear();
        }
        return null;
    }
}
