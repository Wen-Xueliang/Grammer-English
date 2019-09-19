package eng.lab.englishgrammer.component;

import eng.lab.englishgrammer.clause.PredicativeClause;
import eng.lab.englishgrammer.partofspeech.Participial;
import eng.lab.englishgrammer.partofspeech.adjective.Adjective;
import eng.lab.englishgrammer.partofspeech.adverb.Adverb;
import eng.lab.englishgrammer.partofspeech.noun.Noun;
import eng.lab.englishgrammer.partofspeech.numeral.Numeral;
import eng.lab.englishgrammer.partofspeech.pronoun.Pronoun;
import eng.lab.englishgrammer.phrases.GerundPhrase;
import eng.lab.englishgrammer.phrases.InfinitivePhrase;
import eng.lab.englishgrammer.phrases.PrepositionalPhrase;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/5/29 22:25
 * @Description: 表语
 * Predicative expresses the status, characteristics or the quality of the subject.
 */
public class Predicative {
    private Noun noun;
    private Pronoun pronoun;
    private Adjective adjective;
    private Participial participial;
    private Numeral numeral;
    private Adverb adverb;

    private InfinitivePhrase infinitivePhrase;
    private GerundPhrase gerundPhrase;
    private PrepositionalPhrase prepositionalPhrase;

    private PredicativeClause predicativeClause;

}
