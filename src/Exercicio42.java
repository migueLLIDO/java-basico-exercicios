public class Exercicio42 {
    public static void main(String[] args) {
        double salarioBase = 3500, horasExtras = 8, valorHoraExtra = 35; double bruto = salarioBase + horasExtras * valorHoraExtra; double aliquota = bruto >= 4000 ? .08 : .05; double desconto = bruto * aliquota;
        System.out.printf("Bruto: R$ %.2f | Desconto: R$ %.2f | Líquido: R$ %.2f%n", bruto, desconto, bruto - desconto);
    }
}
