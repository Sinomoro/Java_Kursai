package lt.Sinomoro.Uzduotis21;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

/*
*   daugiskaita ir vienaskaita skaito kaip skirtingus zodzius
*   linksnius skaitoto kaip skirtingus zodzius
 */

    public static void main (String[] args) throws IOException {
        Path path = FileSystems.getDefault().getPath("lt/Sinomoro/Uzduotis21/Chrismas_UTF-8.txt");
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);

        Map<String,Long> words = lines.stream()
                .map(line->line.replaceAll("[0123456789.,:;\"]",""))//TODO: papildyti visais simboliais kuriuos galima sutikt.
                .map(line->line.replaceAll("\'s"," is"))
                .map(line->line.replaceAll("\'m"," am"))
                .map(line->line.replaceAll("\'re"," are"))
                .map(line->line.toLowerCase())
                .flatMap(s -> Arrays.stream(s.split("\\s+|-")))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        Map<String,Long> wordsSorted = new LinkedHashMap<>();

        words.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .forEachOrdered(x -> wordsSorted.put(x.getKey(), x.getValue()));

        for(Map.Entry i:wordsSorted.entrySet())
        {
            System.out.println(i.getKey() + " = " + i.getValue());
        }
    }
}
