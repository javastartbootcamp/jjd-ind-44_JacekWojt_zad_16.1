package pl.javastart.task;

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

    public static Season seasonMonths(String season) {
        return switch (season) {
            case "wiosna" -> SPRING;
            case "lato" -> SUMMER;
            case "jesień" -> AUTUMN;
            default -> WINTER;
        };
    }

    public String[] getSeasonMonths() {
        return seasonMonths;
    }
}