public class ForthClass {
    public static void main(String[] args){
        System.out.println("Hello, Tim");
        
        boolean isAlien = false;
        
        if (isAlien == false) {
            System.out.println("It isnot an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100){
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;

        if (topScore > secondTopScore && topScore < 100){
            System.out.println("Greather than second top score and less than 100!");
        }
    }
}
