import java.util.Scanner;
/**
 * Classe principal, usa a entrada de dados do usuario para ultilizar 
 * nos métodos da classe Trimestre
 * 
 * @author Pedro Hennrique Fernandes Schmidt
 * @version 1.0
 * @since 2020-06-01 01:48PM
 */
public class Principal {
    public static void main(String[] args) {
        
        System.out.println("\f");
        
        byte mesQueNasceu = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o mês do seu nascimento: ");
        mesQueNasceu = scanner.nextByte();
        
        Trimestre trimestre = new Trimestre(mesQueNasceu);
        
        System.out.println(trimestre);
    }
}
