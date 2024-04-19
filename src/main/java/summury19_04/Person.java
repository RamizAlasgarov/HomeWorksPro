package summury19_04;

public class Person {
    String question;

    public Person(String question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Person{" +
                "question='" + question + '\'' +
                '}';
    }
}
