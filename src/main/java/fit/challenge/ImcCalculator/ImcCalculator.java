package fit.challenge.ImcCalculator;

import java.lang.Math;

public class ImcCalculator {
    public static String calculate(Double peso, Double altura) {

        Double imcCalc =  (peso / (Double) Math.pow(altura,2));
        imcCalc = imcCalc * Math.pow(10, 2); 
        imcCalc = Math.floor(imcCalc);
        imcCalc = imcCalc / Math.pow(10, 2);
        String resultadoImc = "";
        if (imcCalc < 17.0) {
              resultadoImc = "Muito abaixo do peso";
        } else if (imcCalc >= 17.0 & imcCalc <= 18.49 ) {
              resultadoImc = "Magreza";
        } else if (imcCalc >= 18.5 & imcCalc <= 24.99) {
              resultadoImc = "Normal";
        } else if (imcCalc >= 25.0 & imcCalc <= 29.99) {
              resultadoImc = "Sobrepeso";
        } else if (imcCalc >= 30.0 & imcCalc <= 34.99) {
              resultadoImc = "Obesidade";
        } else if (imcCalc >= 35.0 & imcCalc <= 39.99) {
              resultadoImc = "Obesidade II (severa)";
        } else if (imcCalc >= 40.0) {
              resultadoImc = "Obesidade III (mórbida)";          
        }
        return resultadoImc;
    }

}
