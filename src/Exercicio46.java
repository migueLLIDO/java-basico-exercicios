public class Exercicio46 {
    public static void main(String[] args) {
        boolean usuarioAtivo = true, senhaValida = true, bloqueado = false, administrador = false;
        boolean podeAcessar = !bloqueado && (administrador || (usuarioAtivo && senhaValida));
        System.out.println("Acesso autorizado: " + podeAcessar);
    }
}
