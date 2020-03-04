package eng.lab.englishgrammer.partofspeech.adverb;

import eng.lab.englishgrammer.partofspeech.PartOfSpeech;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/5/29 22:25
 * @Description: 副词：指在句子中表示行为或状态特征的词。用以修饰动词、形容词、其他副词或全句，表示时间、地点、程度、方式等概念
 */
public class Adverb extends PartOfSpeech {
    public Adverb() {
        super();
    }
    public Adverb(String text) {
        super();
        this.text = text;
    }

    @Override
    public String getAbbreviate() throws Exception {
        return "adv.";
    }
}
