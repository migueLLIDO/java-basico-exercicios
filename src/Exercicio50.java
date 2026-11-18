public class Exercicio50 {
    public static void main(String[] args) {
        String produto = "Teclado", status = "NOVO"; int quantidade = 2, estoque = 5; double preco = 240; boolean vip = true, pagamentoAprovado = true; double total = quantidade * preco; if (vip && total >= 400) total *= .90; boolean validado = pagamentoAprovado && estoque >= quantidade;
        String proximaAcao = switch (status) { case "NOVO" -> validado ? "Separar pedido" : "Revisar pagamento/estoque"; case "PAGO" -> "Preparar envio"; case "ENVIADO" -> "Acompanhar entrega"; case "CANCELADO" -> "Estornar"; default -> "Verificar status"; };
        System.out.printf("%s x%d | Total: R$ %.2f | Pagamento válido: %s | Ação: %s%n", produto, quantidade, total, validado, proximaAcao);
    }
}
