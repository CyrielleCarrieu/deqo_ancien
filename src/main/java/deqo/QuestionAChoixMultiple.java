package deqo;

import java.util.List;

/**
 * Classe répresentant une question à choix multiple.
 */
public final class QuestionAChoixMultiple implements QuestionAChoix {

    /**
     * gzegeg.
     */
    private String enonce;
    /**
     * fezg.
     */
    private List<Integer> indicesBonnesReponses;

    /**
     * Une question à choix multiple est complètement caractérisé par son.
     * énoncé et la liste des indices qui forment
     * la bonne réponse
     * @param enonce1 l'énoncé de la question
     * @param indicesBonnesReponses1 la liste des indices formant la bonne
     *                             réponse.
     */
    public QuestionAChoixMultiple(final String enonce1,
                                  final List<Integer> indicesBonnesReponses1) {
        this.enonce = enonce1;
        this.indicesBonnesReponses = indicesBonnesReponses1;
    }

    /**
     * Récupère l'énoncé de la question.
     * @return l'énoncé de la question
     */
    public String getEnonce() {
        return enonce;
    }

    /**
     * Opération permettant de récupérer le score donné par un choix.
     * @param indiceChoix l'indice du choix
     * @return 100/n si indiceChoix appartient à la liste des indices
     * formant la bonne réponse, 0 sinon
     */
    public float getScoreForIndice(final int indiceChoix) {
        final float cent = 100f;
        if (indicesBonnesReponses.contains(indiceChoix)) {
            return cent / ((float) (indicesBonnesReponses.size()));
        }
        return 0;
    }
}
