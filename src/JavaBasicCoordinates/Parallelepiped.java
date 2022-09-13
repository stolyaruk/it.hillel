package JavaBasicCoordinates;

public class Parallelepiped {

    public static void main(String[] args) {

        int length = 10;
        double width = 6.75;
        int height = 3;
        double volume = length * width * height;

        System.out.println("Об'єм паралелепіпеда = " + volume);

        double lengthOfAllSides = 4 * (length + width + height);

        System.out.println("Cума довжин усіх сторін = " + lengthOfAllSides);
    }
}
