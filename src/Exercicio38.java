public class Exercicio38 {
    public static void main(String[] args) {
        for (int fileira = 1; fileira <= 4; fileira++) { for (int assento = 1; assento <= 6; assento++) System.out.printf("F%dA%d%s", fileira, assento, assento == 6 ? "%n" : " | "); }
    }
}
