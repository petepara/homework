package homeworkJava.Fifth;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

import static homeworkJava.Fifth.MapHW22.convertTextToMap;
import static homeworkJava.Fifth.SetHM21.convertStringToArray;
import static homeworkJava.Fifth.SetHM21.deletePuncMarks;

public class MapMain {
    public static void main(String[] args) throws IOException {

        String fileName = "src/homeworkJava/resources/Война и мир_книга.txt";

        Map<String,Integer> myMapa = convertTextToMap(convertStringToArray(deletePuncMarks(fileName)));
        myMapa = MapHW22.sortByValue(myMapa);

        System.out.println(myMapa);

        MapHW22.printTopWordsInMap(myMapa);



    }
}

