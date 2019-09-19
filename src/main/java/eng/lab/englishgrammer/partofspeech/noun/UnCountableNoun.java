package eng.lab.englishgrammer.partofspeech.noun;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/5/29 23:19
 * @Description: 不可数名词
 */
public class UnCountableNoun extends Noun {

    /**
     * 不可数名词可以用some、any、little\a little或者much连接,不可以用数词连接,如果连接要在数词后加量词再加of;
     */

    @Override
    public boolean isCountable() {
        return false;
    }
}
