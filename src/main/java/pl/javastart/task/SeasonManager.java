package pl.javastart.task;

import java.util.Locale;
import java.util.Scanner;

public class SeasonManager {

    public void run(Scanner scanner) {
        Season[] seasons = Season.values();
        System.out.println("Podaj pore roku:");
        for (Season season : seasons) {
            System.out.println(season.plTranslation());
        }
        String season = scanner.nextLine().toLowerCase(Locale.ROOT);
        Season.showSeasonMonths(season);
    }
}
