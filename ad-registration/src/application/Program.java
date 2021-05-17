package application;

import entities.Ad;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Enter the ad name: ");
            String adName = sc.nextLine();
            System.out.print("Enter the client: ");
            String client = sc.nextLine();
            System.out.print("Enter the start date: ");
            Date startDate = sdf.parse(sc.next());
            System.out.print("Enter the end date: ");
            Date endDate = sdf.parse(sc.next());
            System.out.print("Enter the investment per day: ");
            double investmentPerDay = sc.nextDouble();

            Ad ad = new Ad(adName, client, startDate, endDate,investmentPerDay);
            System.out.println("Total amount " + ad.totalAmountInvestment());

            System.out.println("Maximum number of views: " + Math.round(ad.maximumNumberOfViews()));

            System.out.println("Maximum number of clicks: " + Math.round(ad.maximumNumberOfClicks()));

            System.out.println("Maximum number of shares: " + Math.round(ad.maximumNumberOfShares()));

        } catch (ParseException e) {
            System.out.println("Invalid date format");
        }
    }
}
