package eng.lab.englishgrammer.phrases;

import eng.lab.englishgrammer.partofspeech.adjective.Adjective;
import eng.lab.englishgrammer.utils.ConstantData;

import java.util.List;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/5/29 22:25
 * @Description: 形容词短语
 */
public class AdjectivePhrase {
    private String text;

    public AdjectivePhrase(Adjective adjective, PrepositionalPhrase prepositionalPhrase) {
        text = adjective + ConstantData.spilt + prepositionalPhrase;
    }

    public AdjectivePhrase(Adjective adjective, InfinitivePhrase infinitivePhrase) {
        text = adjective + ConstantData.spilt + infinitivePhrase;
    }

    public AdjectivePhrase(Adjective adjective, GerundPhrase gerundPhrase) {
        text = adjective + ConstantData.spilt + gerundPhrase;
    }

    public AdjectivePhrase(List<Adjective> adjectiveList) {
        for(int i = 0; i < adjectiveList.size() - 1; i ++) {
            text += adjectiveList.get(i) + ",";
        }

        text = text.substring(0 , text.length() - 1) + " and " + adjectiveList.get(adjectiveList.size());
    }
}
