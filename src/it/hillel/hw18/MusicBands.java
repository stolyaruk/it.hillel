package it.hillel.hw18;

public class MusicBands {
    private String name;
    private MusicStyles musicStyle;

    public MusicBands(String name, MusicStyles musicStyle) {
        this.name = name;
        this.musicStyle = musicStyle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MusicStyles getMusicStyle() {
        return musicStyle;
    }

    public void setMusicStyle(MusicStyles musicStyle) {
        this.musicStyle = musicStyle;
    }
}
