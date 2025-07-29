public class MainChallenge {
    public static void main(String[] arges){

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        if (gameOver){
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }

        // boolean newGameOver = true;
        // int newScore = 1000;
        // int newLevelCompleted = 8;
        // int newBonus = 200;

        // int newFinalScore = newScore;

        // if (gameOver){
        //     finalScore += (levelCompleted * bonus);
        //     System.out.println("Your final score was " + finalScore);
        // }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        finalScore = score;

        if (gameOver){
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}