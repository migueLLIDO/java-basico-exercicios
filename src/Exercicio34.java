public class Exercicio34 {
    public static void main(String[] args) {
        String status = "PAGO";
        String acao = switch (status) { case "NOVO" -> "Aguardar pagamento"; case "PAGO" -> "Separar pedido"; case "ENVIADO" -> "Acompanhar entrega"; case "CANCELADO" -> "Estornar pagamento"; default -> "Status desconhecido"; };
        System.out.println(acao);
    }
}
