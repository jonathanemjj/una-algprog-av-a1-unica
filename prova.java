import java.util.Scanner;

public class prova {
   public static void main(String[] args) {
   
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o nome do usuário: ");
    String usuario = sc.nextLine();

    System.out.println("Digite o cargo do profissional: ");
    String cargo = sc.nextLine();

    System.out.println("Digite o nível de acesso (1-10): ");
    int nivelAcesso = sc.nextInt();

    System.out.println("Digite o nivel de sigilo da area (1-10); ");
    int nivelSigilo = sc.nextInt();

    if (nivelAcesso < 1 || nivelAcesso > 10){
    System.out.println("Erro: Nível de acesso inválido.");
}
else if (nivelAcesso < 3 || nivelSigilo > 7 ){
    System.out.println("ALERTA: Tentativa de acesso indevida detectada!");
}
else if (nivelAcesso >= nivelSigilo){
    System.out.println("ACESSO PERMITIDO!");
}
else if (nivelAcesso < nivelSigilo) {
    System.out.println("ACESSO NEGADO");
}
sc.close();
}
}