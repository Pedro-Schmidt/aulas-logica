
/**
 * Esta classe calcula qual o trimestre que o usuário nasceu
 * 
 * @author Pedro Hennrique Fernandes Schmidt 
 * @version 1.0
 * @since 2020-06-01 01:18PM
 */
public class Trimestre {
    
    //Variáveis
    private byte mesDeNascimento;
    
    //Construtores
    public Trimestre() {
        
    }
    
    public Trimestre(byte mesDeNascimento) {
        this.mesDeNascimento = mesDeNascimento;
    }
    
    //Gets e sets
    /**
     * @return Byte - Mês do nascimento
     */
    public byte getMesDeNascimento() {
        return this.mesDeNascimento;
    }
    
    /**
     * @param mesDeNascimento byte - Mês de nascimento
     */
    public void setMesDeNascimento(byte mesDeNascimento) {
        /**
         * if ultilizado para verificar se o mês inserido é válido
         */
        if(mesDeNascimento <= 12 && mesDeNascimento >= 1) {
            this.mesDeNascimento = mesDeNascimento;
        }else {
            System.out.println("Erro");
        }
    }
    
    //Métodos
    /**
     * Método para calcular qual trimestre nasceu
     * @return byte - Retirna o trimestre que nasceu
     */
    public byte calcularTrimestreDoNascimento() {
        byte trimestreQueNasceu = 0;
        if(this.mesDeNascimento <= 3) {
            trimestreQueNasceu = 1;
        }else if(this.mesDeNascimento <= 6) {
            trimestreQueNasceu = 2;
        }else if(this.mesDeNascimento <= 9) {
            trimestreQueNasceu = 3;
        }else {
            trimestreQueNasceu = 4;
        }
        return trimestreQueNasceu;
    }
    
    //Método toString()
    @Override
    public String toString() {
        return "Você nasceu no " 
              + this.calcularTrimestreDoNascimento()
              +"\u00BA trimestre!";
    }
}
