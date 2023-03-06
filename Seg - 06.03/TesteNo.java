public class TesteNo {
  public static void main (String[] args) {
    No no1 = new No(10);
    No no2 = new No(20);

    System.out.println("No1: " + no1);
    System.out.println("No2: " + no2);

    // Insere uma nova informação no No2.
    no2.setInfo(1);
    System.out.println("Novo no2: " + no2);

    // Indica qual será o próximo nó.
    // Pode fazer uma auto referência.
    no1.setProximo(no2);
    no1.getProximo().setInfo(30);
    System.out.println("Novo novo no2: " + no2);

  }
}
