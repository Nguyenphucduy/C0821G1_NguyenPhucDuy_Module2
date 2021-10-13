package l8_clean_code.exercise.refactoring.model;

public class TennisGame {

    public static final int SCOREZERO = 0;
    public static final int SCOREONE = 1;
    public static final int SCORETWO = 2;
    public static final int SCORETHREE = 3;

    public static String getResultGame(String player1Name, String player2Name, int player1Score, int player2Score) {
        boolean isDeuce = player1Score == player2Score;
        boolean isOver = player1Score >= 4 || player2Score >= 4;
        if (isDeuce) {
            return getScore(player1Score);
        } else if (isOver) {
            return getResultScore(player1Score, player2Score);
        } else {
            return getTempScore(player1Score, player2Score);
        }
    }

    public static String getScore(int score) {
        switch (score) {
            case SCOREZERO:
                return "Love-All";
            case SCOREONE:
                return "Fifteen-All";
            case SCORETWO:
                return "Thirty-All";
            case SCORETHREE:
                return "Forty-All";
            default:
                return "Deuce";
        }
    }

    public static String getResultScore(int player1Score, int player2Score) {
        int resultScore = player1Score - player2Score;
        if (resultScore == 1) {
            return "Advantage player1";

        } else if (resultScore == -1) {
            return "Advantage player2";

        } else if (resultScore >= 2) {
            return "Win for player1";
        } else {
            return "Win for player2";
        }
    }

    public static Integer changeTempScore(int player1Score, int player2Score) {
        int tempScore = 0;
        for (int i = 1; i < 3; i++) {
            if (i == 1) {
                tempScore = player1Score;
            } else {
                tempScore = player2Score;
            }
        }
        return tempScore;
    }
    public static String getTempScore(int player1Score,int player2Score){
        int tempScore = changeTempScore(player1Score,player2Score);
        String score = "";
        switch (tempScore) {
            case SCOREZERO:
                score += "Love";
            case SCOREONE:
                score += "Fifteen";
            case SCORETWO:
                score += "Thirty";
            case SCORETHREE:
                score += "Forty";
        }
        return score;
    }
}
