package eng.lab.englishgrammer.partofspeech.numeral;

import eng.lab.englishgrammer.utils.ConstantData;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/8/14 21:55
 * @Description: 基数词
 */
public class CardinalNumeral {

    public static String FIRST = "first";
    public static String SECOND = "second";
    public static String THIRD = "third";
    public static String FOURTH = "fourth";
    public static String FIFTH = "fifth";
    public static String SIXTH = "sixth";
    public static String SEVENTH = "seventh";
    public static String EIGHTH = "eighth";
    public static String NINTH = "ninth";
    public static String TENTH = "tenth";

    public static String ELEVENTH = "eleventh";
    public static String TWELFTH = "twelfth";
    public static String THIRTEENTH = "thirteenth";
    public static String FOURTEENTH = "fourteenth";
    public static String FIFTEENTH = "fifteenth";
    public static String SIXTEENTH = "sixteenth";
    public static String SEVENTEENTH = "seventeenth";
    public static String EIGHTEENTH = "eighteenth";
    public static String NINETEENTH = "nineteenth";

    public static String TWENTIETH = "twentieth";
    public static String THIRTIETH = "thirtieth";
    public static String FORTIETH = "fortieth";
    public static String FIFTIETH = "fiftieth";
    public static String SIXTIETH = "sixtieth";
    public static String SEVENTIETH = "seventieth";
    public static String EIGHTIETH = "eightieth";
    public static String NINETIETH = "ninetieth";

    public static String HUNDREDTH = "hundredth";
    public static String THOUSANDTH = "thousandth";
    public static String MILLIONTH = "millionth";
    public static String BILLIONTH = "billionth";

    public String biggerThan20(String tensDigitByOrdinal, String singleDigit) {
        return tensDigitByOrdinal + "-" +  singleDigit;
    }

    public String biggerThan100(String hundredsDigit, String lessHundredsDigit) {
        return hundredsDigit + ConstantData.spilt + OrdinalNumeral.HUNDRED + ConstantData.spilt + lessHundredsDigit;
    }

    public String biggerThan1000(String thousandsDigit, String lessThousandsDigit) {
        return thousandsDigit + ConstantData.spilt + OrdinalNumeral.THOUSAND + ConstantData.spilt + lessThousandsDigit;
    }

    public String biggerThan1000000(String millionsDigit, String lessMillionsDigit) {
        return millionsDigit + ConstantData.spilt + OrdinalNumeral.MILLION + ConstantData.spilt + lessMillionsDigit;
    }

    public String biggerThan1000000000(String billionsDigit, String lessBillionsDigit) {
        return billionsDigit + ConstantData.spilt + OrdinalNumeral.BILLION + ConstantData.spilt + lessBillionsDigit;
    }
}
