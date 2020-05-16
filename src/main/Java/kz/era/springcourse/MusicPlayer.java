package kz.era.springcourse;

public class MusicPlayer {
    private Music music;

    // IoC
    public  MusicPlayer(Music music) {
        this.music = music;
    }

    public void payMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
