package summury19_04.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Дан список строк. Создайте метод, который выберет в новый список те строки, которые содержат адреса электронной почты.
 */
public class Example {
    public static void main(String[] args) {
        List<String> list = List.of("1","2","sfsdf@gfdsdfs");
        System.out.println(extractEmails(list));
    }
    public static List<String> extractEmails(List<String> original){
        List<String> resultList = new ArrayList<>();
        for(String s: original){
            if(s.contains("@")){
                resultList.add(s);
            }
        }
        return resultList;
    }
}
