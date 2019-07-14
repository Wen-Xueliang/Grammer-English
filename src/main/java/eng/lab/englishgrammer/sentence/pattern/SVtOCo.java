package eng.lab.englishgrammer.sentence.pattern;

import eng.lab.englishgrammer.component.Complement;
import eng.lab.englishgrammer.component.Predicate;
import eng.lab.englishgrammer.component.Subject;
import eng.lab.englishgrammer.utils.ConstantData;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/5/29 22:25
 * @Description: 主语（Subject）+谓语（Predicate）+宾语（Object）+宾语补足语（Complement）
 */
public class SVtOCo {
    private Subject subject;
    private Predicate predicate;
    private Object object;
    private Complement complement;

    @Override
    public String toString() {
        return subject.toString() + ConstantData.spilt + predicate.toString() + ConstantData.spilt + object.toString()
                + ConstantData.spilt + complement.toString();
    }
}
