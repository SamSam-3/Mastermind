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
        currAttempt ++; 
        if ( raw.equals(combination) ) {
            state = State.WIN;
            System.out.println("WIN");
        } else if (currAttempt == attemptMax) {
            state = State.LOOSE;
            System.out.println("LOOSE");
        } else {
            System.out.println("try again");

        }
    }
    
    void newCombination()  {
        combination = new Raw(difficulty);
        combination.randomize();
    }

}
