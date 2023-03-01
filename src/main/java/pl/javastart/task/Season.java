package pl.javastart.task;

import java.util.Arrays;

public enum Season {
    SPRING("Wiosna", new String[]{"marzec", "kwiecień", "maj"}),
    SUMMER("Lato", new String[]{"czerwiec", "lipiec", "sierpień"}),
    AUTUMN("Jesień", new String[]{"wrzesień", "październik", "listopad"}),
    WINTER("Zima", new String[]{"grudzień", "styczeń", "luty"});

    private final String plSeason;
    private final String[] seasonMonths;

    Season(String plSeason, String[] seasonMonths) {
        this.plSeason = plSeason;
        this.seasonMonths = seasonMonths;
    }

    public String plTranslation() {
        return plSeason;
    }

    public static void showSeasonMonths(String season) {
        System.out.println("W tej porze roku są następujące miesiące:");
        switch (season) {
            case "wiosna":
                System.out.println(Arrays.toString(SPRING.seasonMonths));
                break;
            case "lato":
                System.out.println(Arrays.toString(SUMMER.seasonMonths));
                break;
            case "jesień":
                System.out.println(Arrays.toString(AUTUMN.seasonMonths));
                break;
            default:
                System.out.println(Arrays.toString(WINTER.seasonMonths));
                break;
        }
    }
}