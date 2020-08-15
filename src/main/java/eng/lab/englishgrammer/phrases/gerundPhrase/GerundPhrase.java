package eng.lab.englishgrammer.phrases.gerundPhrase;

import eng.lab.englishgrammer.partofspeech.verb.Verb;
import eng.lab.englishgrammer.partofspeech.verb.notionalVerb.NotionalVerb;
import eng.lab.englishgrammer.utils.ConstantData;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/5/29 22:25
 * @Description: 动名词短语:指的是动词ing形式的一种，兼有动词和名词特征的非限定动词。
 */
public class GerundPhrase {


    private String text;

    public GerundPhrase(NotionalVerb notionalVerb) {
        text = "to" + ConstantData.spilt + notionalVerb.toString();
    }

    @Override
    public String toString() {
        return text;
    }
}
