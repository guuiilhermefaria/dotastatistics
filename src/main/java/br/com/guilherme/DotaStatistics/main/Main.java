package br.com.guilherme.DotaStatistics.main;

import br.com.guilherme.DotaStatistics.constant.ApiConstant;
import br.com.guilherme.DotaStatistics.model.Hero;
import br.com.guilherme.DotaStatistics.model.Profile;
import br.com.guilherme.DotaStatistics.model.ProfileStats;
import br.com.guilherme.DotaStatistics.service.ApiClient;
import br.com.guilherme.DotaStatistics.service.ConvertData;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    private final ApiClient apiClient = new ApiClient();
    private final ConvertData convertData = new ConvertData();
    private final Scanner scanner = new Scanner(System.in);

    private String idUser = "";

    public void showMenu() throws IOException {
        var menu = """
                *** OPTIONS ***
                1. Get all heroes
                2. Get profile information
                3. Get wins and losts by profile
                4. Exit
                """;

        System.out.println(menu);
        var option = scanner.nextInt();
        scanner.nextLine();
        while (option != 4) {
            switch (option) {
                case 1:
                    System.out.println("*** Getting information about all heroes ***");
                    String heroJson = apiClient.getData(ApiConstant.BASE_URL + ApiConstant.GET_ALL_HEROES);
                    List<Hero> heroList = convertData.getList(heroJson, Hero.class);
                    heroList.forEach(System.out::println);
                    break;
                case 2:
                    System.out.println("*** Getting profile information ***");
                    System.out.println("Please, inform the id of the user you want to get: ");
                    idUser = scanner.nextLine();
                    String profileJson = apiClient.getData(ApiConstant.BASE_URL + ApiConstant.PLAYERS + "/" + idUser);
                    Profile data = convertData.getData(profileJson, Profile.class);
                    System.out.println(data);
                    break;
                case 3:
                    System.out.println("*** Get wins and losts by profile ***");
                    System.out.println("Please, inform the id of the user you want to get the wins and losts: ");
                    idUser = scanner.nextLine();
                    String winsAndLost = apiClient.getData(ApiConstant.BASE_URL + ApiConstant.PLAYERS + "/" + idUser + ApiConstant.WINS_AND_LOSTS);
                    ProfileStats profileStats = convertData.getData(winsAndLost, ProfileStats.class);
                    System.out.println(profileStats);
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
            System.out.println(menu);
            option = scanner.nextInt();
            scanner.nextLine();
        }
    }
}
