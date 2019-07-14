package eng.lab.englishgrammer.sentence.pattern;

import eng.lab.englishgrammer.component.Predicate;
import eng.lab.englishgrammer.component.Subject;
import eng.lab.englishgrammer.utils.ConstantData;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/5/29 22:25
 * @Description: 主语（Subject）+谓语（Predicate）+间接宾语（Object）+直接宾语（Object）
 */
public class SVtOiOd {
    private Subject subject;
    private Predicate predicate;
    private Object objectIndirect;
    private Object objectDirect;

    @Override
    public String toString() {
        return subject.toString() + ConstantData.spilt + predicate.toString() + ConstantData.spilt + objectIndirect.toString()
                + ConstantData.spilt + objectDirect.toString();
    }
}
