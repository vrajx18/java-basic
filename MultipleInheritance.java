import java.util.*;
public class MultipleInheritance {
    public static void main(String[] args) {

    }
}
interface  camara {
    void takePhoto();
}
interface Musicplayer {
    void playMusic();
}
class Defination implements camara,Musicplayer{
    @Override
    public void takePhoto() {
        System.out.println("photo is taken by camra  app!!!");
    }

    @Override
    public void playMusic() {
        System.out.println("music is rang by Music player app !!");
    }
}