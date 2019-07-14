package eng.lab.englishgrammer.component;

import eng.lab.englishgrammer.clause.SubjectClause;
import eng.lab.englishgrammer.partofspeech.noun.Noun;
import eng.lab.englishgrammer.partofspeech.Numeral;
import eng.lab.englishgrammer.partofspeech.pronoun.Pronoun;
import eng.lab.englishgrammer.phrases.GerundPhrase;
import eng.lab.englishgrammer.phrases.InfinitivePhrase;
import eng.lab.englishgrammer.phrases.NounPhrase;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/5/29 22:25
 * @Description: 主语
 * Subject is the topic or theme of the sentence, which tells of what the sentence about.
 */
public class Subject {
    private Noun noun;
    private Pronoun pronoun;
    private Numeral numeral;

    private InfinitivePhrase infinitivePhrase;
    private GerundPhrase gerundPhrase;
    private NounPhrase nounPhrase;

    private SubjectClause subjectClause;

    private String text;

    public Subject(Noun noun) {
        this.noun = noun;
        text = noun.toString();
    }

    public Subject(Pronoun pronoun) {
        this.pronoun = pronoun;
        text = pronoun.toString();
    }

    public Subject(Numeral numeral) {
        this.numeral = numeral;
        text = numeral.toString();
    }

    public Subject(InfinitivePhrase infinitivePhrase) {
        this.infinitivePhrase = infinitivePhrase;
        text = infinitivePhrase.toString();
    }

    public Subject(GerundPhrase gerundPhrase) {
        this.gerundPhrase = gerundPhrase;
        text = gerundPhrase.toString();
    }

    public Subject(NounPhrase nounPhrase) {
        this.nounPhrase = nounPhrase;
        text = nounPhrase.toString();
    }

    public Subject(SubjectClause subjectClause) {
        this.subjectClause = subjectClause;
        text = subjectClause.toString();
    }

    @Override
    public String toString() {
        return text;
    }
}
