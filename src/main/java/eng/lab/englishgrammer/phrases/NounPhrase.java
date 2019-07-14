package eng.lab.englishgrammer.phrases;

import eng.lab.englishgrammer.component.PostAttributive;
import eng.lab.englishgrammer.partofspeech.Adjective;
import eng.lab.englishgrammer.partofspeech.noun.Noun;
import eng.lab.englishgrammer.partofspeech.determiner.Determiner;
import eng.lab.englishgrammer.utils.ConstantData;

import java.util.List;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/5/29 22:25
 * @Description: 名词短语=（限定词）+（形容词）+名词+（后置定语）
 */
public class NounPhrase {

    private Determiner determiner;
    private List<Adjective> adjectives;
    private Noun headword;
    private PostAttributive postAttributive;

    public NounPhrase(Noun headword) {
        this.headword = headword;
    }

    public void setDeterminer(Determiner determiner) {
        this.determiner = determiner;
    }

    public void setAdjective(List<Adjective> adjectives) {
        this.adjectives = adjectives;
    }

    public void setPostAttributive(PostAttributive postAttributive) {
        this.postAttributive = postAttributive;
    }

    @Override
    public String toString() {
        StringBuffer adjectiveStr = new StringBuffer();
        adjectives.forEach(adjective -> adjectiveStr.append(adjective.toString()).append(ConstantData.spilt));
        return determiner.toString() + ConstantData.spilt + adjectiveStr.toString() + ConstantData.spilt + headword.toString() + ConstantData.spilt + postAttributive.toString();
    }
}
