import entities.NumeroRomanoConvertido;
import entities.RomanNumeralConverter;

public class Program {
    public static void main(String[] args) {
        RomanNumeralConverter romanNumeralConverter = new RomanNumeralConverter();
        int number = romanNumeralConverter.convert("V");

        NumeroRomanoConvertido numeroRomanoConvertido = new NumeroRomanoConvertido();
        int numero = numeroRomanoConvertido.convert("XXII");

        System.out.println("Primeiro exemplo: ");
        System.out.println(number);

        System.out.println("Segundo exemplo: ");
        System.out.println(numero);

    }
}
