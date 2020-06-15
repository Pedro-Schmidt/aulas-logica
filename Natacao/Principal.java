import java.util.Scanner;
/**
 * Classe principal, ultiliza métodos da classe Nadador
 * 
 * @author Pedro Hennrique Fernandes Schmidt 
 * @version 1.0
 * @since 2020-06-01 04:05PM
 */
public class Principal {
    public static void main(String[] args) {
        System.out.println("\f");
        
        Scanner scanner = new Scanner(System.in);
        
        Nadador nadador = new Nadador();
        
        System.out.print("Digite seu nome: ");
        nadador.setNome(scanner.next());
        scanner.nextLine();
        
        System.out.print("Digite sua idade: ");
        nadador.setIdade(scanner.nextByte());
        
        System.out.println(nadador);
    }
}
