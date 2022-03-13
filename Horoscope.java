package Lesson3;
import java.util.Scanner;
public class Horoscope {
    public static void main(String[] args) {
        int month, day;

        Scanner input = new Scanner(System.in);

        System.out.print("Your Birth Month : ");
        month = input.nextInt();

        System.out.print("Your Birth Day : ");
        day = input.nextInt();

        if (month == 1){
            if(day >= 1 && day <= 31);
            if (day < 22 ){
                System.out.print("Capricorn");
            }else {
                System.out.print("Aquarius");
            }
        }

        if (month == 2){
            if (day >=1 && day <= 28){
                if (day < 20 ){
                    System.out.print("Aquarius");
                }else{
                    System.out.print("Pisces");
                }
            }
        }

        if (month == 3){
            if (day >=1 && day <= 31){
                if (day < 21){
                    System.out.print("Pisces");
                }else {
                    System.out.print("Aries");
                }
            }
        }

        if (month == 4){
            if (day >=1 && day <=30){
                if (day < 21){
                    System.out.print("Aries");
                }else {
                    System.out.print("Taurus");
                }
            }
        }

        if (month == 5 ){
            if (day >=1 && day <=31){
                if (day<22){
                    System.out.print("Taurus");
                }else {
                    System.out.print("Gemini");
                }
            }
        }

        if (month == 6){
            if (day >=1 && day <=30){
                if (day < 23 ){
                    System.out.print("Gemini");
                }else {
                    System.out.print("Cancer");
                }
            }
        }

        if (month == 7){
            if (day >=1 && day <=31){
                if(day < 23){
                    System.out.print("Cancer");
                }else {
                    System.out.print("Leo");
                }
            }
        }

        if (month == 8){
            if (day >=1 && day <=30)
                if (day < 23){
                    System.out.print("Leo");
                }else {
                    System.out.print("Virgo");
                }
        }

        if (month == 9){
            if (day >=1 && day <=30)
                if (day < 23){
                    System.out.print("Virgo");
                }else {
                    System.out.print("Libra");
                }
        }

        if (month == 10){
            if (day >=1 && day <=30)
                if (day < 23){
                    System.out.print("Libra");
                }else {
                    System.out.print("Scorpio");
                }
        }

        if (month == 11){
            if (day >=1 && day <=30)
                if (day < 23){
                    System.out.print("Scorpio");
                }else {
                    System.out.print("Sagittarius");
                }
        }

        if (month == 12){
            if (day >=1 && day <=30)
                if (day < 23){
                    System.out.print("Sagittarius");
                }else {
                    System.out.print("Aquarius");
                }
        }
    }
}
