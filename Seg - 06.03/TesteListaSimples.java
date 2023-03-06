public class TesteListaSimples {
  public static void main(String[] args) {
    ListaSimples l1 = new ListaSimples();
    if (l1.estaVazia()) {
      System.out.println("Lista criada com sucesso!");
    }
    else {
      System.out.println("Algo deu errado...");
    }
  }
}