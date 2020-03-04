package eng.lab.englishgrammer.component.object;

import eng.lab.englishgrammer.clause.objectClause.ObjectClause;
import eng.lab.englishgrammer.component.Component;
import eng.lab.englishgrammer.partofspeech.noun.Noun;
import eng.lab.englishgrammer.phrases.nounPhrase.NounPhrase;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/8/18 23:26
 * @Description: 直接宾语:动作的直接对象，用于主+谓+间接宾语+直接宾语结构
 */
public class DirectObject extends Component {

    private Noun noun;

    private NounPhrase nounPhrase;

    private ObjectClause objectClause;

    public DirectObject(Noun noun) {
        this.noun = noun;
        text = noun.toString();
    }

    public DirectObject(NounPhrase nounPhrase) {
        this.nounPhrase = nounPhrase;
        text = nounPhrase.toString();
    }

    public DirectObject(ObjectClause objectClause) {
        this.objectClause = objectClause;
        text = objectClause.toString();
    }
}
