package eng.lab.englishgrammer.sentence.pattern;

import eng.lab.englishgrammer.component.Complement;
import eng.lab.englishgrammer.component.Predicate;
import eng.lab.englishgrammer.component.Subject;

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

    public Subject getSubject() {
        return subject;
    }

    public Predicate getPredicate() {
        return predicate;
    }

    public Object getObject() {
        return object;
    }

    public Complement getComplement() {
        return complement;
    }
}
