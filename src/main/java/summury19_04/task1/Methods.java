package summury19_04.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Methods {
    public static List<Person> addQuestion(){
        Person person = new Person("What is my name");
        Person person2 = new Person("How many chicken have JOHN");
        Person person3 = new Person("What is my favorite food");
        Person person4 = new Person("Which sport i do every day");
        List<Person> personList = new ArrayList<>();
        personList.add(person);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        return personList;
    }

    public static List<String> addAnswer(){
        List<String> answer =  new ArrayList<>();
        answer.add("My name is Ramiz?");
        answer.add("7?");
        answer.add("Chicken?");
        answer.add("Football?");
        return answer;
    }

    public static void findInputFromUser(){
        Scanner scanner = new Scanner(System.in);
        int res = scanner.nextInt();
        if(res == 1){
            System.out.println(addQuestion().get(0));
        } else if (res == 2) {
            System.out.println(addQuestion().get(0) + " " + addQuestion().get(1));
        } else if (res == 3) {
            System.out.println(addQuestion().get(0) + " " + addQuestion().get(1)  + " " + addQuestion().get(2));
        }else {
            System.out.println(addQuestion().get(0) + " " + addQuestion().get(1)+ " " + addQuestion().get(2) + " " + addQuestion().get(3));
        }
    }

//    public static void checkAnswers(){
//        Scanner scanner = new Scanner(System.in);
//        String res = scanner.toString();
//        if(res.equals("My name is Ramiz") == addQuestion().get(0));
//    }
//    public static void which(){
//        Scanner scanner = new Scanner(System.in);
//        List<Person> list = addCollection();
//        int answerToHowManyQuestion = scanner.nextInt();
//        if(answerToHowManyQuestion == 1){
//            list.get(3) = random.nextInt();
//
//        }
//    }

}
