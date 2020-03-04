package eng.lab.englishgrammer.phrases.nounPhrase;

import eng.lab.englishgrammer.component.attributive.PostAttributive;
import eng.lab.englishgrammer.component.attributive.PreAttributive;
import eng.lab.englishgrammer.partofspeech.adjective.Adjective;
import eng.lab.englishgrammer.partofspeech.other.MassNoun;
import eng.lab.englishgrammer.partofspeech.noun.Noun;
import eng.lab.englishgrammer.partofspeech.determiner.Determiner;
import eng.lab.englishgrammer.partofspeech.determiner.numeral.Numeral;
import eng.lab.englishgrammer.partofspeech.pronoun.Pronoun;
import eng.lab.englishgrammer.utils.ConstantData;

import java.util.List;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/5/29 22:25
 * @Description: 名词性短语:中心语与它的修饰语一起构成名词性短语,中心语为名词或代词
 * 前置定语+中心语+后置定语，其中定语可选填，中心语必填
 */
public class NounPhrase {

    private String text;

    public NounPhrase(PreAttributive preAttributive, Noun headword,
                      PostAttributive postAttributive) {
        text = preAttributive.toString() + ConstantData.spilt + headword.toString() + ConstantData.spilt + postAttributive.toString();
    }

    public NounPhrase(PreAttributive preAttributive, Pronoun headword,
                      PostAttributive postAttributive) {
        text = preAttributive.toString() + ConstantData.spilt + headword.toString() + ConstantData.spilt + postAttributive.toString();
    }

    @Override
    public String toString() {
        return text;
    }
}