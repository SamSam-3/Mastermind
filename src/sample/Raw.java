package sample;

public class Raw {
    String[] tokens;
    int currIndex = 0;

    public Raw(int n) {
        this.tokens = new String[n];
    }
    
    public Raw(String[] tokens) {
        this.tokens = tokens;
    }

    public void add(String color) {
        tokens[currIndex] = color;
        currIndex++;
    }
    public boolean isComplete() {

    }

    @Override
    public boolean equals(Object raw) {
          
    }

    private String randomColor() {
        return Model.colors[(int)(Math.random()* Model.colors.length)];
    }

    public void randomize() {
        for (int i = 0; i < tokens.length; i++) {
            tokens[i] = randomColor();            
        }
        currIndex = tokens.length;
    }
    
}
