package Utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileHandler {

    private BufferedReader reader = null;

    //Creates a buffer reader with the filepath provided
    //@param filepath -- path to file
    public void CreateReader(String filepath) {

        //Close existing reader if exists
        this.CloseReader();

        try {
            File f = new File(filepath);
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            this.reader = br;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Closes the buffered reader
    public void CloseReader() {
        if (this.reader != null) {
            try {
                this.reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                this.reader = null;
            }
        }
    }

    //Reads in the next line of the buffered reader
    //@return string of next line
    public String GetNextLine() {
        //Check that reader has been created
        if (this.reader == null) {
            System.out.println("ERROR: Buffered reader is null.");
            return null;
        }

        //Return next line
        try {
            return this.reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
