package eng.lab.englishgrammer.partofspeech.noun;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/5/29 22:25
 * @Description: 专有名词：表示特定的人，物，机构或场所等的名词
 */
public class ProperNoun extends Noun {

    private String type;
    private String text;

    /**
     * 人名及头衔
     * @param text
     */
    public void setNameAndTitle(String text) {
        this.text = text;
        this.type = "nameAndTitle";
    }

    /**
     * 著作名称
     * @param text
     */
    public void setTitleOfWork(String text) {
        this.text = text;
        this.type = "titleOfWork";
    }

    /**
     * 月份
     * @param text
     */
    public void setMonth(String text) {
        this.text = text;
        this.type = "titleOfWork";
    }

    /**
     * 星期
     * @param text
     */
    public void setWeek(String text) {
        this.text = text;
        this.type = "titleOfWork";
    }

    /**
     * 四季
     * @param text
     */
    public void setSeason(String text) {
        this.text = text;
        this.type = "titleOfWork";
    }

    /**
     * 节日
     * @param text
     */
    public void setFestival(String text) {
        this.text = text;
        this.type = "titleOfWork";
    }

    /**
     * 地理名称
     * @param text
     */
    public void setGeographical(String text) {
        this.text = text;
        this.type = "titleOfWork";
    }
}
