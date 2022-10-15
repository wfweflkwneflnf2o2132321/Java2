package Dz4;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;
import java.io.FileReader;
public class HomeWork4 {


    public static void main(String[] args) throws IOException {
      HashMap<String, Car> carsMap=  new HashMap<>();
      String cachedCarUUID = "";
       for( int i = 0; i < 100; i++){
           Car car=new Car(i);
           carsMap.put(car.uuid, car);
           if (i==27){cachedCarUUID= car.uuid;
           }
       }
        Car cachedCar = carsMap.get(cachedCarUUID);
       System.out.println(cachedCar.id + " " + cachedCar.uuid);


        Integer id =0;
        TreeMap<Car, Car> carsTreeMap = new TreeMap<>();
        for( int i = 0; i < 100; i++)
        {
            Car car=new Car(i);
            carsTreeMap.put(car, car);
        }
        System.out.println(carsTreeMap.entrySet());
        carsTreeMap.forEach((key,value)->{
            System.out.println(value.id);
        });






        File file =  new File("Урок 6. Collections Framework (скачан) (1).txt");
        Parser parser = new Parser();
        ArrayList <String> lines = parser.parse(file);
        for (String line:lines) {
            System.out.println(line);
        }




        File file1=new File("Урок 6. Collections Framework (скачан) (1).txt"); //Создание файлового дескриптора для входного файла
        String[] words = null;  //Инициализируйте массив слов
        FileReader fileReader = new FileReader(file1);  //Создание объекта для чтения файлов
        BufferedReader bufferedReader = new BufferedReader(fileReader); //Создание объекта BufferedReader
        String s;
        String input="Страдание";   // Вводимое слово для поиска
        int count=0;   //Инициализируйте слово нуль
        while((s=bufferedReader.readLine())!=null)   //Считывание содержимого из файла
            words=s.split(" ");  //Разделите слово пробелом
        for (String word : words)
        {
            if (word.equals(input))   //Поиск по заданному слову
            {
                count++;    //Если присутствует, увеличьте количество на единицу
            }
        }

        if(count!=0)  //Проверьте, не равно ли количество нулю
        {
            System.out.println("Данное слово присутствует в файле в течение "+count+" раз");
        }
        else
        {
            System.out.println("Данное слово отсутствует в файле");
        }

        fileReader.close();


















        Scanner file2 =new Scanner("Урок 6. Collections Framework (скачан).txt"); //Создание файлового дескриптора для входного файла
        String[] word=null;  //Инициализируйте массив слов
        FileReader frr = new FileReader(file);  //Создание объекта для чтения файлов
        BufferedReader brr = new BufferedReader(frr); //Создание объекта BufferedReader
        String d;
        String inputs="страдание";   // Вводимое слово для поиска
        int counts=0;   //Инициализируйте слово нуль
        while((d=brr.readLine())!=null)   //Считывание содержимого из файла
        {
            word=d.split(" ");  //Разделите слово пробелом
        }
        if(count!=0)  //Проверьте, не равно ли количество нулю
        {
            System.out.println("Данное слово присутствует в файле в течение "+counts+" раз");
        }
        else
        {
            System.out.println("Данное слово отсутствует в файле");
        }

        frr.close();




        int[] pif = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int q : pif) {
            for (int w : pif) {
                System.out.printf("%4d", (q * w));
            }
            System.out.println();
        }
























    }

}

