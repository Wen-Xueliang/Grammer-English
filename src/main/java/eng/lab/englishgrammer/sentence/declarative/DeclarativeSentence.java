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
        text = sVi.getSubject().toString() + ConstantData.spilt + sVi.getPredicate().toString();
    }

    public DeclarativeSentence(SVcP sVcP) {
        text = sVcP.getSubject().toString() + ConstantData.spilt + sVcP.getPredicate().toString() + ConstantData.spilt + sVcP.getPredicative().toString();
    }

    public DeclarativeSentence(SVtO sVtO) {
        text =  sVtO.getSubject().toString() + ConstantData.spilt + sVtO.getPredicate().toString() + ConstantData.spilt + sVtO.getObject().toString();
    }

    public DeclarativeSentence(SVtOCo sVtOCo) {
        text = sVtOCo.getSubject().toString() + ConstantData.spilt + sVtOCo.getPredicate().toString() + ConstantData.spilt + sVtOCo.getObject().toString()
                + ConstantData.spilt + sVtOCo.getComplement().toString();
    }

    public DeclarativeSentence(SVtOiOd sVtOiOd) {
        text = sVtOiOd.getSubject().toString() + ConstantData.spilt + sVtOiOd.getPredicate().toString() + ConstantData.spilt + sVtOiOd.getObjectIndirect().toString()
                + ConstantData.spilt + sVtOiOd.getObjectDirect().toString();
    }
}
