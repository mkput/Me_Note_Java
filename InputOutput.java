import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutput {
    public static void main(String[] args) throws IOException{

        FileInputStream fileInput = null;
        FileOutputStream fileOutput = null;

        //Membuka File
        fileInput = new FileInputStream("input.txt");
        
        //Membaca File
        int data = fileInput.read();

        while(data != -1){
            System.out.println(data);
            data = fileInput.read();
        }

        //Menutup File 
        fileInput.close();

        //Contoh Scenario lain pembukaan file
        try {
            //membuka file
            fileInput = new FileInputStream("input2.txt");
            fileOutput = new FileOutputStream("output2.txt");

            //membaca file
            int buffer = fileInput.read();

            while (buffer != -1){
                fileOutput.write(buffer);
                buffer = fileInput.read();
            }

        } catch (Exception e) {
            System.out.println(e);
        }finally {
            if (fileInput != null){
                fileInput.close();
            }
            if (fileOutput != null){
                fileOutput.close();
            }
        }

        //try with resources
        try (
            FileInputStream in = new FileInputStream("input.txt");
            FileOutputStream out = new FileOutputStream("ouput.txt");
        ) {

            int data2 = in.read();

            while (data2 != -1){
                out.write(data2);
                data2 = in.read();
            }
            
        }

    }
}
