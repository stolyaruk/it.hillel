package JavaBasicCoordinates;

import com.sun.jdi.IntegerValue;

import java.util.stream.IntStream;

public class ChineseDynasties {

    public static void main(String[] args) {

        int TypeCountLee = 860;
        int attackRateWarriorLee = 13;
        int attackRateArcherLee = 24;
        int attackRateHorsemanLee = 46;

        int TypeCountMin = (int) (1.5 * TypeCountLee);
        int attackRateWarriorMin = 9;
        int attackRateArcherMin = 35;
        int attackRateHorsemanMin = 12;


        int[] armyLee = {attackRateWarriorLee,attackRateArcherLee,attackRateHorsemanLee};
        int attackRateLee = (IntStream.of(armyLee).sum() * TypeCountLee);
        System.out.println("The attack rate of Lee army is " + attackRateLee);

        int[] armyMin = {attackRateWarriorMin,attackRateArcherMin,attackRateHorsemanMin};
        int attackRateMin = (IntStream.of(armyMin).sum() * TypeCountMin);
        System.out.println("The attack rate of Min army is " + attackRateMin);

        int generalAttackRate = Integer.sum(attackRateLee, attackRateMin);

    }
}
