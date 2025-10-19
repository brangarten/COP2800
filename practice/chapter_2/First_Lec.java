public class First_Lec {
    public static void main(String[] args) {
        long currentTime = System.currentTimeMillis();
        
        long totalSeconds = currentTime / 1000;
        long currentSeconds = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;

        long totalHours = totalMinutes / 60;
        long currentHours = totalHours % 24;

        System.out.println("Current Second: " + currentSeconds 
                    + "\nCurrent Minutes: " + currentMinutes
                    + "\nCurrent Hour: " + currentHours);

        System.out.println("Current Time: " + currentTime);
    }
}
