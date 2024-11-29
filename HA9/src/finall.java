import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class finall {
    public static void main(String[] args) {

        FileReader file = null;
        try{
            file = new FileReader("example.txt");
        }
        catch(IOException e){
            System.out.println("file not found or cant be opened");
        }finally{
            try{
                if(file != null){
                    file.close();
                    System.out.println("file closed");
                }
            } catch(IOException e){
                System.out.println("error while closing file");
            }
        }
    }
}
