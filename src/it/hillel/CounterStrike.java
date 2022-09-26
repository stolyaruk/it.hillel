package it.hillel;

import java.util.stream.IntStream;

public class CounterStrike {

    public static void main(String[] args) {

        String teamName1 = "NaVi";
        int playerNaviFrags1 = 5;
        int playerNaviFrags2 = 7;
        int playerNaviFrags3 = 2;
        int playerNaviFrags4 = 0;
        int playerNaviFrags5 = 12;

        String teamName2 = "HellRaisers";
        int playerHellFrags1 = 0;
        int playerHellFrags2 = 1;
        int playerHellFrags3 = 4;
        int playerHellFrags4 = 2;
        int playerHellFrags5 = 1;

        int[] playersNavi = {playerNaviFrags1, playerNaviFrags2, playerNaviFrags3, playerNaviFrags4, playerNaviFrags5};
        double naviAvg = 0;
        for (int i : playersNavi) {
            naviAvg += i;
        }

        int naviSum = (IntStream.of(playersNavi).sum());

//        System.out.print("Average result " + teamName1 + " team: " + naviAvg / playersNavi.length + "\n");
//        System.out.println(teamName1 + " team result is " + naviSum);

        int[] playersHell = {playerHellFrags1, playerHellFrags2, playerHellFrags3, playerHellFrags4, playerHellFrags5};
        double hellAvg = 0;
        for (int i : playersHell) {
            hellAvg += i;
        }

        int hellSum = (IntStream.of(playersHell).sum());

//        System.out.print("Average results " + teamName2 + " team: " + hellAvg / playersHell.length + "\n");
//        System.out.println(teamName2 + " team result is " + hellSum);

        if (naviSum > hellSum) {
            System.out.println("Перемогла команда " + teamName1 + ", набрала " + naviSum + " очків!");
        } else if (naviSum < hellSum) {
            System.out.println("Перемогла команда " + teamName2 + " набрала " + hellSum + " очків!");
        } else {
            System.out.println("Команда " + teamName1 + " і команда " + teamName2 + " набрали " + naviSum + " очків. Нічия!");
        }
    }
}
