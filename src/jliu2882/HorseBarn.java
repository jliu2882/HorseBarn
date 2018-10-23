package jliu2882;

public class HorseBarn{
    private Horse[] spaces;

    public HorseBarn(Horse[] horses){
        this.spaces = horses;
    }

    public int findHorseSpace(String name){
        for(int i =0; i <this.spaces.length;i++){
            if(this.spaces[i] != null && this.spaces[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void consolidate(){
        Horse[] spacesCopy;
        spacesCopy = new Horse[this.spaces.length];
        int pos = 0;
        for(int i =0; i<this.spaces.length;i++){
            if(this.spaces[i] != null){
                spacesCopy[pos]=this.spaces[i];
                pos++;
            }
        }
        this.spaces = spacesCopy;
    }

    public String toString(){
        String result = "";
        for(int i = 0; i<this.spaces.length;i++){
            if(spaces[i]!=null){
                result += this.spaces[i].getName() + " weighs " +  this.spaces[i].getWeight() + " horse units, and is in space " + i + System.lineSeparator();
            }
        }
        return result;
    }
}
