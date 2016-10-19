/**
 * Created by opilane on 19.10.2016.
 */
public class Time {
    public static void main(String[]args){
        String firstLine="Hello, again!";
        System.out.println(firstLine);
        int hour = 24;
        int minute = 60;
        int second = 60;
        System.out.print("The current time is ");
        System.out.print(hour - 8);
        System.out.print(":");
        System.out.print(minute - 42);
        System.out.print(":");
        System.out.print(second -5);
        System.out.println(".");
        System.out.print("Number of seconds since midnight: ");
        System.out.println((hour - 8) * 60 * 60 + (minute - 42) * 60 + (second - 5));
        System.out.print("Number of seconds remaining in the day: ");
        System.out.println(((hour-(hour-8))* 60 * 60) + ((minute - (minute - 42)) * 60) + (second - (second - 5)));
        System.out.print("Seconds in one day: ");
        System.out.println((hour * 60 * 60) + (minute * 60) + second);
        int NumberOfSecondsSinceMidnight = 58735;
        int SecondsInOneDay = 90060;
        int percentage;
        percentage = (NumberOfSecondsSinceMidnight*100)/SecondsInOneDay;
        System.out.print("Percentage of the day that has passed: ");
        System.out.print(percentage);
        System.out.println("%");
        System.out.print("The current time is ");
        System.out.print(hour - 8);
        System.out.print(":");
        System.out.print(minute - 11);
        System.out.print(":");
        System.out.print(second -47);
        System.out.print(".");





}

    }
