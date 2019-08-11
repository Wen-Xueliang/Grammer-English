package eng.lab.englishgrammer.sentence.declarative;

import eng.lab.englishgrammer.sentence.pattern.*;
import eng.lab.englishgrammer.utils.ConstantData;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/7/14 15:56
 * @Description: 陈述句
 */
public class DeclarativeSentence {
    private String text;

    public DeclarativeSentence(SVi sVi) {
        text = sVi.getSubject() + ConstantData.spilt + sVi.getPredicate();
    }

    public DeclarativeSentence(SVcP sVcP) {
        text = sVcP.getSubject() + ConstantData.spilt + sVcP.getPredicate() + ConstantData.spilt + sVcP.getPredicative();
    }

    public DeclarativeSentence(SVtO sVtO) {
        text =  sVtO.getSubject() + ConstantData.spilt + sVtO.getPredicate() + ConstantData.spilt + sVtO.getObject();
    }

    public DeclarativeSentence(SVtOCo sVtOCo) {
        text = sVtOCo.getSubject() + ConstantData.spilt + sVtOCo.getPredicate() + ConstantData.spilt + sVtOCo.getObject()
                + ConstantData.spilt + sVtOCo.getComplement();
    }

    public DeclarativeSentence(SVtOiOd sVtOiOd) {
        text = sVtOiOd.getSubject() + ConstantData.spilt + sVtOiOd.getPredicate() + ConstantData.spilt + sVtOiOd.getObjectIndirect()
                + ConstantData.spilt + sVtOiOd.getObjectDirect();
    }
}
