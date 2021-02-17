package sample;

import java.util.ArrayList;

public class Controller {
    Raw input; 
    Model model;

    public Controller(Model model) {
        this.model = model;
        input = new Raw(model.difficulty); 
    } 

    public void inputColor(String col) {
        input.add(col);
        if (input.isComplete()) {
            model.attempt(input);
            input.clear();
            return;
        }
    }
}
