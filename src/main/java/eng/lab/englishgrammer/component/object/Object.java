package eng.lab.englishgrammer.component.object;

import eng.lab.englishgrammer.clause.objectClause.ObjectClause;
import eng.lab.englishgrammer.component.Component;
import eng.lab.englishgrammer.partofspeech.other.Infinitive;
import eng.lab.englishgrammer.partofspeech.other.Participial;
import eng.lab.englishgrammer.partofspeech.noun.Noun;
import eng.lab.englishgrammer.partofspeech.determiner.numeral.Numeral;
import eng.lab.englishgrammer.partofspeech.pronoun.Pronoun;
import eng.lab.englishgrammer.phrases.nounPhrase.NounPhrase;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/5/29 22:25
 * @Description: 宾语：指一个动作的接受者
 * Object represents the person or the thing that something is done to or the person who is concerned in the result of an action.
 */
public class Object extends Component {

    private Noun noun;
    private Pronoun pronoun;
    private Numeral numeral;

    private NounPhrase nounPhrase;

    private ObjectClause objectClause;

    public Object(Noun noun) {
        this.noun = noun;
        text = noun.toString();
    }

    public Object(Pronoun pronoun) {
        this.pronoun = pronoun;
        text = pronoun.toString();
    }

    public Object(Numeral numeral) {
        this.numeral = numeral;
        text = numeral.toString();
    }

    public Object(NounPhrase nounPhrase) {
        this.nounPhrase = nounPhrase;
        text = nounPhrase.toString();
    }

    public Object(ObjectClause objectClause) {
        this.objectClause = objectClause;
        text = objectClause.toString();
    }
}
