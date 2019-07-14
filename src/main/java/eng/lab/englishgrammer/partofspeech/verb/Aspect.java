package eng.lab.englishgrammer.partofspeech.verb;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/5/29 22:25
 * @Description: 体
 */
public enum Aspect {
    SIMPLE("simple", "简单体"),
    CONTINUOUS("continuous", "进行体"),
    PERFECT("perfect", "完成体"),
    PERFECT_CONTINUOUS("perfect continuous", "完成进行体")
    ;

    public String value;
    public String desc;

    Aspect(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }

}
