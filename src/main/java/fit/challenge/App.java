package fit.challenge;
import fit.challenge.ImcCalculator.*;
import java.text.DecimalFormat;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String resultado = "";
        resultado = ImcCalculator.calculate(88.0, 1.77);
        System.out.println(resultado);
        resultado = ImcCalculator.calculate(57.92, 1.77);
        System.out.println(resultado);
        resultado = ImcCalculator.calculate(77.97, 1.77);
        System.out.println(resultado);
        resultado = ImcCalculator.calculate(93.98, 1.77);
        System.out.println(resultado );
        resultado = ImcCalculator.calculate(94.00, 1.77);
        System.out.println(resultado);

    }
}
