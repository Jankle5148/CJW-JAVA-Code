package pers.cjw.abAndImpDemo1;

public class TableTennisPlayer extends Player implements SpeakEnglish{

    public TableTennisPlayer() {
    }

    public TableTennisPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println("乒乓球运动员在学习打乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员在说英语");
    }
}
