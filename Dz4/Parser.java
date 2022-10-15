package Dz4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Parser {
    ArrayList <String> parse (File file) {
        ArrayList <String> lines = new ArrayList<>();
      try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
          String line ;
          while ((line = bufferedReader.readLine()) !=null){
              lines.add(line);
          }

      }catch (IOException e){
          e.printStackTrace();
      }
      return lines;

    }
}
