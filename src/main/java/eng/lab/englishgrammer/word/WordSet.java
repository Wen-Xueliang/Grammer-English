package eng.lab.englishgrammer.word;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/6/16 12:36
 * @Description: 单词集合
 */
public enum WordSet {

    AIR("air", null, null, null);

    private String noun;
    private String verb;
    private String adjective;
    private String adverb;

    WordSet(String noun, String verb, String adjective, String adverb) {
        this.noun = noun;
        this.verb = verb;
        this.adjective = adjective;
        this.adverb = adverb;
    }}
