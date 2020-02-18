package eng.lab.englishgrammer.sentence.pattern;

import eng.lab.englishgrammer.component.predicate.Predicate;
import eng.lab.englishgrammer.component.predicative.Predicative;
import eng.lab.englishgrammer.component.subject.Subject;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/5/29 22:25
 * @Description: 主语（Subject）+谓语（Predicate）+表语（Predicative）
 */
public class SVcP {
    private Subject subject;
    private Predicate predicate;
    private Predicative predicative;

    public Subject getSubject() {
        return subject;
    }

    public Predicate getPredicate() {
        return predicate;
    }

    public Predicative getPredicative() {
        return predicative;
    }
}
