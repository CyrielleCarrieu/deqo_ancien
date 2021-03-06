package deqo;

import java.util.List;

/**
 * Created by franck on 28/11/2016.
 */
public final class ScoreCalculateur {

    /**
     * Calcule le score obtenu par un étudiant en répondant.
     * à une question à choix
     * @param indicesReponseEtudiant utfttyfk1
     * @param question dclk,clke,c
     * @return le score compris entre 0 et 100
     */
    float calculeScore(final List<Integer> indicesReponseEtudiant,
                       final QuestionAChoix question) {
        float score = 0;
        for (int indice:indicesReponseEtudiant) {
            score += question.getScoreForIndice(indice);
        }
        return score;
    }



}
