import java.util.Scanner;
/**
 * Classe principal, ultiliza os métodos da classe Combustivel
 * 
 * @author Pedro Hennrique Fernande Schmidt 
 * @version 1.0
 * @since 2020-06-01 02:14PM
 */
public class Principal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        Combustivel combustivel = new Combustivel();
        
        System.out.print("Digite quantos litros quer abastecer: ");
        combustivel.setQuantidadeEmLitros(scanner.nextDouble());
        
        System.out.print("\nSelecione uma opção:"
                       + "[1] Gasolina"
                       + "[2] Alcool"
                       + "[3] Diesel"
                       + "[4] Flex");
        combustivel.setTipoDeCombustivel(scanner.nextByte());
        
        System.out.println(combustivel);
    }
}
