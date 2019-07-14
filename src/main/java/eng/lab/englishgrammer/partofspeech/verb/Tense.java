package eng.lab.englishgrammer.partofspeech.verb;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/5/29 22:25
 * @Description: 时
 */
public enum Tense {
    PRESENT("present", "现在时"),
    PAST("past", "过去时"),
    FUTURE("future", "未来时"),
    PASS_FUTURE("pass future", "过去未来时")
    ;

    public String value;
    public String desc;

    Tense(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }
}
