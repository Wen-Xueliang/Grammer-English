package eng.lab.englishgrammer.partofspeech.determiner.numeral;

import eng.lab.englishgrammer.utils.ConstantData;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/8/14 21:55
 * @Description: 序数词
 */
public class OrdinalNumeral {
    //在句中可作主语、宾语、定语、表语、同位语。

    public static String ONE = "one";
    public static String TWO = "two";
    public static String THREE = "three";
    public static String FOUR = "four";
    public static String FIVE = "five";
    public static String SIX = "six";
    public static String SEVEN = "seven";
    public static String EIGHT = "eight";
    public static String NINE = "nine";
    public static String TEN = "ten";

    public static String ELEVEN = "eleven";
    public static String TWELVE = "twelve";
    public static String THIRTEEN = "thirteen";
    public static String FOURTEEN = "fourteen";
    public static String FIFTEEN = "fifteen";
    public static String SIXTEEN = "sixteen";
    public static String SEVENTEEN = "seventeen";
    public static String EIGHTEEN = "eighteen";
    public static String NINETEEN = "nineteen";

    public static String TWENTY = "twenty";
    public static String THIRTY = "thirty";
    public static String FORTY = "forty";
    public static String FIFTY = "fifty";
    public static String SIXTY = "sixty";
    public static String SEVENTY = "seventy";
    public static String EIGHTY = "eighty";
    public static String NINETY = "ninety";

    public static String HUNDRED = "hundred";
    public static String THOUSAND = "thousand";
    public static String MILLION = "million";
    public static String BILLION = "billion";

    public String biggerThan20(String tensDigit, String singleDigit) {
        return tensDigit + "-" +  singleDigit;
    }

    public String biggerThan100(String hundredsDigit, String lessHundredsDigit) {
        return hundredsDigit + ConstantData.spilt + HUNDRED + ConstantData.spilt + lessHundredsDigit;
    }

    public String biggerThan1000(String thousandsDigit, String lessThousandsDigit) {
        return thousandsDigit + ConstantData.spilt + THOUSAND + ConstantData.spilt + lessThousandsDigit;
    }

    public String biggerThan1000000(String millionsDigit, String lessMillionsDigit) {
        return millionsDigit + ConstantData.spilt + MILLION + ConstantData.spilt + lessMillionsDigit;
    }

    public String biggerThan1000000000(String billionsDigit, String lessBillionsDigit) {
        return billionsDigit + ConstantData.spilt + BILLION + ConstantData.spilt + lessBillionsDigit;
    }

}
