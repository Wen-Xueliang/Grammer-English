package eng.lab.englishgrammer.partofspeech.noun;

import java.util.List;
import java.util.Map;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/5/29 23:19
 * @Description: 可数名词
 */
public class CountableNoun extends Noun {


    private Map<String, String> irregularNoun;
    private List<String> peersNoun;
    protected boolean isPlural = false;//是否为复数

    /**
     * 在后面加s，比如book-》books
     * 以s、x、o、sh、ch结尾的则在后面加es，比如bus-》buses
     * 以y结尾的在后面将y改为ies，比如story-》stories
     * 以f、fe结尾的在后面将f改为ves，比如wolf-》wolves
     * 单复数同行的名词不需要修改，比如fish-》fish
     * 不规则名词，比如man-》men
     * TODO：以O结尾的无生命单词和以元音字母+Y结尾的单词可以直接后面加s，比如piano-》pianos，boy-》boys
     */
    private String toPlural(String text) {
        isPlural = true;
        if("s".equals(text.substring(text.length() - 1))
                || "x".equals(text.substring(text.length() - 1))
                || "o".equals(text.substring(text.length() - 1))
                || "sh".equals(text.substring(text.length() - 2))
                || "ch".equals(text.substring(text.length() - 2))
        ) {
            return text + "es";
        } else if("y".equals(text.substring(text.length() - 1))) {
            return text.substring(0, text.length() - 1) + "ies";
        } else if("f".equals(text.substring(text.length() - 1))) {
            return text.substring(0, text.length() - 1) + "ves";
        } else if("fe".equals(text.substring(text.length() - 2))) {
            return text.substring(0, text.length() - 2) + "ves";
        } else if(irregularNoun.keySet().contains(text)) {
            return irregularNoun.get(text);
        } else if(peersNoun.contains(text)) {
            //数量才是单复数同行，种类还是要变形
            //one fish/two fish    a kind of fish/two kinds of fishes
            return text;
        } else {
            return text + "s";
        }
    }
}
