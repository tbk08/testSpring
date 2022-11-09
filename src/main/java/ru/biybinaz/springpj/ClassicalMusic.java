package ru.biybinaz.springpj;

public class ClassicalMusic implements Music{
    private ClassicalMusic(){

    }
    public static ClassicalMusic getClassM(){
        return new ClassicalMusic();
    }
    public void doMyInit(){
        System.out.println("doing init");
    }
    public void doMyDestroy(){
        System.out.println("doing destruction");
    }
    @Override
    public String getSong() {
        return "Shopen";
    }
}
