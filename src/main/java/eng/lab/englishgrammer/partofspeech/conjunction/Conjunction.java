package eng.lab.englishgrammer.partofspeech.conjunction;

import eng.lab.englishgrammer.partofspeech.PartOfSpeech;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/5/29 22:25
 * @Description: 连接词:用于连接单词、短语、句子的词类
 */
public class Conjunction extends PartOfSpeech {

    public static String FOR = "for";
    public static String AND = "and";
    public static String NOR = "nor";
    public static String BUT = "but";
    public static String OR = "or";
    public static String YET = "yet";
    public static String SO = "so";

    public String getAbbreviate() throws Exception {
        return "conj.";
    }
}
