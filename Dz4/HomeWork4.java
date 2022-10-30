package Dz4;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork4 {


    public static void main(String[] args) throws IOException {
        HashMap<String, Car> carsMap = new HashMap<>();
        String cachedCarUUID = "";
        for (int i = 0; i < 100; i++) {
            Car car = new Car(i);
            carsMap.put(car.uuid, car);
            if (i == 27) {
                cachedCarUUID = car.uuid;
            }
        }
        Car cachedCar = carsMap.get(cachedCarUUID);
        System.out.println(cachedCar.id + " " + cachedCar.uuid);


        Integer id = 0;
        TreeMap<Car, Car> carsTreeMap = new TreeMap<>();
        for (int i = 0; i < 100; i++) {
            Car car = new Car(i);
            carsTreeMap.put(car, car);
        }
        System.out.println(carsTreeMap.entrySet());
        carsTreeMap.forEach((key, value) -> {
            System.out.println(value.id);
        });


//        File file = new File("Урок 6. Collections Framework (скачан) (1).txt");
//        Parser parser = new Parser();
//        ArrayList<String> lines = parser.parse(file);
//        for (String line : lines) {
//            System.out.println(line);
//        }


        int count = 0;   //Инициализируйте слово нуль
        Pattern pattern = Pattern.compile("[Сс]трад.*");
        File file1 = new File("Урок 6. Collections Framework (скачан) (1).txt"); //Создание файлового дескриптора для входного файла
        Parser parser1 = new Parser();
        ArrayList<String> lines = parser1.parse(file1);
        for (String line : lines) {
            args = line.split(" ");  //Разделите слово пробелом
            Matcher mc = pattern.matcher(Arrays.toString(args));
            while (mc.find()) {// поиск заданного слова
                count++;//если присутствует увеличиваем на один
            }
        }
        if (count != 0)  //Проверьте, не равно ли количество нулю
        {
            System.out.println("Данное слово присутствует в файле в течение " + count + " раз");
        } else {
            System.out.println("Данное слово отсутствует в файле");
        }


        int countt = 0;   //Инициализируйте слово нуль
        Pattern pattern1 = Pattern.compile("[Сс]трад.*");
        Scanner scanner = new Scanner("Урок 6. Collections Framework (скачан) (1).txt"); //Создание файлового дескриптора для входного файла
        Parser parser2 = new Parser();
        ArrayList<String> liness = parser1.parse(file1);
        for (String line : liness) {
            args = line.split(" ");  //Разделите слово пробелом
            Matcher mc = pattern.matcher(Arrays.toString(args));
            while (mc.find()) {// поиск заданного слова
                countt++;//если присутствует увеличиваем на один
            }
        }
        if (countt != 0)  //Проверьте, не равно ли количество нулю
        {
            System.out.println("Данное слово присутствует в файле в течение " + countt + " раз");
        } else {
            System.out.println("Данное слово отсутствует в файле");
        }


        int[] pif = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int q : pif) {
            for (int w : pif) {
                System.out.printf("%4d", (q * w));
            }
            System.out.println();
        }


    }

}

