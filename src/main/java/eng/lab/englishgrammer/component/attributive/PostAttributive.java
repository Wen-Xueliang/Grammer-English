package eng.lab.englishgrammer.component.attributive;

import eng.lab.englishgrammer.clause.appositiveClause.AppositiveClause;
import eng.lab.englishgrammer.clause.attributiveClause.AttributiveClause;
import eng.lab.englishgrammer.phrases.adjectivePhrase.AdjectivePhrase;
import eng.lab.englishgrammer.phrases.infinitivePhrase.InfinitivePhrase;
import eng.lab.englishgrammer.phrases.participialPhrase.ParticipialPhrase;
import eng.lab.englishgrammer.phrases.prepositionalPhrase.PrepositionalPhrase;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/5/29 22:25
 * @Description: 后置定语
 */
public class PostAttributive extends Attributive {

    private PrepositionalPhrase prepositionalPhrase;
    private ParticipialPhrase participialPhrase;
    private InfinitivePhrase infinitivePhrase;
    private AdjectivePhrase adjectivePhrase;
    private AttributiveClause attributiveClause;
    private AppositiveClause appositiveClause;

    private String text;

    public PostAttributive(PrepositionalPhrase prepositionalPhrase) {
        this.prepositionalPhrase = prepositionalPhrase;
        text = prepositionalPhrase.toString();
    }

    public PostAttributive(ParticipialPhrase participialPhrase) {
        this.participialPhrase = participialPhrase;
        text = participialPhrase.toString();
    }

    public PostAttributive(InfinitivePhrase infinitivePhrase) {
        this.infinitivePhrase = infinitivePhrase;
        text = infinitivePhrase.toString();
    }

    public PostAttributive(AdjectivePhrase adjectivePhrase) {
        this.adjectivePhrase = adjectivePhrase;
        text = adjectivePhrase.toString();
    }

    public PostAttributive(AttributiveClause attributiveClause) {
        this.attributiveClause = attributiveClause;
        text = attributiveClause.toString();
    }

    public PostAttributive(AppositiveClause appositiveClause) {
        this.appositiveClause = appositiveClause;
        text = appositiveClause.toString();
    }

    @Override
    public String toString() {
        return text;
    }
}
