public class Exercicio43 {
    public static void main(String[] args) {
        String[] produtos = {"Café", "Arroz", "Feijão", "Açúcar"}; int[] estoques = {3, 12, 7, 2}; int reposicoes = 0;
        for (int i = 0; i < produtos.length; i++) { String situacao = estoques[i] < 5 ? "REPOR" : estoques[i] < 10 ? "ATENÇÃO" : "OK"; if (estoques[i] < 5) reposicoes++; System.out.printf("%s: %d - %s%n", produtos[i], estoques[i], situacao); }
        System.out.println("Itens para reposição: " + reposicoes);
    }
}
