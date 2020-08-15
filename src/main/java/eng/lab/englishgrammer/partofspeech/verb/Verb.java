package eng.lab.englishgrammer.partofspeech.verb;

import eng.lab.englishgrammer.partofspeech.PartOfSpeech;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/5/29 22:25
 * @Description: 动词:表示动作或状态的词汇。动词一般在句子中做谓语成分。
 */
public class Verb extends PartOfSpeech {

    Aspect aspect;
    Tense tense;

    @Override
    public String getAbbreviate() throws Exception {
        return "v.";
    }

    public void setAspect(Aspect aspect) {
        if(Aspect.CONTINUOUS.equals(aspect)) {
            text += "ing";
        } else if(Aspect.PERFECT.equals(aspect)) {
            text += "ing";
        } else if(Aspect.PERFECT_CONTINUOUS.equals(aspect)) {
            text += "ing";
        }
    }

    public void setTense(Tense tense) {

    }
}
