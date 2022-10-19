package classwork_2;

import java.io.File;
import java.io.FileWriter;

public class task3 {
    public static void main(String[] args) {
        // Напишите метод, который составит строку, состоящую из 10 повторений слова
        // TEST и метод, который запишет эту строку в простой текстовый файл,
        // обработайте исключения.
        String test = "TEST";
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < 10; i++) {
            sb.append(test);
        }
        String result = sb.toString();
        try {
            String pathProject = System.getProperty("user.dir");
            System.out.println(pathProject);
            String pathFile = pathProject.concat("/file.txt");
            File file = new File(pathFile);
            FileWriter fw = new FileWriter(pathFile);
            fw.write(result);
            fw.close();    
            if (file.createNewFile()) {
                System.out.println("file.created");
                
            } else {
                System.out.println("file.existed");
            }
        } catch (Exception e) {
            System.out.println("catch");
        }
       
    }
}
