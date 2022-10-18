package it.hillel.hw18;

public class MainMusic {

    public static void main(String[] args) {
        MusicBands[] musicBand = new MusicBands[3];
        musicBand[0] = new MusicBands("The Hardkiss", new RockMusic());
        musicBand[1] = new MusicBands("Kalush Orchestra", new PopMusic());
        musicBand[2] = new MusicBands("Pikkardiyska Tertsiya", new ClassicMusic());

        for (MusicBands mb : musicBand) {
            System.out.print(mb.getName().toUpperCase() + " - ");
            mb.getMusicStyle().playMusic();
        }
    }
}