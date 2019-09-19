package eng.lab.englishgrammer.clause;

import eng.lab.englishgrammer.sentence.declarative.DeclarativeSentence;
import eng.lab.englishgrammer.utils.ConstantData;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/5/29 22:25
 * @Description: 状语从句
 */
public class ObjectClause extends NounClause {

    @Override
    public void generalQuestionAsComponent(DeclarativeSentence declarativeSentence) {
        text = "if" + ConstantData.spilt + declarativeSentence;
    }
}
