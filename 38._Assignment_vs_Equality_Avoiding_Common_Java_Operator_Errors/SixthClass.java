public class SixthClass {
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

        int secondTopScore = 95;

        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greather than second top score and less than 100!");
        }

        if ((topScore > 90) || (secondTopScore <= 90)){
           System.out.println("Either or both of the condition are ture"); 
        }

        int newVlaue = 50;

        if (newVlaue == 50){
            System.out.println("This is an error");
        }

        boolean isCar = true;
        if (isCar = false){
            System.out.println("This is no supposed to happen");
        }
    }
}
