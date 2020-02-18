package eng.lab.englishgrammer.component.object;

import eng.lab.englishgrammer.clause.objectClause.ObjectClause;
import eng.lab.englishgrammer.partofspeech.other.Infinitive;
import eng.lab.englishgrammer.partofspeech.other.Participial;
import eng.lab.englishgrammer.partofspeech.noun.Noun;
import eng.lab.englishgrammer.partofspeech.determiner.numeral.Numeral;
import eng.lab.englishgrammer.partofspeech.pronoun.Pronoun;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/5/29 22:25
 * @Description: 宾词
 * Object represents the person or the thing that something is done to or the person who is concerned in the result of an action.
 */
public class Object {

    private Noun noun;
    private Pronoun pronoun;
    private Numeral numeral;
    private Participial participial;
    private Infinitive infinitive;

    private ObjectClause objectClause;
}
