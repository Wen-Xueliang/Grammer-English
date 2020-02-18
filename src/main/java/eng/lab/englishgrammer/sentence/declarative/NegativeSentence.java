package eng.lab.englishgrammer.sentence.declarative;

import eng.lab.englishgrammer.sentence.pattern.*;
import eng.lab.englishgrammer.utils.ConstantData;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2020/2/5 20:10
 * @Description: 否定句
 */
public class NegativeSentence extends DeclarativeSentence{
    public NegativeSentence(SVi sVi) {
        text = sVi.getSubject() + ConstantData.spilt + sVi.getPredicate().negative();
    }

    public NegativeSentence(SVcP sVcP) {
        text = sVcP.getSubject() + ConstantData.spilt + sVcP.getPredicate().negative() + ConstantData.spilt + sVcP.getPredicative();
    }

    public NegativeSentence(SVtO sVtO) {
        text =  sVtO.getSubject() + ConstantData.spilt + sVtO.getPredicate().negative() + ConstantData.spilt + sVtO.getObject();
    }

    public NegativeSentence(SVtOCo sVtOCo) {
        text = sVtOCo.getSubject() + ConstantData.spilt + sVtOCo.getPredicate().negative() + ConstantData.spilt + sVtOCo.getObject()
                + ConstantData.spilt + sVtOCo.getComplement();
    }

    public NegativeSentence(SVtOiOd sVtOiOd) {
        text = sVtOiOd.getSubject() + ConstantData.spilt + sVtOiOd.getPredicate().negative() + ConstantData.spilt + sVtOiOd.getObjectIndirect()
                + ConstantData.spilt + sVtOiOd.getObjectDirect();
    }
}
