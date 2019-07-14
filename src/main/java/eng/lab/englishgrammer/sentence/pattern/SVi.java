package eng.lab.englishgrammer.sentence.pattern;

import eng.lab.englishgrammer.component.Predicate;
import eng.lab.englishgrammer.component.Subject;
import eng.lab.englishgrammer.utils.ConstantData;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/5/29 22:25
 * @Description: 主语（Subject）+谓语（Predicate）
 */
public class SVi {
    private Subject subject;
    private Predicate predicate;

    public SVi(Subject subject, Predicate predicate) {
        this.subject = subject;
        this.predicate = predicate;
    }

    @Override
    public String toString() {
        return subject.toString() + ConstantData.spilt + predicate.toString();
    }
}
