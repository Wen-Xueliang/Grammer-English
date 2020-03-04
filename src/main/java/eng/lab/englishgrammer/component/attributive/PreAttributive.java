package eng.lab.englishgrammer.component.attributive;

import eng.lab.englishgrammer.clause.appositiveClause.AppositiveClause;
import eng.lab.englishgrammer.clause.attributiveClause.AttributiveClause;
import eng.lab.englishgrammer.partofspeech.adjective.Adjective;
import eng.lab.englishgrammer.partofspeech.determiner.Determiner;
import eng.lab.englishgrammer.phrases.adjectivePhrase.AdjectivePhrase;
import eng.lab.englishgrammer.phrases.infinitivePhrase.InfinitivePhrase;
import eng.lab.englishgrammer.phrases.participialPhrase.ParticipialPhrase;
import eng.lab.englishgrammer.phrases.prepositionalPhrase.PrepositionalPhrase;

import java.util.List;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/5/29 22:25
 * @Description: 前置定语
 */
public class PreAttributive extends Attributive {

    private Determiner determiner;
    private List<Adjective> adjectiveList;

    private String text;

    public PreAttributive(Determiner determiner) {
        this.determiner = determiner;
        text = determiner.toString();
    }

    public PreAttributive(List<Adjective> adjectiveList) {
        this.adjectiveList = adjectiveList;
        text = adjectiveList.toString();
    }

    public PreAttributive(Determiner determiner, List<Adjective> adjectiveList) {
        this.determiner = determiner;
        this.adjectiveList = adjectiveList;
        text = determiner.toString();
    }

    @Override
    public String toString() {
        return text;
    }
}
