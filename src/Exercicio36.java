public class Exercicio36 {
    public static void main(String[] args) {
        int tentativa = 0; boolean sucesso = false;
        do { tentativa++; sucesso = tentativa == 3; System.out.printf("Tentativa %d: %s%n", tentativa, sucesso ? "sucesso" : "falha"); } while (!sucesso && tentativa < 4);
    }
}
