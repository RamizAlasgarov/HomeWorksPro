package _24_04_19.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question {
    private String text;
    private String correct;
    private List<String> incorrects;

    public Question() {

    }

    public Question(String text, String correct, List<String> incorrects) {
        this.text = text;
        this.correct = correct;
        this.incorrects = incorrects;
    }

    public String getText() {
        return text;
    }

    public String getCorrect() {
        return correct;
    }

    public List<String> getIncorrects() {
        return incorrects;
    }

    public boolean isCorrectAnswer(String answer){
        return correct.equals(answer);
    }

    public List<String> getOptions(){
        List<String> result = new ArrayList<>(incorrects);
        result.add(correct);
        Collections.shuffle(result);
        return result;
    }

    @Override
    public String toString() {
        return "Question{" +
                "text='" + text + '\'' +
                ", correct='" + correct + '\'' +
                ", incorrects=" + incorrects +
                '}';
    }
}
