package eng.lab.englishgrammer.sentence.pattern;

import eng.lab.englishgrammer.component.Object;
import eng.lab.englishgrammer.component.Predicate;
import eng.lab.englishgrammer.component.Subject;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/5/29 22:25
 * @Description: 主语（Subject）+谓语（Predicate）+宾语（Object）
 */
public class SVtO {
    private Subject subject;
    private Predicate predicate;
    private Object object;

    public Subject getSubject() {
        return subject;
    }

    public Predicate getPredicate() {
        return predicate;
    }

    public Object getObject() {
        return object;
    }

    public SVtO(Subject subject, Predicate predicate, Object object) {
        this.subject = subject;
        this.predicate = predicate;
        this.object = object;
    }
}
