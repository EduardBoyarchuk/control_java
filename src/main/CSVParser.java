package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class CSVParser {
    private static final String RESOURCES = "src/resources/toy.csv";
    Path path = Paths.get(RESOURCES);

    public void parseCSV() throws IOException {
        CSVParser csvParser = new CSVParser();
        List<String> lines = Files.readAllLines(path);
        for (String line : lines) {
            csvParser.parseFrom(line);
        }
    }
    public SlotMachine parseFrom(String line) throws IOException{

        String[] columns = line.split(",");


        int id = Integer.parseInt(columns[0]);
        String name =  columns[1];
        int quantyti = Integer.parseInt(columns[2]);
        String chare = columns[3];


        SlotMachine slotMachine = new SlotMachine(id, name, quantyti, chare);
        Stream.of(slotMachine).forEach(System.out::println);

        return   new SlotMachine(id, name, quantyti, chare);
    }


}
