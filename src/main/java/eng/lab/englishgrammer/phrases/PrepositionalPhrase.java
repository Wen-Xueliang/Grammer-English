package eng.lab.englishgrammer.phrases;

import eng.lab.englishgrammer.partofspeech.preposition.Preposition;
import eng.lab.englishgrammer.utils.ConstantData;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/5/29 22:25
 * @Description: 介词短语
 */
public class PrepositionalPhrase {
    private String text;

    Preposition preposition;
    Object object;

    public PrepositionalPhrase(Preposition preposition, Object object) {
        text = preposition + ConstantData.spilt + object;
    }
}
