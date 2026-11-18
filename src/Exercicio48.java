public class Exercicio48 {
    public static void main(String[] args) {
        int meta = 250, porCiclo = 37, producao = 0, ciclos = 0;
        while (producao < meta) { int lote = Math.min(porCiclo, meta - producao); producao += lote; ciclos++; System.out.printf("Ciclo %d: +%d (total %d)%n", ciclos, lote, producao); }
        System.out.println("Ciclos: " + ciclos);
    }
}
