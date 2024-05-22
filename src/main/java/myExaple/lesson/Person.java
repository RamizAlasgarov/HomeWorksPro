package myExaple.lesson;

import java.util.Arrays;

/**
 Создать метод printPersonById, который принимает int id и выводит в консоль имя и возраст человека с данным ID.
 Если ID не существует, метод ничего не выводит.
 */
public class Person {
    String[] names = new String[10];
    int[] ages = new int[10];
    int currentIndex = 0;

    public void createPerson(String personName,int personAge){
        if(currentIndex < 10){
            names[currentIndex] = personName;
            ages[currentIndex] = personAge;
            currentIndex++;
        }
    }
    public String[] getPersonById(int id){
        String[] info = {"empty", "-1"};
        if(id>0 && id <10){
            info[0] = names[id];
            info[1] = String.valueOf(ages[id]);
            return info;
        }
        return info;
    }
    public void printPersonById(int id){
        if(id > 0 && id < 10){
            System.out.println(Arrays.toString(getPersonById(id)));
        }


    }
}
