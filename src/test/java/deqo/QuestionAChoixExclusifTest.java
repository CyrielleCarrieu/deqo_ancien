package deqo;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuestionAChoixExclusifTest {
    private static final String ENONCE = "enonce";
    private static final int REPONSE = 3;
    private static final int REPONSEF = 9;
    private static final float SCOREB = 100f;
    @Test
    public void getEnonce() {
        QuestionAChoixExclusif question =
                new QuestionAChoixExclusif(ENONCE, REPONSE);
        assertEquals(ENONCE, question.getEnonce());
    }

    @Test
    public void getScoreForIndice() {

        final float SCOREC = 0f;
        QuestionAChoixExclusif question =
                new QuestionAChoixExclusif(ENONCE, REPONSE);
        assertEquals(SCOREB, question.getScoreForIndice(REPONSE),SCOREB);
        assertEquals(SCOREC, question.getScoreForIndice(REPONSEF),SCOREB);
    }
}
