package eng.lab.englishgrammer.partofspeech.determiner.numeral;

import eng.lab.englishgrammer.partofspeech.determiner.Determiner;
import eng.lab.englishgrammer.partofspeech.noun.Noun;
import eng.lab.englishgrammer.utils.ConstantData;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/5/29 22:25
 * @Description: 量词:表示数量单位的词
 */
public class Quantifier extends Numeral {

    String text;

    public Quantifier(OrdinalNumeral ordinalNumeral, Noun noun) {
        text = ordinalNumeral.toString() + ConstantData.spilt + noun.toString() + ConstantData.spilt + "of";
    }
}
