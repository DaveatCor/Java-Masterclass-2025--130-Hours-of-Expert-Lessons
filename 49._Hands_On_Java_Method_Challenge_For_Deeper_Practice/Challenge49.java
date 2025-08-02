public class Challenge49 {
    public static void main(String[] args){
        String name = "Daveat";
        int score = 1000;
        
        int position = calculateScorePosition(score);

        displayHighScore(name, position);
    }

    // First
    public static void displayHighScore(String name, int position){
        System.out.println(name + " managed to get into position " + position + " on the high score list");
    }

    // Second
    public static int calculateScorePosition(int score){
        if (score >= 1000){
            return 1;
        } else if (score >= 500 && score < 1000){
            return 2;
        } else if (score >= 100 && score < 500){
            return 3;
        } else {
            return 4;
        }
    }
}
