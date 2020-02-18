package eng.lab.englishgrammer.partofspeech;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/5/29 22:25
 * @Description: 词性
 */
public abstract class PartOfSpeech {

    protected String text;

    @Override
    public String toString() {
        return text;
    }

    public String getAbbreviate() throws Exception {
        throw new Exception("not a legal part of speech!");
    }
}
