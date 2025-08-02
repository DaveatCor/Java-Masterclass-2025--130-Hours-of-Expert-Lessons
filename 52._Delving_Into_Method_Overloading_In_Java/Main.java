public class Main {
    public static void main(String[] arg){
        System.out.println("New score is " + calculateScores("Tim", 500));
        System.out.println("New score is " + calculateScores(10));
    }

    public static int calculateScores(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScores(int score){
        return calculateScores("Anonymous", score);
    }

    public static int calculateScores(){
        System.out.println("No player name, no player score.");
        return 0;
    }
}
