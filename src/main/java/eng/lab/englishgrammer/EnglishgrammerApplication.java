package eng.lab.englishgrammer;

import eng.lab.englishgrammer.component.predicate.Predicate;
import eng.lab.englishgrammer.component.subject.Subject;
import eng.lab.englishgrammer.partofspeech.noun.Noun;
import eng.lab.englishgrammer.partofspeech.verb.Verb;
import eng.lab.englishgrammer.sentence.declarative.DeclarativeSentence;
import eng.lab.englishgrammer.sentence.pattern.SVi;

public class EnglishgrammerApplication {

    public static void main(String[] args) {
        Noun noun = new Noun("I");
        Verb verb = new Verb("know");

        Subject subject = new Subject(noun);
        Predicate predicate = new Predicate(verb);

        SVi sVi = new SVi(subject, predicate);

        DeclarativeSentence declarativeSentence = new DeclarativeSentence(sVi);


        System.out.println(declarativeSentence.toString());

    }

}
