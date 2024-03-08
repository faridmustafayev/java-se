package fullRepeat.lessonOne;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        FileReaderCommand run = new FileReaderCommand("test.txt");

        try(run) {

            run.readFile();

        }catch (FileNotFoundException ex){
            System.out.println("FileNotFound");
            System.out.println(ex.getMessage());
        } catch (IOException e) {
            System.out.println("exxception occured: " + e.getMessage());
        }

    }


}

class FileReaderCommand implements AutoCloseable {

    public String filename;
    public FileReaderCommand(String fileName) {
        this.filename = fileName;
    }

    FileReader fileReader;


    @Override
    public void close() throws IOException {
        System.out.println("In any case I call this");
        fileReader.close();
        System.out.println("I closed file");
    }

    public void readFile() throws IOException, FileNotFoundException {

        System.out.println("Starting to read file.....");
        fileReader = new FileReader(filename);

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;

        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        System.out.println("Test");
    }
}



