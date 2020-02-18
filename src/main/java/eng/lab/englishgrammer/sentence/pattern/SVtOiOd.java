package eng.lab.englishgrammer.sentence.pattern;

import eng.lab.englishgrammer.component.predicate.Predicate;
import eng.lab.englishgrammer.component.subject.Subject;

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

    public Subject getSubject() {
        return subject;
    }

    public Predicate getPredicate() {
        return predicate;
    }

    public Object getObjectIndirect() {
        return objectIndirect;
    }

    public Object getObjectDirect() {
        return objectDirect;
    }
}
