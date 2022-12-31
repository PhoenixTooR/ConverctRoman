package entities;

import java.util.Map;

public class RomanNumeralConverter {
    private static  final Map<Character,Integer> ROMAN_NUMERAL_VALUE = Map.of(
            'I',1,
            'V',5,
            'X',10,
            'L',50,
            'C',100,
            'D',500,
            'M',1000
    );
    public static int convert(String romanNumeral){
        int result = 0;
        int prevValue = 0;

        for (int i= romanNumeral.length() - 1; i >= 0; i --){
            int value = ROMAN_NUMERAL_VALUE.get(romanNumeral.charAt(i));
            if (value < prevValue){
                result -= value;
            }else {
                result += value;
                prevValue = value;
            }
        }
        return result;

    }
}
