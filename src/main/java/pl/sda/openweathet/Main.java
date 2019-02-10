package pl.sda.openweathet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WeatherService weatherService = new WeatherService(
                "http://api.apixu.com/v1/current.json",
                "c58fd33d79104bb385190240191002"
        );
        String city;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj miasto: ");
        while (!(city = scanner.nextLine()).equals("")) {
            weatherService.getCityWeather(city);
            System.out.println("Następne miasto: ");
        }


    }
}
