public class Exercicio33 {
    public static void main(String[] args) {
        int impacto = 8; String prioridade = impacto >= 9 ? "Crítico" : impacto >= 7 ? "Alto" : impacto >= 4 ? "Médio" : "Baixo";
        System.out.println("Prioridade: " + prioridade);
    }
}
