import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.SimpleTimeZone;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {
    public static void main(String[] args) {
        task1();
    }

    static void task1(){
        String path_content = "E:\\1\\2";
        String path_log = "log.txt";
        Logger logger = Logger.getLogger(Main.class.getName());
        FileHandler fh = null;
        try{
            fh = new FileHandler(path_log);
        } catch (IOException exception){
            exception.printStackTrace();
        }
        SimpleFormatter format = new SimpleFormatter();
        fh.setFormatter(format);
        fh.setLevel(Level.INFO);
        logger.addHandler(fh);
        File dir = new File(path_content);
        String[] content = null;
        if(dir.isDirectory()){
            content = dir.list();
            /* content = new String[dir.listFiles().length];
            int i = 0;
            for(File file : dir.listFiles()){
                content[i] = file.toString();
                i++;
            }*/
        }
        if(content != null && content.length > 0){
            File file = new File("content.txt");
            FileWriter fileWriter = null;
            try{
                if(!file.exists()){
                    file.createNewFile();
                }
                fileWriter = new FileWriter(file,false);
                for (int i = 0; i < content.length; i++) {
                    fileWriter.write(content[i]);
                    fileWriter.write("\n");
                }
                fileWriter.flush();
            } catch (Exception ex){
                ex.printStackTrace();
                logger.warning(ex.getMessage());
            } finally {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    static void task2(){
        String path_content = "E:\\1\\2";
        File dir = new File(path_content);
        if(dir.isDirectory()){
            int i = 1;
            for(File file : dir.listFiles()){
                String filename = file.toString();
                int lastDotIndex = filename.lastIndexOf(".");
                int lastSlashIndex = filename.lastIndexOf("\\");
                System.out.print(i + " Расширение файла: ");
                i++;
                if(lastDotIndex >lastSlashIndex){
                    System.out.print(filename.substring(lastDotIndex + 1));
                }
                System.out.println();
            }
        }
    }
}