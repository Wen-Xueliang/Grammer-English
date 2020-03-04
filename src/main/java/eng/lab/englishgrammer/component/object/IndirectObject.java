package eng.lab.englishgrammer.component.object;

import eng.lab.englishgrammer.component.Component;
import eng.lab.englishgrammer.partofspeech.noun.Noun;
import eng.lab.englishgrammer.partofspeech.pronoun.PersonalPronoun;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/8/18 23:27
 * @Description: 间接宾语:动作的非直接，但受动作影响的对象，用于主+谓+间接宾语+直接宾语结构
 */
public class IndirectObject extends Component {

    private Noun noun;
    private PersonalPronoun personalPronoun;

    public IndirectObject(Noun noun) {
        this.noun = noun;
        text = noun.toString();
    }

    public IndirectObject(PersonalPronoun personalPronoun) {
        this.personalPronoun = personalPronoun;
        text = personalPronoun.toString();
    }
}
