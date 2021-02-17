package sample;

public class Modele {
    enum State{IN_PROGRESS, WIN,LOOSE}

    public static String[] colors = {};

    int tentative = 10; 
    int difficulty = 4;
    State state = State.IN_PROGRESS;
    Raw combination;
    Raw[] proposition;

    public Modele() {
        newCombination();
    } 

    void newCombination()  {
        combination = new Raw(difficulty);
    }

}
