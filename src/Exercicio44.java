public class Exercicio44 {
    public static void main(String[] args) {
        String[] vendedores = {"Ana", "Bruno", "Caio", "Dani"}; double[] vendas = {12500, 8700, 10300, 9900}; double total = 0, maior = vendas[0];
        for (int i = 0; i < vendas.length; i++) { total += vendas[i]; maior = Math.max(maior, vendas[i]); if (vendas[i] >= 10000) System.out.println(vendedores[i] + " atingiu a meta"); }
        System.out.printf("Equipe: R$ %.2f | Maior venda: R$ %.2f%n", total, maior);
    }
}
