import java.util.Scanner;
public class program2 {

    
  public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        int days = 0; 
        String MonthOfName = "Unknown";

        System.out.print("Input a month number: ");
        int month = input.nextInt();

        System.out.print("Input a year: ");
        int year = input.nextInt();

        switch (month) {
            case 1:
                MonthOfName = "January";
                days = 31;
                break;
            case 2:
                MonthOfName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            case 3:
                MonthOfName = "March";
                days = 31;
                break;
            case 4:
                MonthOfName = "April";
                days = 30;
                break;
            case 5:
                MonthOfName = "May";
                days = 31;
                break;
            case 6:
                MonthOfName = "June";
                days = 30;
                break;
            case 7:
                MonthOfName = "July";
                days = 31;
                break;
            case 8:
                MonthOfName = "August";
                days = 31;
                break;
            case 9:
                MonthOfName = "September";
                days = 30;
                break;
            case 10:
                MonthOfName = "October";
                days = 31;
                break;
            case 11:
                MonthOfName = "November";
                days = 30;
                break;
            case 12:
                MonthOfName = "December";
                days = 31;
        }
        System.out.print(MonthOfName + " " + year + " has " + days + " days\n");
    }
}
