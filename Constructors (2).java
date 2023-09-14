/*Design a class named weather report that holds a daily weather report with data members day_of_month,
hightemp, lowtemp, amount_rain and amount_snow. Use different types of constructors to initialize the
objects. Write a program to generate monthly report that displays average of each attribute. */

package test;
import java.util.Scanner;

class weather_report{
    double d,ht,lt,ar,as;
    weather_report(){
        d=0;
        ht=0;
        lt=0;
        ar=0;
        as=0;
    }
    weather_report(double day,double High_temp,double loe_temp,double amt_rain,double amt_smw){
        d=day;
        ht=High_temp;
        lt=loe_temp;
        ar=amt_rain;
        as=amt_smw;
    }
    public void avg_ht(weather_report[] arr,double n)
    {
        double sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i].ht;
        }
        double avg=sum/n;
        System.out.println("Average high temp is: " + avg);
    }
    public void avg_lt(weather_report[] arr,double n)
    {
        double sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i].lt;
        }
        double avg=sum/n;
        System.out.println("Average Low temperture is: " + avg);
    }
    public void avg_ar(weather_report[] arr,double n)
    {
        double sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i].ar;
        }
        double avg=sum/n;
        System.out.println("Average Amot of rain is: " + avg);
    }
    public void avg_as(weather_report[] arr,double n)
    {
        double sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i].as;
        }
        double avg=sum/n;
        System.out.println("Average amt of snow is: " + avg);
    }
}
public class test1 {
    public static void main(String[] args) {
        double day=0, High_temp=0 , loe_temp=0, amt_rain=0,amt_smw=0;
        weather_report[] arr =new weather_report[20];
        Scanner sc=new Scanner(System.in);
        double n;
        weather_report obj =new weather_report();
        System.out.println("Enter number of days:");
        n=sc.nextDouble();
        for(int i=0;i<n;i++){
            System.out.println("Enter day ");
            day=sc.nextDouble();
            System.out.println("Enter high temp ");
            High_temp=sc.nextDouble();
            System.out.println("Ente low temp");
            loe_temp= sc.nextDouble();
            System.out.println("Enter amt of rain");
            amt_rain=sc.nextDouble();
            System.out.println("Enter amt of snow");
            amt_smw=sc.nextDouble();
            arr[i]=new weather_report(day, High_temp, loe_temp, amt_rain,amt_smw);
        }
        obj.avg_ht(arr,n);
        obj.avg_lt(arr,n);
        obj.avg_ar(arr,n);
        obj.avg_as(arr,n);
    }
}
