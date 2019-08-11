package eng.lab.englishgrammer.sentence.interrogative;

import eng.lab.englishgrammer.component.Predicate;
import eng.lab.englishgrammer.partofspeech.verb.AuxiliaryVerb;
import eng.lab.englishgrammer.sentence.declarative.DeclarativeSentence;
import eng.lab.englishgrammer.sentence.pattern.SVcP;
import eng.lab.englishgrammer.sentence.pattern.SVtO;
import eng.lab.englishgrammer.sentence.pattern.SVtOCo;
import eng.lab.englishgrammer.sentence.pattern.SVtOiOd;
import eng.lab.englishgrammer.utils.ConstantData;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/7/14 22:58
 * @Description: 一般疑问句
 */
public class GeneralQuestion extends InterrogativeSentence {

    /**
     * 1. 如果谓语中有情态动词、助动词或be，将这些词移到主语之前。如：
     * Can you dance? 你会跳舞吗？
     * Will he go there tomorrow? 他明天去那里？
     * Are you a student? 你是学生吗？
     */
    /**
     * 2. 如果谓语中没有情态动词、助动词或be，就在主语前加助动词do(does、did) ，原来的动词都用原形。如：
     * Do you like English? 你喜欢英语吗？
     * Does your brother like English? 你的兄弟喜欢英语吗？
     * Did you sleep well last night? 你昨晚睡得好吗？
     */

    public GeneralQuestion(SVcP sVcP) {
        text = sVcP.getPredicate() + ConstantData.spilt + sVcP.getSubject() + ConstantData.spilt + sVcP.getPredicative();
    }

    public GeneralQuestion(SVtO sVtO) {
        Predicate predicate = sVtO.getPredicate();
        if(predicate.isModalVerb() || predicate.isAuxiliaryVerb()) {
            text = predicate + ConstantData.spilt + sVtO.getSubject() + ConstantData.spilt + sVtO.getObject();
        } else {
            text = AuxiliaryVerb.DO + sVtO.getSubject() + ConstantData.spilt + sVtO.getObject();
        }
    }

    public GeneralQuestion(SVtOCo sVtOCo) {
        Predicate predicate = sVtOCo.getPredicate();
        if(predicate.isModalVerb() || predicate.isAuxiliaryVerb()) {
            text = predicate + ConstantData.spilt + sVtOCo.getSubject() + ConstantData.spilt + sVtOCo.getObject()
                    + ConstantData.spilt + sVtOCo.getComplement();
        } else {
            text = AuxiliaryVerb.DO + sVtOCo.getSubject() + ConstantData.spilt + sVtOCo.getObject()
                    + ConstantData.spilt + sVtOCo.getComplement();
        }
    }

    public GeneralQuestion(SVtOiOd sVtOiOd) {
        Predicate predicate = sVtOiOd.getPredicate();
        if(predicate.isModalVerb() || predicate.isAuxiliaryVerb()) {
            text = predicate + ConstantData.spilt + sVtOiOd.getSubject() + ConstantData.spilt + sVtOiOd.getObjectIndirect()
                    + ConstantData.spilt + sVtOiOd.getObjectDirect();
        } else {
            text = AuxiliaryVerb.DO + sVtOiOd.getSubject() + ConstantData.spilt + sVtOiOd.getObjectIndirect()
                    + ConstantData.spilt + sVtOiOd.getObjectDirect();
        }
    }
}
