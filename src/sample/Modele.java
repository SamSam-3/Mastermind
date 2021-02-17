package sample;

public class Modele {
    enum State{IN_PROGRESS, WIN,LOOSE}

    String[] colors = {};

    int tentative = 10; 
    int difficulty = 4;
    State state = State.IN_PROGRESS;

    public Modele() {

    } 

}
