package eng.lab.englishgrammer.component;

import eng.lab.englishgrammer.partofspeech.verb.*;
import eng.lab.englishgrammer.utils.ConstantData;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/5/29 22:25
 * @Description: 谓语
 * Predicate says something about the subject and bears the new information which the speaker or writer wants to transmit to the listener or reader.
 */
public class Predicate {
    Verb verb;
    Tense tense;
    Aspect aspect;

    private String text;

    public Predicate(Verb verb, Tense tense, Aspect aspect) {
        this.verb = verb;
        this.tense = tense;
        this.aspect = aspect;
        text = buildPredicate();
    }

    public String buildPredicate() {
        String verbStr = verb.toString();
        switch (tense) {
            case PRESENT: switch (aspect) {
                case SIMPLE: return verbStr;
                case CONTINUOUS: return AuxiliaryVerb.BE + verbStr;
                case PERFECT: return AuxiliaryVerb.HAVE + verbStr;
                case PERFECT_CONTINUOUS: return AuxiliaryVerb.HAVE + " been " + verbStr;
            }break;
            case PAST: switch (aspect) {
                case SIMPLE: return verbStr + "ed";
                case CONTINUOUS: return AuxiliaryVerb.BE + verbStr;
                case PERFECT: return AuxiliaryVerb.HAVE + verbStr;
                case PERFECT_CONTINUOUS: return AuxiliaryVerb.HAVE + " been " + verbStr;
            }break;
            case FUTURE: switch (aspect) {
                case SIMPLE: return ModalVerb.WILL + ConstantData.spilt + verbStr;
                case CONTINUOUS: return AuxiliaryVerb.BE + verbStr;
                case PERFECT: return AuxiliaryVerb.HAVE + verbStr;
                case PERFECT_CONTINUOUS: return AuxiliaryVerb.HAVE + " been " + verbStr;
            }break;
            case PASS_FUTURE: switch (aspect) {
                case SIMPLE: return ModalVerb.WOULD + ConstantData.spilt + verbStr;
                case CONTINUOUS: return AuxiliaryVerb.BE + verbStr;
                case PERFECT: return AuxiliaryVerb.HAVE + verbStr;
                case PERFECT_CONTINUOUS: return AuxiliaryVerb.HAVE + " been " + verbStr;
            }break;
        }
        return verbStr;
    }

    @Override
    public String toString() {
        return text;
    }

    public boolean isModalVerb() {
    }

    public boolean isAuxiliaryVerb() {
    }

    public Predicate negative() {
    }
}
