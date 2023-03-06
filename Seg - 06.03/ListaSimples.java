// Lista Simplesmente Ligada
public class ListaSimples {
  private No primeiro;

  // por clareza
  public ListaSimples () {
      setPrimeiro(null);
  }
  public No getPrimeiro() { 
    return this.primeiro;
  }
  public void setPrimeiro (No primeiro){
    this.primeiro = primeiro;
  }
  public boolean estaVazia() {
    return this.primeiro==null;
  }
  public void insereInicio (int i) {
    // cria uma variável que referencia No(i)
    No novo = new No(i);
    // Se não está vazia:
    // Atualiza o campo "próximo" do No para o endereço do primeio da lista.
    if (!this.estaVazia()) {
      novo.setProximo(this.primeiro);
    }
    // Insere o elemento no primeiro da lista.
    setPrimeiro(novo);
  }
}