package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Ad {

    private String adName;
    private String client;
    private Date startDate;
    private Date endDate;
    private double investmentPerDay;

    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Ad(){
    }

    public Ad(String adName, String client, Date startDate, Date endDate, double investmentPerDay) {
        this.adName = adName;
        this.client = client;
        this.startDate = startDate;
        this.endDate = endDate;
        this.investmentPerDay = investmentPerDay;
    }

    public String getAdName() {
        return adName;
    }

    public void setAdName(String adName) {
        this.adName = adName;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public double getInvestmentPerDay() {
        return investmentPerDay;
    }

    public double totalAmountInvestment(){
        long diff = endDate.getTime() - startDate.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS) * investmentPerDay;
    }

    public double maximumNumberOfViews(){
        double views = totalAmountInvestment() * 30 + 40 * 4;
        return views;
    }

    public double maximumNumberOfClicks(){
        double clicks = maximumNumberOfViews() * 0.12;
        return clicks;
    }

    public double maximumNumberOfShares(){
        double shares = maximumNumberOfClicks() * 0.15;
        return shares;
    }
}
