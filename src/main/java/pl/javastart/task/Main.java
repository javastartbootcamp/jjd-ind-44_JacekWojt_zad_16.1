package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SeasonManager seasonManager = new SeasonManager();
        seasonManager.run(new Scanner(System.in));
    }
}
