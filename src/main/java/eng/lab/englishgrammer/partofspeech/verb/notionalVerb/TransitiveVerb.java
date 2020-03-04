package eng.lab.englishgrammer.partofspeech.verb.notionalVerb;

import eng.lab.englishgrammer.partofspeech.verb.notionalVerb.NotionalVerb;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2020/2/18 17:52
 * @Description: 及物动词：后面必须跟宾语，意义才完整的实义动词
 */
public class TransitiveVerb extends NotionalVerb {

    @Override
    public String getAbbreviate() throws Exception {
        return "vt.";
    }
}
