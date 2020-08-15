package eng.lab.englishgrammer.component.predicate;

import eng.lab.englishgrammer.partofspeech.verb.*;
import eng.lab.englishgrammer.partofspeech.verb.auxiliaryVerb.AuxiliaryVerb;
import eng.lab.englishgrammer.partofspeech.verb.modalVerb.ModalVerb;
import eng.lab.englishgrammer.phrases.verbPhrase.VerbPhrase;
import eng.lab.englishgrammer.utils.ConstantData;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/5/29 22:25
 * @Description: 谓语:对主语动作状态或特征的陈述或说明
 * Predicate says something about the subject and bears the new information which the speaker or writer wants to transmit to the listener or reader.
 */
public class Predicate {
    Verb verb;
    VerbPhrase verbPhrase;

    private String text;

    public Predicate(Verb verb) {
        this.verb = verb;
        text = verb.toString();
    }

    public Predicate(Verb verb, VerbPhrase verbPhrase) {
        this.verbPhrase = verbPhrase;
        text = verbPhrase.toString();
    }

    @Override
    public String toString() {
        return text;
    }

    /*public String buildPredicate() {
        String verbStr = verb.toString();
        switch (tense) {
            case PRESENT: ;
            case PAST: ;
            case FUTURE: ;
            case PASS_FUTURE: ;
        }

        switch (aspect) {
            case SIMPLE: return ModalVerb.WOULD + ConstantData.spilt + verbStr;
            case CONTINUOUS: return AuxiliaryVerb.BE + verbStr;
            case PERFECT: return AuxiliaryVerb.HAVE + verbStr;
            case PERFECT_CONTINUOUS: return AuxiliaryVerb.HAVE + " been " + verbStr;
        }
        return verbStr;
    }*/


    /*public boolean isModalVerb() {
    }

    public boolean isAuxiliaryVerb() {
    }*/

    /*public Predicate negative() {
    }*/
}
