package eng.lab.englishgrammer.sentence.pattern;

import eng.lab.englishgrammer.component.predicate.Predicate;
import eng.lab.englishgrammer.component.subject.Subject;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/5/29 22:25
 * @Description: 主语（Subject）+谓语（Predicate）
 */
public class SVi {
    private Subject subject;
    private Predicate predicate;

    public Subject getSubject() {
        return subject;
    }

    public Predicate getPredicate() {
        return predicate;
    }

    public SVi(Subject subject, Predicate predicate) {
        this.subject = subject;
        this.predicate = predicate;
    }
}
