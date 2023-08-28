package main;

import java.io.File;
import java.io.IOException;

public class MainApplication {

    public static void main(String[] args) {
        String path = "src/resource/toy.csv";
        File file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        ViewMain app = new ViewMain();
        app.showMenu();
        }
}
