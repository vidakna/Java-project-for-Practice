package Intermediate;

public class Video1 {
    public static void main(String[] args) {
        String[] words={"funk","chunk","furry","baconator"};

        for(String w:words){
            if(w.startsWith("fu"))
                System.out.println(w + "start with");
        }
    }
}
