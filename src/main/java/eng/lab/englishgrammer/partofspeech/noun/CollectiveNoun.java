package eng.lab.englishgrammer.partofspeech.noun;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/6/16 12:11
 * @Description: 集体名词：表示若干人或物的总称
 */
public class CollectiveNoun extends CountableNoun {

    /*
        若视为整体，表示单数意义；若考虑其个体成员，表示复数意义。比较并体会：
        His family is large. 他的家是个大家庭。
        His family are all waiting for him. 他的一家人都在等他。
     */
    boolean isSingleFromCollect;

    public CollectiveNoun() {
    }
}
