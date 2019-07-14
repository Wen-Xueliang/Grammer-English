package eng.lab.englishgrammer.partofspeech.noun;

import eng.lab.englishgrammer.partofspeech.PartOfSpeech;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/5/29 22:25
 * @Description: 名词：表示人，事物，地点以及抽象事物的名称
 */
public abstract class Noun extends PartOfSpeech {

    @Override
    public String getAbbreviate() throws Exception {
        return "n.";
    }

}
