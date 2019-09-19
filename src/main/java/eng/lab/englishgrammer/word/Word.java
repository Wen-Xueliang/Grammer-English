package eng.lab.englishgrammer.word;

import eng.lab.englishgrammer.partofspeech.PartOfSpeech;
import eng.lab.englishgrammer.utils.ConstantData;
import eng.lab.englishgrammer.utils.PhoneticSymbol;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/5/29 22:25
 * @Description: 单词
 */
public class Word {
    String text;
    PhoneticSymbol phoneticSymbol;
    PartOfSpeech partOfSpeech;
    Description description;

    @Override
    public String toString() {
        String lowerTest = text.toLowerCase();
        try {
            return lowerTest + ConstantData.spilt + phoneticSymbol.toString() + ConstantData.spilt + partOfSpeech.getAbbreviate() + ConstantData.spilt + description.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

}
