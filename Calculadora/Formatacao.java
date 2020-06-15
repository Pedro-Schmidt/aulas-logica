import java.text.DecimalFormat;

public class Formatacao {

    public String formatar(double numero) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return decimalFormat.format(numero);
    }
    
}