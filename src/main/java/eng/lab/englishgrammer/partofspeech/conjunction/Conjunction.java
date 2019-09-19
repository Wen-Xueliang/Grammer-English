package eng.lab.englishgrammer.partofspeech.conjunction;

import eng.lab.englishgrammer.partofspeech.PartOfSpeech;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/5/29 22:25
 * @Description: 连接词
 */
public class Conjunction extends PartOfSpeech {

    public static String BECAUSE = "because";
    public static String SINCE = "since";
    public static String UNTIL = "until";
    public static String WHEN = "when";
    public static String WHILE = "while";
    public static String AS = "as";
    public static String IF = "if";
    public static String AS_IF = "as if";
    public static String AS_SOON_AS = "as soon as";

    public String getAbbreviate() throws Exception {
        return "conj.";
    }
}
