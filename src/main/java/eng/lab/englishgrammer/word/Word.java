package eng.lab.englishgrammer.word;

import eng.lab.englishgrammer.partofspeech.PartOfSpeech;
import eng.lab.englishgrammer.utils.ConstantData;
import eng.lab.englishgrammer.utils.PhoneticSymbol;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/5/29 22:25
 * @Description: 单词
 */
public class Word {
    String text;
    PhoneticSymbol phoneticSymbol;
    PartOfSpeech partOfSpeech;
    Description description;

    @Override
    public String toString() {
        String lowerTest = text.toLowerCase();
        try {
            return lowerTest + ConstantData.spilt + phoneticSymbol.toString() + ConstantData.spilt + partOfSpeech.getAbbreviate() + ConstantData.spilt + description.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    public String comparative() {
        String lowerTest = text.toLowerCase();
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

    public String superlative() {
        String lowerTest = text.toLowerCase();
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
