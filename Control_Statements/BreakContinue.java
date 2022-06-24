package Control_Statements;

public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 2; i < 18; i++) {
            System.out.print(i+" ");
            if (i%2==0)
                continue;
            System.out.println(" ");
        }
    }
}
