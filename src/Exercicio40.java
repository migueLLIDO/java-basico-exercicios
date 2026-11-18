public class Exercicio40 {
    public static void main(String[] args) {
        String email = "aluno@faculdade.edu.br"; boolean valido = email.contains("@") && email.endsWith(".br");
        System.out.println(valido ? "Formato básico válido" : "Formato inválido");
    }
}
