package look.newbee.procedure;

import look.newbee.config.IOManager;

public abstract class MenuProcedure {
    void print(String s)    { System.out.print(s); }
    void println(String s)  { System.out.println(s); }
    void println()          { System.out.println(); }
    int nextInt()           { return IOManager.sc.nextInt(); }
    String nextLine()       { return IOManager.sc.next(); }

    public abstract void proc();
}
