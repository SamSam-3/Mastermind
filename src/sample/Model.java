package sample;

public class Model {
    enum State{IN_PROGRESS, WIN,LOOSE}

    public static String[] colors = {"red", "orange"};

    int attemptMax = 10; 
    int currAttempt = 0; 
    
    int difficulty = 4;
    State state = State.IN_PROGRESS;
    Raw combination;
    Raw[] proposition;

    public Model() {
        newCombination();
    } 

    public void attempt(Raw raw) {

    }
    
    void newCombination()  {
        combination = new Raw(difficulty);
    }

}
