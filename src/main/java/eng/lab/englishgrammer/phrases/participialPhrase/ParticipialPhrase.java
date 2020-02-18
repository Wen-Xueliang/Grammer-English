package eng.lab.englishgrammer.phrases.participialPhrase;

import eng.lab.englishgrammer.partofspeech.preposition.Preposition;
import eng.lab.englishgrammer.utils.ConstantData;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/5/29 22:25
 * @Description: 分词短语
 */
public class ParticipialPhrase {
    private String text;

    Preposition preposition;
    Object object;

    public ParticipialPhrase(Preposition preposition, Object object) {
        text = preposition + ConstantData.spilt + object;
    }
}
