import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {


    public static void throwCheckedException() throws FileNotFoundException {

        File file = new File("file not found.txt");
        FileInputStream stream = new FileInputStream(file);
        System.out.println(stream);

    }


    public static void checkedEx(){
        File file = new File("not_found.txt");

        try{
            FileInputStream st = new FileInputStream(file);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

}
