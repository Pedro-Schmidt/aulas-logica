public class Principal {

    public static void main(String args[]) {
        
        System.out.println("\f");
        
        Calculadora calculadora = new Calculadora();
        
        calculadora.setNumero1(10);
        calculadora.setNumero2(3);        
        
        System.out.println(calculadora);
        
        /*System.out.println("Número 1 : " + calculadora.getNumero1()
                         + "\nNúmero 2 : " + calculadora.getNumero2()
                         + "\nSoma: " + calculadora.somar()
                         + "\nSubtração: " + calculadora.subtrair()
                         + "\nMultiplicação: " + calculadora.multiplicar()
                         + "\nDivisão: " + calculadora.dividir());*/
        
    }
}