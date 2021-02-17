package sample;

public class Model {
    enum State{IN_PROGRESS, WIN,LOOSE}

    public static String[] colors = {};

    int attempt = 10; 
    int currAttempt = 0; 
    
    int difficulty = 4;
    State state = State.IN_PROGRESS;
    Raw combination;
    Raw[] proposition;

    public Model() {
        newCombination();
    } 

    void newCombination()  {
        combination = new Raw(difficulty);
    }

}
