public class Main {
    private void solution() throws Exception {
        StringBuilder sb = new StringBuilder();
        for (int i = 2021; i < 2100; i++) {
            for (int m = 1; m <= 12; m++) {
                for (int d = 1; d <= 31; d++) {
                    int cur = i * 10000 + m * 100 + d;
                    String str = String.valueOf(cur);
                    boolean ok = true;
                    for (int c = 0; c < str.length()/2; c++) {
                        if (str.charAt(c) != str.charAt(str.length()-1-c)) {
                            ok = false;
                            break;
                        }
                    }

                    if (ok) {
                        sb.append(str).append('\n');
                    }
                }
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
