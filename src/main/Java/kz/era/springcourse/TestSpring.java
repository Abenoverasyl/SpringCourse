package kz.era.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        Music classicalMusic = context.getBean("classicalMusic", Music.class);
//        MusicPlayer classicalMusicPlayer = new MusicPlayer(classicalMusic);
//        classicalMusicPlayer.playMusic();
//
//        Music rockMusic = context.getBean("rockMusic", Music.class);
//        MusicPlayer rockMusicPlayer = new MusicPlayer(rockMusic);
//        rockMusicPlayer.playMusic();

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();

        Computer computer = context.getBean("computer", Computer.class);

        System.out.println(computer);

        context.close();
    }
}
