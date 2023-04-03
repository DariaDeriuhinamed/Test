package week2;

import java.io.IOException;
import java.util.Scanner;

public class IfSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value from 1 to 12: ");
        int monthNumber = scanner.nextInt();

        String monthName;
        String season;
        switch (monthNumber) {
            case 1:
                monthName = "January";
                season = "Winter";
                break;
            case 2:
                monthName = "February";
                season = "Winter";
                break;
            case 3:
                monthName = "March";
                season = "Spring";
                break;
            case 4:
                monthName = "Aril";
                season = "Spring";
                break;
            case 5:
                monthName = "May";
                season = "Spring";
                break;
            case 6:
                monthName = "June";
                season = "Summer";
                break;
            case 7:
                monthName = "July";
                season = "Summer";
                break;
            case 8:
                monthName = "August";
                season = "Summer";
                break;
            case 9:
                monthName = "September";
                season = "Autumn";
                break;
            case 10:
                monthName = "October";
                season = "Autumn";
                break;
            case 11:
                monthName = "November";
                season = "Autumn";
                break;
            case 12:
                monthName = "December";
                season = "Winter";
                break;
            default:
                monthName = "Unknown month";
                season = "Unknown season";
                break;
        }

        System.out.println("Your month is " + monthName + ". It is in the " + season);
    }
}
