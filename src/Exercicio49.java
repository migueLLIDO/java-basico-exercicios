public class Exercicio49 {
    public static void main(String[] args) {
        String[] nomes = {"Ana", "Beto", "Caio", "Duda"}; double[] notas = {8.5, 6.0, 9.2, 7.0}; double soma = 0, maior = notas[0]; int aprovados = 0;
        for (int i = 0; i < nomes.length; i++) { soma += notas[i]; maior = Math.max(maior, notas[i]); boolean aprovado = notas[i] >= 7; if (aprovado) aprovados++; System.out.printf("%s: %.1f - %s%n", nomes[i], notas[i], aprovado ? "Aprovado" : "Reprovado"); }
        System.out.printf("Média: %.2f | Aprovados: %d | Maior nota: %.1f%n", soma / notas.length, aprovados, maior);
    }
}
