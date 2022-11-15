package homework6;

import java.util.*;

public class task1 {
    public static Integer enterFilter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для поиска: ");
        System.out.println(
                "1 по процессору\n2 по оперативной памяти\n3 по жесткому диску\n4 по видеокарте\n5 по материнской плате\n");
        System.out.println("Ваш выбор: ");
        return scanner.nextInt();
    }
    public static void showResult(Map<String, Notebook> result){
        for (var notebook : result.entrySet()) {
            System.out.printf("%s\n%s\n\n", notebook.getKey(), notebook.getValue().toString());
        }
    }

    public static void main(String[] args) {
        Map<Integer, String> filter = new HashMap<>();
        Map<String, Notebook> result = new LinkedHashMap<>();
        Set<Notebook> notebooks = new HashSet<>();
        Notebook notebook1 = new Notebook("AMD RYZEN 9 6980HX", "2 Tb", "4 Gb", "NVIDIA GeForce RTX 3080 Ti",
                "Gigabyte B550 AORUS ELITE V2 AM4");
        Notebook notebook2 = new Notebook("AMD RYZEN 9 6980HX", "2 Tb", "4 Gb", "NVIDIA GeForce RTX 3080 Ti",
                "MSI MAG B550 TOMAHAWK AM4");
        Notebook notebook3 = new Notebook("INTEL CORE I9 12900HK", "16 Tb", "8 Gb", "NVIDIA RTX A4500",
                "Gigabyte B550 AORUS ELITE V2 AM4");
        Notebook notebook4 = new Notebook("AMD RYZEN 9 6980HX", "4 Tb", "16 Gb", "NVIDIA GeForce RTX 3080 Ti",
                "Gigabyte B550 AORUS ELITE V2 AM4");
        Notebook notebook5 = new Notebook("INTEL CORE I5-12600H", "1 Tb", "16 Gb", "NVIDIA GeForce RTX 3070",
                "MSI MAG B550 TOMAHAWK AM4");
        Notebook notebook6 = new Notebook("AMD RYZEN 7 6800U", "2 Tb", "32 Gb", "AMD Radeon RX 6700M",
                "MSI MAG B550 TOMAHAWK AM4");
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);
        notebooks.add(notebook5);
        notebooks.add(notebook6);
        Scanner scanner = new Scanner(System.in);
        filter.put(1, "processor");
        filter.put(2, "ram");
        filter.put(3, "hdd");
        filter.put(4, "videoCard");
        filter.put(5, "motherboard");
        Integer choice = enterFilter();
        if (filter.containsKey(choice)) {
            switch (choice) {
                case 1: {
                    System.out.printf("Введите название %s: \n", filter.get(1));
                    System.out.print("Ввод: \n");
                    String input = scanner.next();
                    Notebook.findByProcessor(notebooks, input, result);
                    showResult(result);
                    break;
                }
                case 2: {
                    System.out.printf("Введите название %s : \n", filter.get(2));
                    System.out.print("Ввод: ");
                    String input = scanner.next();
                    Notebook.findByRam(notebooks, input, result);
                    showResult(result);
                    break;
                }
                case 3: {
                    System.out.printf("Введите название %s : \n", filter.get(3));
                    System.out.print("Ввод: ");
                    String input = scanner.next();
                    Notebook.findByHdd(notebooks, input, result);
                    showResult(result);
                    break;
                }
                case 4: {
                    System.out.printf("Введите название %s : \n", filter.get(4));
                    System.out.print("Ввод: ");
                    String input = scanner.next();
                    Notebook.findByVideoCard(notebooks, input, result);
                    showResult(result);
                    break;
                }
                case 5: {
                    System.out.printf("Введите название %s : \n", filter.get(5));
                    System.out.print("Ввод: ");
                    String input = scanner.next();
                    Notebook.findByMotherboard(notebooks, input, result);
                    showResult(result);
                    break;
                }
                default:
                    break;
            }
        }
        scanner.close();
    }
}
