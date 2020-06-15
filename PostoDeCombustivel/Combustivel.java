
/**
 * Esta classe calcula o valor de cada combustivel
 * 
 * @author Pedro Hennrique Fernandes Schmidt
 * @version 1.0
 * @since 2020-06-01 02:25PM
 */
public class Combustivel {
    
    //constantes
    public static final double PRECO_DA_GASOLINA = 4.49;
    public static final double PRECO_DO_ALCOOL = 3.68;
    public static final double PRECO_DO_DIESEL = 3.71;
    
    //variáveis
    private double quantidadeEmLitros;
    private byte tipoDeCombustivel;
    
    //construtores
    public Combustivel(){
        
    }
    
    public Combustivel(byte tipoDeCombustivel, double quantidadeEmLitros){
        this.tipoDeCombustivel = tipoDeCombustivel;
        this.quantidadeEmLitros = quantidadeEmLitros;
    }
    
    //gets e sets
    public double getQuantidadeEmLitros(){
        return this.quantidadeEmLitros;
    }
    
    public void setQuantidadeEmLitros(double quantidadeEmLitros){
        this.quantidadeEmLitros = quantidadeEmLitros;
    }
    
    public byte getTipoDeCombustivel(){
        return this.tipoDeCombustivel;
    }
    
    public void setTipoDeCombustivel(byte tipoDeCombustivel){
        this.tipoDeCombustivel = tipoDeCombustivel;
    }
    
    //Métodos
    /**
     * Calcula o valor a pagar conforme o combustivel
     * @param tipoDeCombustivel byte - Tipo do combustível
     * @param quantidadeEmLitros Double - Quantidade em litros de combustível
     * @return Double - Valor a pagar
     */
    public double calcularValorAPagar(byte tipoDeCombustivel, 
                                      double quantidadeEmLitros){
        double valorAPagar = 0;
        switch(tipoDeCombustivel){
            case 1:
                valorAPagar = this.PRECO_DA_GASOLINA * quantidadeEmLitros;
                break;
            case 2:
                valorAPagar = this.PRECO_DO_ALCOOL * quantidadeEmLitros;
                break;
            case 3:
                valorAPagar = this.PRECO_DO_DIESEL * quantidadeEmLitros;
                break;
            case 4:
                break;
            default:
                System.out.println("Erro");
                break;
        }
        return valorAPagar;
    }
    
    //Método toString
    @Override
    public String toString(){
        String flex = "";
        if(this.tipoDeCombustivel == 4){
            flex = "\nAlcool: R$" 
                        + this.calcularValorAPagar
                        ((byte)2, this.quantidadeEmLitros)
                        + "\nGasolina: R$"
                        + this.calcularValorAPagar
                        ((byte)1, this.quantidadeEmLitros);
        }
        return "\nValor a pagar: R$" + flex 
               + this.calcularValorAPagar
               (this.tipoDeCombustivel, this.quantidadeEmLitros);
    }
}
