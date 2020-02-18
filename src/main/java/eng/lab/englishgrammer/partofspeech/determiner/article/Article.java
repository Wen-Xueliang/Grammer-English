package eng.lab.englishgrammer.partofspeech.determiner.article;

import eng.lab.englishgrammer.partofspeech.determiner.Determiner;
import eng.lab.englishgrammer.utils.PhoneticSymbol;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/5/29 22:25
 * @Description: 冠词
 */
public class Article extends Determiner {
    public static String A = "a";

    public static String VOWEL_A = "an";

    /*the+adj  = 什么的人 复数*/
    public static String THE = "the";

    public static String VOWEL_THE = "the";

    public String getAbbreviate() throws Exception {
        return "art.";
    }

    /*根据单词获取他的定冠词*/
    public String getBySymbol(PhoneticSymbol symbol, boolean isDefinite) {
        boolean isVowelStart = symbol.isVowelStart();
        if(isDefinite) {
            if(isVowelStart) {
                return VOWEL_THE;
            } else {
                return THE;
            }
        } else {
            if(isVowelStart) {
                return VOWEL_A;
            } else {
                return A;
            }
        }
    }
}
