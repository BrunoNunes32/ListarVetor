public class Main {
  // FUNÇÃO PARA FAZER UMA VARREDURA DOS VETOR E IMPRIMIR NA TELA
  public static void exibirArray(int[] vetor, int n) {
    System.out.println("Valores no Array: ");
    for (int i = 0; i < n; i++) {
      System.out.print(vetor[i] + " - ");
    }
    System.out.println("");
  }

  public static void main(String[] args) {
    int i, aux, j, n = 50;
    int listaNum[] = new int[50];
    // ADICIONANDO VALORES NO VETOR - AQUI O VETOR IRÁ DE 0 A 49, CONTENDO 50
    // ESPAÇOS NO VETOR
    for (i = 1; i < n; i++) {
      listaNum[i] = i;
    }
    exibirArray(listaNum, n);
    j = n - 1;
    i = 0;
    // FAZENDO UMA VARREDURA NO VETOR PARA QUE POSSA LISTAR OS VALORES INVERTIDOS
    while (i < j) {
      aux = listaNum[i];
      listaNum[i] = listaNum[j];
      listaNum[j] = aux;
      j--;
      i++;
    }
    exibirArray(listaNum, n);
  }
}