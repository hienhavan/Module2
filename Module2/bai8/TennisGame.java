package bai8;

public class TennisGame implements TennisGameConstants {
    public static String getScore(String player1Name, String player2Name, int score1, int score2) {
        if (score1 == score2) {
            return getEqualScore(score1);
        } else if (score1 >= SCORE_THRESHOLD || score2 >= SCORE_THRESHOLD) {
            return getAdvantageOrWin(score1, score2);
        } else {
            return getScoreString(score1, score2);
        }
    }

    private static String getEqualScore(int score) {
        switch (score) {
            case LOVE:
                return SCORE_LOVE + SCORE_EQUAL_ALL;
            case FIFTEEN:
                return SCORE_FIFTEEN + SCORE_EQUAL_ALL;
            case THIRTY:
                return SCORE_THIRTY + SCORE_EQUAL_ALL;
            case FORTY:
                return SCORE_FORTY + SCORE_EQUAL_ALL;
            default:
                return SCORE_DEUCE;
        }
    }

    private static String getAdvantageOrWin(int score1, int score2) {
        int minusResult = score1 - score2;
        int number1 = 1;
        if (minusResult == number1) {
            return SCORE_ADVANTAGE_PLAYER1;
        } else if (minusResult == -1) {
            return SCORE_ADVANTAGE_PLAYER2;
        } else if (minusResult >= 2) {
            return SCORE_WIN_PLAYER1;
        } else {
            return SCORE_WIN_PLAYER2;
        }
    }

    private static String getScoreString(int score1, int score2) {
        StringBuilder score = new StringBuilder();
        for (int i = 1; i < 3; i++) {
            int tempScore = (i == 1) ? score1 : score2;
            switch (tempScore) {
                case LOVE:
                    score.append(SCORE_LOVE);
                    break;
                case FIFTEEN:
                    score.append(SCORE_FIFTEEN);
                    break;
                case THIRTY:
                    score.append(SCORE_THIRTY);
                    break;
                case FORTY:
                    score.append(SCORE_FORTY);
                    break;
            }
            if (i == 1) {
                score.append("-");
            }
        }
        return score.toString();
    }
}
