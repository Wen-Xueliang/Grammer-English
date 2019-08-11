package eng.lab.englishgrammer.sentence.interrogative;

import eng.lab.englishgrammer.component.Predicate;
import eng.lab.englishgrammer.component.Subject;
import eng.lab.englishgrammer.partofspeech.verb.AuxiliaryVerb;
import eng.lab.englishgrammer.sentence.pattern.SVtO;
import eng.lab.englishgrammer.sentence.pattern.SVtOCo;
import eng.lab.englishgrammer.sentence.pattern.SVtOiOd;
import eng.lab.englishgrammer.utils.ConstantData;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/7/14 23:00
 * @Description: 选择疑问句
 */
public class AlternativeQuestion extends InterrogativeSentence {
    public AlternativeQuestion(SVtO sVtO, Subject subject) {
        GeneralQuestion generalQuestion = new GeneralQuestion(sVtO);
        text = generalQuestion + ConstantData.spilt + "or" + ConstantData.spilt + subject;
    }

    public AlternativeQuestion(SVtOCo sVtOCo, Subject subject) {
        GeneralQuestion generalQuestion = new GeneralQuestion(sVtOCo);
        text = generalQuestion + ConstantData.spilt + "or" + ConstantData.spilt + subject;
    }

    public AlternativeQuestion(SVtOiOd sVtOiOd, Subject subject) {
        GeneralQuestion generalQuestion = new GeneralQuestion(sVtOiOd);
        text = generalQuestion + ConstantData.spilt + "or" + ConstantData.spilt + subject;
    }

}
