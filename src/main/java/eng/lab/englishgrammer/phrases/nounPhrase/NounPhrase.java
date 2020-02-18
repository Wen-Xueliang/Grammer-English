package eng.lab.englishgrammer.phrases.nounPhrase;

import eng.lab.englishgrammer.component.attributive.PostAttributive;
import eng.lab.englishgrammer.partofspeech.adjective.Adjective;
import eng.lab.englishgrammer.partofspeech.other.MassNoun;
import eng.lab.englishgrammer.partofspeech.noun.Noun;
import eng.lab.englishgrammer.partofspeech.determiner.Determiner;
import eng.lab.englishgrammer.partofspeech.determiner.numeral.Numeral;
import eng.lab.englishgrammer.utils.ConstantData;

import java.util.List;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/5/29 22:25
 * @Description: 名词短语=（限定词）+（形容词）+名词+（后置定语）
 */
public class NounPhrase {

    private String text;

    public NounPhrase(Noun headword, Determiner determiner, List<Adjective> adjectives,
                      PostAttributive postAttributive) {
        StringBuffer adjectiveStr = new StringBuffer();
        adjectives.forEach(adjective -> adjectiveStr.append(adjective.toString()).append(ConstantData.spilt));
        text = determiner.toString() + ConstantData.spilt + adjectiveStr.toString() + ConstantData.spilt + headword.toString() + ConstantData.spilt + postAttributive.toString();
    }

    public NounPhrase(Numeral numeral, Noun measure, MassNoun massNoun) {
       text = numeral.toString() + ConstantData.spilt + measure.toString() + ConstantData.spilt
               + "of" + ConstantData.spilt + massNoun.toString();
    }

    @Override
    public String toString() {
        return text;
    }
}
