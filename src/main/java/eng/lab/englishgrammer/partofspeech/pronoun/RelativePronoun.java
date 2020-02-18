package eng.lab.englishgrammer.partofspeech.pronoun;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/7/14 14:22
 * @Description: 关系代词:用于引导定语从句的先行词，用于替代定语从句的某个成分。
 */
public class RelativePronoun {

    //限定性 指人
    public static String WHO = "who";//主格
    public static String THAT_Nc_Lp = "that";//主格
    public static String WHOM = "whom";//宾格
    public static String WHOSE_Pc_Lp = "whose";//属格

    //非限定性 指物
    public static String WHICH = "which";//主格
    public static String WHICH_Oc = "which";//宾格
    public static String OF_WHICH_Lo = "of which";//属格
    public static String WHOSE_Pc_Lo = "whose";//属格

    //限定性 指人或指物
    public static String THAT_Nc_Nl = "that";//主格
    public static String THAT_Oc_Nl = "that";//宾格
    public static String OF_WHICH_Nl = "of which";//属格
    public static String WHOSE_Pc_Nl = "whose";//属格

    //特殊代词
    public static String AS = "as";
    public static String BUT = "but";
    public static String THAN = "than";
}
