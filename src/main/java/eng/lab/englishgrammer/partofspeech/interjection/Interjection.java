package eng.lab.englishgrammer.partofspeech.interjection;

import eng.lab.englishgrammer.partofspeech.PartOfSpeech;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/5/29 22:25
 * @Description: 感叹词:用于表示感叹的词类
 */
public class Interjection extends PartOfSpeech {

    public static String OH = "oh";
    public static String AH = "ah";
    public static String COME = "come";
    public static String DEAR = "dear";
    public static String WELL = "well";
    public static String NOW = "now";
    public static String THERE = "there";
    public static String MAN = "man";
    public static String BOY = "boy";
    public static String HA = "ha";
    public static String AHA = "aha";
    public static String HEY = "hey";
    public static String WHY = "why";
    public static String NONSENSE = "nonsense";

    public String getAbbreviate() throws Exception {
        return "int.";
    }
}
