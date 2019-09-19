package eng.lab.englishgrammer.partofspeech.verb;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/5/29 22:25
 * @Description: 基本助动词
 */
public class AuxiliaryVerb extends Verb {
    public static String DO = "do";
    public static String DOES = "does";

    public static String BE = "be";
    public static String AM = "am";
    public static String IS = "is";
    public static String ARE = "are";

    public static String HAVE = "have";
    public static String HAS = "has";

    public String setIifSubjectIsFirstPerson() {
        if(this.equals(BE)) {
            return AM;
        }
        return this.toString();
    }

    public String setIifSubjectIsSecondPerson() {
        if(this.equals(BE)) {
            return ARE;
        }
        return this.toString();
    }

    public String setIifSubjectIsThirdPerson() {
        if(this.equals(BE)) {
            return IS;
        }
        return this.toString();
    }
}
