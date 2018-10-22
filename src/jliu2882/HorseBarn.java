package jliu2882;

public class HorseBarn implements Horse{
    private Horse[] spaces;

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
}
