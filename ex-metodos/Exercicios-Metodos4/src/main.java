/**
 *
 * @author ana.cardoz
 */

/*QUESTÃO 04*/
public class main {
    public static void main(String[] args) {
        
        double celsius = 25;
        double fahrenheit = 77;
        double kelvin = 298.15;
        double reaumur = 20;
        double rankine = 537.87;
        
        System.out.println(celsius + "°C = " + celsiusParaFahrenheit(celsius) + "°F");
        System.out.println(fahrenheit + "°F = " + fahrenheitParaCelsius(fahrenheit) + "°C");
        System.out.println(celsius + "°C = " + celsiusParaKelvin(celsius) + "K");
        System.out.println(kelvin + "K = " + kelvinParaCelsius(kelvin) + "°C");
        System.out.println(celsius + "°C = " + celsiusParaReaumur(celsius) + "°Re");
        System.out.println(reaumur + "°Re = " + reaumurParaCelsius(reaumur) + "°C");
        System.out.println(kelvin + "K = " + kelvinParaRankine(kelvin) + "°R");
        System.out.println(rankine + "°R = " + rankineParaKelvin(rankine) + "K");
        
    }
    
}
