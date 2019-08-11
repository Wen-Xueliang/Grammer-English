package eng.lab.englishgrammer.sentence.interrogative;

import eng.lab.englishgrammer.partofspeech.pronoun.PersonalPronoun;
import eng.lab.englishgrammer.sentence.pattern.SVcP;
import eng.lab.englishgrammer.sentence.pattern.SVtO;
import eng.lab.englishgrammer.sentence.pattern.SVtOCo;
import eng.lab.englishgrammer.sentence.pattern.SVtOiOd;
import eng.lab.englishgrammer.utils.ConstantData;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/7/14 23:01
 * @Description: 反义疑问句
 */
public class DisjunctiveQuestion extends InterrogativeSentence {
    public DisjunctiveQuestion(SVcP sVcP, PersonalPronoun personalPronoun) {
        text = sVcP.getSubject() + ConstantData.spilt + sVcP.getPredicate() + ConstantData.spilt + sVcP.getPredicative()
            + ConstantData.comma + sVcP.getPredicate().negative() + ConstantData.spilt + personalPronoun;
    }

    public DisjunctiveQuestion(SVtO sVtO, PersonalPronoun personalPronoun) {
        text =  sVtO.getSubject() + ConstantData.spilt + sVtO.getPredicate() + ConstantData.spilt + sVtO.getObject()
                + ConstantData.comma + sVtO.getPredicate().negative() + ConstantData.spilt + personalPronoun;
    }

    public DisjunctiveQuestion(SVtOCo sVtOCo, PersonalPronoun personalPronoun) {
        text = sVtOCo.getSubject() + ConstantData.spilt + sVtOCo.getPredicate() + ConstantData.spilt + sVtOCo.getObject()
                + ConstantData.spilt + sVtOCo.getComplement()
                + ConstantData.comma + sVtOCo.getPredicate().negative() + ConstantData.spilt + personalPronoun;
    }

    public DisjunctiveQuestion(SVtOiOd sVtOiOd, PersonalPronoun personalPronoun) {
        text = sVtOiOd.getSubject() + ConstantData.spilt + sVtOiOd.getPredicate() + ConstantData.spilt + sVtOiOd.getObjectIndirect()
                + ConstantData.spilt + sVtOiOd.getObjectDirect()
                + ConstantData.comma + sVtOiOd.getPredicate().negative() + ConstantData.spilt + personalPronoun;
    }
}
