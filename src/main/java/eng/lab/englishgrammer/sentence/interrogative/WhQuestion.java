package eng.lab.englishgrammer.sentence.interrogative;

import eng.lab.englishgrammer.sentence.pattern.SVcP;
import eng.lab.englishgrammer.sentence.pattern.SVtO;
import eng.lab.englishgrammer.sentence.pattern.SVtOCo;
import eng.lab.englishgrammer.sentence.pattern.SVtOiOd;
import eng.lab.englishgrammer.utils.ConstantData;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/7/14 22:59
 * @Description: 特殊疑问句
 */
public class WhQuestion extends InterrogativeSentence {
    private WhWords whWords;

    public WhQuestion(SVcP sVcP, WhWords whWords, boolean isSubjectOrAttributiveOfSubject) {
        if(isSubjectOrAttributiveOfSubject) {
            text = whWords + ConstantData.spilt + sVcP.getPredicate() + ConstantData.spilt + sVcP.getPredicative();
        } else {
            GeneralQuestion generalQuestion = new GeneralQuestion(sVcP);
            text = whWords + ConstantData.spilt + generalQuestion;
        }
    }

    public WhQuestion(SVtO sVtO, WhWords whWords, boolean isSubjectOrAttributiveOfSubject) {
        if(isSubjectOrAttributiveOfSubject) {
            text =  whWords + ConstantData.spilt + sVtO.getPredicate() + ConstantData.spilt + sVtO.getObject();
        } else {
            GeneralQuestion generalQuestion = new GeneralQuestion(sVtO);
            text = whWords + ConstantData.spilt + generalQuestion;
        }
    }

    public WhQuestion(SVtOCo sVtOCo, WhWords whWords, boolean isSubjectOrAttributiveOfSubject) {
        if(isSubjectOrAttributiveOfSubject) {
            text = whWords + ConstantData.spilt + sVtOCo.getPredicate() + ConstantData.spilt + sVtOCo.getObject()
                    + ConstantData.spilt + sVtOCo.getComplement();        } else {
            GeneralQuestion generalQuestion = new GeneralQuestion(sVtOCo);
            text = whWords + ConstantData.spilt + generalQuestion;
        }
    }

    public WhQuestion(SVtOiOd sVtOiOd, WhWords whWords, boolean isSubjectOrAttributiveOfSubject) {
        if(isSubjectOrAttributiveOfSubject) {
            text = whWords + ConstantData.spilt + sVtOiOd.getPredicate() + ConstantData.spilt + sVtOiOd.getObjectIndirect()
                    + ConstantData.spilt + sVtOiOd.getObjectDirect();
        } else {
            GeneralQuestion generalQuestion = new GeneralQuestion(sVtOiOd);
            text = whWords + ConstantData.spilt + generalQuestion;
        }
    }
}
