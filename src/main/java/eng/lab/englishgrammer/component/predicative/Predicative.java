package eng.lab.englishgrammer.component.predicative;

import eng.lab.englishgrammer.clause.predicativeClause.PredicativeClause;
import eng.lab.englishgrammer.partofspeech.other.Participial;
import eng.lab.englishgrammer.partofspeech.adjective.Adjective;
import eng.lab.englishgrammer.partofspeech.adverb.Adverb;
import eng.lab.englishgrammer.partofspeech.noun.Noun;
import eng.lab.englishgrammer.partofspeech.determiner.numeral.Numeral;
import eng.lab.englishgrammer.partofspeech.pronoun.Pronoun;
import eng.lab.englishgrammer.phrases.gerundPhrase.GerundPhrase;
import eng.lab.englishgrammer.phrases.infinitivePhrase.InfinitivePhrase;
import eng.lab.englishgrammer.phrases.prepositionalPhrase.PrepositionalPhrase;

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
