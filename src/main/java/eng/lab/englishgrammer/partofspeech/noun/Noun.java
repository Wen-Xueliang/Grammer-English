package eng.lab.englishgrammer.partofspeech.noun;

import eng.lab.englishgrammer.partofspeech.PartOfSpeech;

import java.util.List;
import java.util.Map;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/5/29 22:25
 * @Description: 名词：表示人、事、物、地点或抽象概念的名称
 */
public abstract class Noun extends PartOfSpeech {

    /**
     * 名词分专有，可数和不可数，顾名思义，可数与不可数之间的区别为是否可被计数。
     *
     * 比如水杯，可以是一个水杯，两个水杯，就是可数的。
     *
     * 比如水，就无法被计数，只能用量词来计数，比如一杯水，一桶水，所以属于不可数。
     */


    @Override
    public String getAbbreviate() throws Exception {
        return "n.";
    }

    /*
        单数名词：直接在词尾加上's。The boy’s bag（男孩的书包）
        复数名词：
            以s结尾，则在词尾加上'。The two boys' monther（两个男孩的妈妈）
            非s结尾，则在词尾加上‘s。Children's day（儿童的节日）
        共同所有：指多个属主。Harry and Bill's father is a scientist（哈利和比尔的父亲是一名科学家）
        个别所有：指单个属猪。Harry's and Bill's fathers are scientists（哈利的父亲和比尔的父亲都是科学家）
     */
    /*public String toGenitive() {
        if(isPlural) {
            if("s".equals(text.substring(text.length() - 1))) {
                return text + "'";
            } else {
                return text + "'s";
            }
        } else {
            return text + "'s";
        }
    }*/

    /*public boolean isNounsFromVerb() {
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
    }*/

}
