package eng.lab.englishgrammer.utils;

import java.util.List;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/5/29 22:25
 * @Description: 音标
 */
public class PhoneticSymbol {
    List<Symbol> symbols;
    int syllableNum;

    public boolean isVowelStart() {
        return symbols.get(0).isVowel();
    }

    public boolean isVowelAndConsonantEnd() {
        return symbols.get(symbols.size() - 1).isVowel() && !symbols.get(symbols.size()).isVowel();
    }

    public PhoneticSymbol(List<Symbol> symbols) {
        this.symbols = symbols;
        syllableNum = 0;
        symbols.forEach(symbol -> {
            if(symbol.isVowel()) syllableNum++;
        });
    }

    public int getSyllableNum() {
        return syllableNum;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("/");
        symbols.forEach(symbol -> stringBuffer.append(symbol.value));
        return stringBuffer.append("/").toString();
    }
}
