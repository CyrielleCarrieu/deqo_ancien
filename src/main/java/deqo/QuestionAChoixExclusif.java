package deqo;

/**
 * Classe représentant une question à choix exclusive.
 */
public class QuestionAChoixExclusif implements QuestionAChoix {

    /**
     * sdfghj.
     */
    private String enonce;
    /**
     * javadoc.
     */
    private int indiceBonneReponse;

    /**
     * Une question à choix excusive est complètement caractérisé par son.
     * énoncé.
     * et l'indice de sa bonne réponse.
     * @param enonce1 l'énoncé de la question
     * @param indiceBonneReponse2 l'indice de la bonne réponse
     */
    public QuestionAChoixExclusif(final String enonce1,
                                  final int indiceBonneReponse2) {
        this.enonce = enonce1;
        this.indiceBonneReponse = indiceBonneReponse2;
    }

    /**
     * Récupère l'énoncé de la question.
     * @return l'énoncé de la question
     */
    public final String getEnonce() {
        return enonce;
    }

    /**
     * Opération permettant de récupérer le score donné par un choix.
     * @param indiceChoix l'indice du choix
     * @return 100 si l'indice du choix fourni est l'indice de la bonne réponse,
     * 0 autrement
     */
    public final float getScoreForIndice(final int indiceChoix) {
        final int cent = 100;
        if (indiceChoix == indiceBonneReponse) {
            return cent;
        }
        return 0;
    }
}
