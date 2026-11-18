public class Exercicio45 {
    public static void main(String[] args) {
        double totalCompra = 180; boolean assinante = false; double distanciaKm = 12; double frete = totalCompra >= 300 || assinante ? 0 : 15 + .80 * distanciaKm;
        System.out.printf("Frete: R$ %.2f%n", frete);
    }
}
