public class SecondsAndMinutesChallenge55 {
    public static void main(String[] args) {
    
        System.out.println(getDurationString(-3945)); // This is the first test case
        System.out.println(getDurationString(-65, 45)); // This is the second test case
        System.out.println(getDurationString(65, 145));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int seconds){

        if (seconds <= 0){
            return "Invalid data for seconds(" + seconds + "), must be a positive integer value";
        }

        return getDurationString(seconds / 60, seconds % 60);
    }

    public static String getDurationString(int mintues, int seconds){
        if (mintues < 0){
            return "Invalid data for minutes(" + mintues + "), must be a positive integer value";
        }

        if (seconds < 0 || seconds > 59) {
            return "Invalid data for seconds(" + mintues + "), must between 0 to 59";
        }
        int hours = mintues / 60;

        int remainingMinutes = mintues % 3600;
        return hours + "h" + remainingMinutes + "m " + seconds + "s";
    }
}
