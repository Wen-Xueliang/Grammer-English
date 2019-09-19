package eng.lab.englishgrammer.partofspeech.noun;

import eng.lab.englishgrammer.partofspeech.PartOfSpeech;

import java.util.List;
import java.util.Map;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/5/29 22:25
 * @Description: 名词：表示人，事物，地点以及抽象事物的名称
 */
public abstract class Noun extends PartOfSpeech {

    protected String text;
    protected boolean isPlural = false;

    public abstract boolean isCountable();

    @Override
    public String getAbbreviate() throws Exception {
        return "n.";
    }

    @Override
    public String toString() {
        return text;
    }

    /*
    共同所有格 Harry and Bill's father is a scientist 共同的父亲
    个别所有格 Harry's and Bill's fathers are scientists 各自的父亲
    生物所有格 B of A 非生命的要用of
     */
    public String toGenitive() {
        if(isPlural) {
            if("s".equals(text.substring(text.length() - 1))) {
                return text + "'";
            } else {
                return text + "'s";
            }
        } else {
            return text + "'s";
        }
    }

    public boolean isNounsFromVerb() {
        return this.text.endsWith("ation") ||
                this.text.endsWith("ment") ||
                this.text.endsWith("al") ||
                this.text.endsWith("ee") ||
                this.text.endsWith("er") ||
                this.text.endsWith("age");
    }

    public boolean isNounFromAdj() {
        return this.text.endsWith("cy") ||
                this.text.endsWith("hood") ||
                this.text.endsWith("ness") ||
                this.text.endsWith("ity") ||
                this.text.endsWith("ism") ||
                this.text.endsWith("ist") ||
                this.text.endsWith("th");
    }

}
