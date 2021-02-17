package sample;

import java.util.ArrayList;

public class Controller {
    String[] colorInput; 
    int currIndex = 0; 
    Model model;

    public Controller(Model model) {
        this.model = model;
    } 

    public void inputColor(String col) {
        colorInput[currIndex] = col;
        if (currIndex == model.difficulty ) {
            model.attempt(new Raw(colorInput));
            currIndex = 0;
            return;
        }
        currIndex++;
    }
}
