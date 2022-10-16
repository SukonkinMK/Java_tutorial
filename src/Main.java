import java.util.*;

public class Main {
    private static final String[] RAM = new String[]{"1","2","4","8","16"};
    private static final String[] HDD = new String[]{"64","128","256","512","1024"};
    private static final String[] CPU = new String[]{"intel_p4","intel_celeron","intel_core","amd","amd_ryzen"};
    private static final String[] OS = new String[]{"Win7","Win8","Win10","Ubuntu","Debian"};
    private static final String[] COLOR = new String[]{"black","gray","white","red","green"};
    public static void main(String[] args) {
        Set<Notebook> set = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            set.add(notebookGen(random));
        }
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        Map<Integer,String> map = new HashMap<>();
        while (flag){
            System.out.print("Добавить фильтры? (Y/N) ");
            String ans1 = scanner.nextLine();
            if(ans1.equals("N")){
                flag = false;
            }
            else if(ans1.equals("Y")){
                System.out.println("Введите цифру, соответствующую необходимому критерию:");
                System.out.println("1 - ОЗУ\n2 - Объем ЖД\n3 - Процессор\n4 - Операционная система\n5 - Цвет");
                int ans2 = Integer.parseInt(scanner.nextLine());
                System.out.println("Доступны варианты");
                String[] arr = selectProperty(ans2);
                if (arr != null){
                    for (int i = 1; i <= arr.length; i++) {
                        System.out.println(i + " - " + arr[i-1]);
                    }
                    System.out.print("Введите цифру, соответствующую необходимому критерию: ");
                    int ans3 = Integer.parseInt(scanner.nextLine());
                    map.put(ans2,arr[ans3 - 1]);
                }
            }
        }
        System.out.println("Выбранный фильтр:");
        System.out.println(map);
        System.out.println("Подходящие ноутбуки:");
        for (Notebook item:
             set) {
            if(isFits(item,map)){
                System.out.println(item);
            }
        }
    }

    static boolean isFits(Notebook notebook, Map<Integer, String> map){
        if(map.isEmpty()){
            return true;
        }
        for (int key : map.keySet()) {
            switch (key){
                case 1:
                    if(Integer.parseInt(notebook.ramCapacity) < Integer.parseInt(map.get(key))){
                        return false;
                    }
                    break;
                case 2:
                    if(Integer.parseInt(notebook.hddCapacity) < Integer.parseInt(map.get(key))){
                        return false;
                    }
                    break;
                case 3:
                    if(!notebook.cpu.equals(map.get(key))){
                        return false;
                    }
                    break;
                case 4:
                    if(!notebook.os.equals(map.get(key))){
                        return false;
                    }
                    break;
                case 5:
                    if(!notebook.color.equals(map.get(key))){
                        return false;
                    }
                    break;
            }
        }
        return true;
    }

    static String[] selectProperty(int key){
        return switch (key) {
            case 1 -> RAM;
            case 2 -> HDD;
            case 3 -> CPU;
            case 4 -> OS;
            case 5 -> COLOR;
            default -> null;
        };
    }
    static Notebook notebookGen(Random random){
        return new Notebook(RAM[random.nextInt(RAM.length)],HDD[random.nextInt(HDD.length)],
                CPU[random.nextInt(CPU.length)],OS[random.nextInt(OS.length)], COLOR[random.nextInt(COLOR.length)]);
    }
}