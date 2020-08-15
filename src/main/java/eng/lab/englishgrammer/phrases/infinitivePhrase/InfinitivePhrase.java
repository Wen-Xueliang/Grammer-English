package eng.lab.englishgrammer.phrases.infinitivePhrase;

import eng.lab.englishgrammer.partofspeech.verb.Verb;
import eng.lab.englishgrammer.partofspeech.verb.notionalVerb.NotionalVerb;
import eng.lab.englishgrammer.utils.ConstantData;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/5/29 22:25
 * @Description: 不定式短语:指动词中的一种不带词形变化从而不指示人称、数量、时态的一种形式。
 */
public class InfinitivePhrase {

    private String text;

    public InfinitivePhrase(NotionalVerb notionalVerb) {
        text = "to" + ConstantData.spilt + notionalVerb.toString();
    }

    @Override
    public String toString() {
        return text;
    }
}
