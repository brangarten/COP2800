public class System_Time {
    public static void main(String[] args) {
        
        long totalMilliSeconds = System.currentTimeMillis();

        long totalSeconds = totalMilliSeconds / 1000;

        long currentSeconds = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinutes = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long currentHours = totalHours % 60;

        System.out.println(totalMilliSeconds);
        System.out.println(totalSeconds);
        System.out.println(currentSeconds);
        System.out.println(totalMinutes);
        System.out.println(currentMinutes);
        System.out.println(totalHours);
        System.out.println(currentHours);
    }
}
