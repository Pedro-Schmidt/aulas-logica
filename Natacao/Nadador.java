
/**
 * Esta classe armazena o nome e a idade do nadador
 *  e também verifica sua categoria
 * 
 * @author Pedro Hennrqiue Fernandes Schmidt 
 * @version 1.0
 * @since 2020-06-01 03:43PM
 */
public class Nadador {
    //variáveis
    private String nome;
    private byte idade;
    
    //Construtores
    public Nadador() {
        
    }
    
    public Nadador(String nome, byte idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    //Gets e sets
    public String getNome() {
        return this.nome;
    }
    
    public byte getIdade() {
        return this.idade;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setIdade(byte idade) {
        this.idade = idade;
    }
    
    //Métodos
    /**
     * Verifica a categoria do nadador
     * @return String - Categoria que o nadador se encontra
     */
    public String verificarCategoria() {
        String categoria = "";
        if(this.idade < 8) {
            categoria = "Não se enquadra em nenhuma categoria";
        }else if(this.idade >= 8 && this.idade <=10) {
            categoria = "Infantil";
        }else if(this.idade >= 11 && this.idade <= 17) {
            categoria = "Juvenil";
        }else {
            categoria = "Adulto";
        }
        return categoria;
    }
    
    //método toString
    public String toString() {
        return "\nOlá " + this.nome 
             + "\nSua categoria é: " + this.verificarCategoria();
    }
}
