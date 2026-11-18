public class Exercicio32 {
    public static void main(String[] args) {
        boolean pagamentoAprovado = true; int estoque = 12; int quantidade = 3; boolean enderecoValido = true;
        boolean podeEnviar = pagamentoAprovado && estoque >= quantidade && enderecoValido;
        System.out.println("Pedido enviado: " + podeEnviar);
    }
}
