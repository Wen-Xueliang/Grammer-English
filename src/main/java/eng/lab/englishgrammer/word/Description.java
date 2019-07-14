package eng.lab.englishgrammer.word;

import eng.lab.englishgrammer.utils.ConstantData;

import java.util.List;

public class Description {
    List<Word> words;

    @Override
    public String toString() {
        StringBuffer description = new StringBuffer();
        words.forEach(word -> description.append(word.text + ConstantData.spilt));
        return description.toString();
    }
}
