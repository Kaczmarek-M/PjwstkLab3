package Zad6;

// Michal Kaczmarek s18464
// Maciej Falkiewicz s19618

import java.io.*;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void readFile(String filePath) throws IOException {
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String textLine = bufferedReader.readLine();
        do {
            System.out.println(textLine);

            textLine = bufferedReader.readLine();
        } while (textLine != null);

        bufferedReader.close();

    }

    public static void wordsCount(String filePath) throws IOException {

        Long wordsCount = Files.lines(Paths.get(filePath))
                .flatMap(str -> Stream.of(str.split("[ ,.!?\r\n]")))
                .filter(s -> s.length() > 0).count();
        System.out.println(wordsCount);
    }

    public static void repeatingWords(String filePath) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        Set<String> words = new TreeSet<>();
        StreamTokenizer st = new StreamTokenizer( br );
        while( st.nextToken() != StreamTokenizer.TT_EOF ) {
            if( st.ttype == StreamTokenizer.TT_WORD ) {
                words.add( st.sval );
            }
        }
        System.out.println( words );
        br.close();
    }

    public static void main(String[] args) throws IOException {
        String sciezkaPliku = "C:\\Users\\natas\\Java_Studia\\MojeProjekty\\Zajecia_Lab4\\src\\Zad6\\Text.txt";
        readFile(sciezkaPliku);
        System.out.print("Ilosc slow: ");
        wordsCount(sciezkaPliku);
        repeatingWords(sciezkaPliku);
    }
}

