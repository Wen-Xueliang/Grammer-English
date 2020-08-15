package eng.lab.englishgrammer.phrases.verbPhrase;

import eng.lab.englishgrammer.component.attributive.PostAttributive;
import eng.lab.englishgrammer.component.attributive.PreAttributive;
import eng.lab.englishgrammer.partofspeech.noun.Noun;
import eng.lab.englishgrammer.partofspeech.pronoun.Pronoun;
import eng.lab.englishgrammer.utils.ConstantData;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/5/29 22:25
 * @Description: 名词性短语:中心语与它的修饰语一起构成名词性短语,中心语为名词或代词
 * 前置定语+中心语+后置定语，其中定语可选填，中心语必填
 */
public class VerbPhrase {

    private String text;

    public VerbPhrase(PreAttributive preAttributive, Noun headword,
                      PostAttributive postAttributive) {
        text = preAttributive.toString() + ConstantData.spilt + headword.toString() + ConstantData.spilt + postAttributive.toString();
    }

    public VerbPhrase(PreAttributive preAttributive, Pronoun headword,
                      PostAttributive postAttributive) {
        text = preAttributive.toString() + ConstantData.spilt + headword.toString() + ConstantData.spilt + postAttributive.toString();
    }

    @Override
    public String toString() {
        return text;
    }
}