package sample;

public class Raw {
    String[] tokens;
    int currIndex = 0;

    public Raw(int n) {
        for (int i = 0; i < n; i++) {
            this.tokens[i] = randomColor();            
        }
    }
    private String randomColor() {
        return Model.colors[(int)(Math.random()* Model.colors.length)];
    }
    
}
