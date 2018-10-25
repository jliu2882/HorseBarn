package jliu2882;

public class Appaloosa implements Horse{
    private String name;
    private int weight;

    public Appaloosa(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public String getName(){
        return this.name;
    }
    public int getWeight(){
        return this.weight;
    }
    public String getBreed(){
        return "Appaloosa";
    }
}