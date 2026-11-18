public class Exercicio41 {
    public static void main(String[] args) {
        String[] produtos = {"Notebook", "Mouse", "Monitor"}; int[] quantidades = {1, 2, 1}; double[] precos = {2800, 120, 900}; double total = 0;
        for (int i = 0; i < produtos.length; i++) { double subtotal = quantidades[i] * precos[i]; total += subtotal; System.out.printf("%s: %d x R$ %.2f = R$ %.2f%n", produtos[i], quantidades[i], precos[i], subtotal); }
        double desconto = total >= 500 ? total * .10 : 0; System.out.printf("Total: R$ %.2f | Desconto: R$ %.2f | Final: R$ %.2f%n", total, desconto, total - desconto);
    }
}
