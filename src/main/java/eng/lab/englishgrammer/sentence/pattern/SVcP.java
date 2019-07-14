package eng.lab.englishgrammer.sentence.pattern;

import eng.lab.englishgrammer.component.Predicate;
import eng.lab.englishgrammer.component.Predicative;
import eng.lab.englishgrammer.component.Subject;
import eng.lab.englishgrammer.utils.ConstantData;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/5/29 22:25
 * @Description: 主语（Subject）+谓语（Predicate）+表语（Predicative）
 */
public class SVcP {
    private Subject subject;
    private Predicate predicate;
    private Predicative predicative;

    @Override
    public String toString() {
        return subject.toString() + ConstantData.spilt + predicate.toString() + ConstantData.spilt + predicative.toString();
    }
}
