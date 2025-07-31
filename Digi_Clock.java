
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Digi_Clock {
    
    public static void main(String[] args) {
        while (true) { 
            LocalTime now = LocalTime.now();
            String time=now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

            int hour=now.getHour();
            String Greeting;

            if(hour >= 5 && hour < 12) {
                Greeting = "Good Morning";

            }
            else if(hour >= 12 && hour < 17) {
                Greeting = "Good Afternoon";
    
            }
            else if(hour >= 17 && hour < 21) {
                Greeting = "Good Evening";

            }
            else {
                Greeting = "Good Night";

            }
            System.out.println("\rTime: "+time + "|" + Greeting);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Clock interrupted");
                break;
            }
        
        
        }
    }
}
