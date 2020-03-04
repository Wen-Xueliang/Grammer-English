package eng.lab.englishgrammer.partofspeech.adjective;

import eng.lab.englishgrammer.partofspeech.PartOfSpeech;
import eng.lab.englishgrammer.utils.ConstantData;
import eng.lab.englishgrammer.utils.PhoneticSymbol;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/5/29 22:25
 * @Description: 形容词:描写或修饰名词或代词，表示人或事物的性质、状态、特征或属性，常用作定语，也可作表语或补语。
 */
public class Adjective extends PartOfSpeech {

    List<String> nolevelAdjectives = new ArrayList<String>();

    public String getAbbreviate() throws Exception {
        return "adj.";
    }

    public void init() {
        nolevelAdjectives.add("absolute");
        nolevelAdjectives.add("alone");
        nolevelAdjectives.add("dead");
        nolevelAdjectives.add("empty");
        nolevelAdjectives.add("equal");
        nolevelAdjectives.add("eternal");
        nolevelAdjectives.add("final");
        nolevelAdjectives.add("horizontal");
        nolevelAdjectives.add("perfect");
        nolevelAdjectives.add("primary");
        nolevelAdjectives.add("pregnant");
        nolevelAdjectives.add("round");
        nolevelAdjectives.add("single");
        nolevelAdjectives.add("square");
        nolevelAdjectives.add("straight");
        nolevelAdjectives.add("supreme");
        nolevelAdjectives.add("unique");
        nolevelAdjectives.add("unanimous");
    }

    // 比较级
    public String comparative(PhoneticSymbol phoneticSymbol) {
        String lowerTest = text.toLowerCase();
        if(nolevelAdjectives.contains(lowerTest)) {
            return lowerTest;
        }
        if("good".equals(lowerTest)) {
            return "better";
        } else if("well".equals(lowerTest)) {
            return "better";
        } else if("bad".equals(lowerTest)) {
            return "worse";
        } else if("ill".equals(lowerTest)) {
            return "worse";
        } else if("far".equals(lowerTest)) {
            //都可指实际距离，further可用于抽象意义，表示进一步，更多的，更深入的
            return "farther/further";
        } else if("old".equals(lowerTest)) {
            //elder主要表示家庭成员之间的长幼关系，而非年龄大小
            return "older/elder";
        } else if("little".equals(lowerTest)) {
            return "less";
        } else if("many".equals(lowerTest)) {
            return "more";
        } else if("much".equals(lowerTest)) {
            return "more";
        } else if("late".equals(lowerTest)) {
            //later表示时间上较迟 latter表示顺序上的“后者”，与former（前者）相对应
            return "later/latter";
        } else if("up".equals(lowerTest)) {
            return "upper";
        }
        if(phoneticSymbol.getSyllableNum() == 1) {
            if(lowerTest.endsWith("e")) {
                lowerTest = new StringBuffer(lowerTest).append("r").toString();
            } else if(lowerTest.endsWith("y")) {
                lowerTest = new StringBuffer(lowerTest.substring(0, lowerTest.length() - 1)).append("ier").toString();
            } else if(phoneticSymbol.isVowelAndConsonantEnd()) {
                lowerTest = new StringBuffer(lowerTest).append(lowerTest.substring(lowerTest.length() - 1)).append("er").toString();
            } else {
                lowerTest = new StringBuffer(lowerTest).append("er").toString();
            }
        } else if(phoneticSymbol.getSyllableNum() == 2) {
            if(lowerTest.endsWith("y")) {
                lowerTest = new StringBuffer(lowerTest.substring(0, lowerTest.length() - 1)).append("ier").toString();
            } else {
                lowerTest = new StringBuffer("more").append(ConstantData.spilt).append(lowerTest).toString();
            }
        } else if(phoneticSymbol.getSyllableNum() > 2){
            lowerTest = new StringBuffer("more").append(ConstantData.spilt).append(lowerTest).toString();
        }
        return lowerTest;
    }

    //最高级
    public String superlative(PhoneticSymbol phoneticSymbol) {
        String lowerTest = text.toLowerCase();
        if(nolevelAdjectives.contains(lowerTest)) {
            return lowerTest;
        }
        if("good".equals(lowerTest)) {
            return "best";
        } else if("well".equals(lowerTest)) {
            return "best";
        } else if("bad".equals(lowerTest)) {
            return "worst";
        } else if("ill".equals(lowerTest)) {
            return "worst";
        } else if("far".equals(lowerTest)) {
            //都可指实际距离，furthest可用于抽象意义，表示进一步，更多的，更深入的
            return "farthest/furthest";
        } else if("old".equals(lowerTest)) {
            //eldest主要表示家庭成员之间的长幼关系，而非年龄大小
            return "oldest/eldest";
        } else if("little".equals(lowerTest)) {
            return "least";
        } else if("many".equals(lowerTest)) {
            return "most";
        } else if("much".equals(lowerTest)) {
            return "most";
        } else if("late".equals(lowerTest)) {
            //latest表示最近的，最新的 last表示顺序上的“后者”，与former（前者）相对应
            return "latest/last";
        } else if("up".equals(lowerTest)) {
            return "uppermost/upmost";
        }
        if(phoneticSymbol.getSyllableNum() == 1) {
            if(lowerTest.endsWith("e")) {
                lowerTest = new StringBuffer(lowerTest).append("st").toString();
            } else if(lowerTest.endsWith("y")) {
                lowerTest = new StringBuffer(lowerTest.substring(0, lowerTest.length() - 1)).append("iest").toString();
            } else if(phoneticSymbol.isVowelAndConsonantEnd()) {
                lowerTest = new StringBuffer(lowerTest).append(lowerTest.substring(lowerTest.length() - 1)).append("est").toString();
            }
        } else if(phoneticSymbol.getSyllableNum() == 2) {
            if(lowerTest.endsWith("y")) {
                lowerTest = new StringBuffer(lowerTest.substring(0, lowerTest.length() - 1)).append("iest").toString();
            } else {
                lowerTest = new StringBuffer("most").append(ConstantData.spilt).append(lowerTest).toString();
            }
        } else if(phoneticSymbol.getSyllableNum() > 2){
            lowerTest = new StringBuffer("most").append(ConstantData.spilt).append(lowerTest).toString();
        }
        return lowerTest;
    }
}
