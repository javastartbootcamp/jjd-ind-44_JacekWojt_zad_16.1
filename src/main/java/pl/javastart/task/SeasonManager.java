package pl.javastart.task;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class SeasonManager {

    public void run(Scanner scanner) {
        Season[] seasons = Season.values();
        System.out.println("Podaj pore roku:");
        for (Season season : seasons) {
            System.out.println(season.plTranslation());
        }
        String seasonName = scanner.nextLine().toLowerCase(Locale.ROOT);
        Season season = Season.seasonMonths(seasonName);
        System.out.println("W tej porze roku są następujące miesiące:\n" + Arrays.toString(season.getSeasonMonths()));
    }
}
