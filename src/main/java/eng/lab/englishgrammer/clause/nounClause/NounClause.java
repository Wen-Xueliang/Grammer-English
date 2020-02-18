package eng.lab.englishgrammer.clause.nounClause;

import eng.lab.englishgrammer.sentence.declarative.DeclarativeSentence;
import eng.lab.englishgrammer.sentence.interrogative.GeneralQuestion;
import eng.lab.englishgrammer.sentence.interrogative.WhQuestion;
import eng.lab.englishgrammer.sentence.interrogative.WhWords;
import eng.lab.englishgrammer.utils.ConstantData;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/8/20 22:01
 * @Description: 名词性从句
 */
public class NounClause {

    private DeclarativeSentence declarativeSentence;

    protected String text;

    public void declarativeSentenceAsComponent(DeclarativeSentence declarativeSentence) {
        text = "that" + ConstantData.spilt + declarativeSentence;
    }

    public void generalQuestionAsComponent(DeclarativeSentence declarativeSentence) {
        text = "whether" + ConstantData.spilt + declarativeSentence;
    }

    public void whQuestionAsComponent(DeclarativeSentence declarativeSentence, WhWords whWordsh) {
        text = whWordsh + ConstantData.spilt + declarativeSentence;
    }
}
