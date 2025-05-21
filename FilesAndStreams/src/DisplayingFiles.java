import java.io.File;

public class DisplayingFiles {
    public static void main(String[] args) {

        String dirFiles = "src";
        File dir = new File(dirFiles);

        //Method to list files
        File[] files = dir.listFiles();
        if (files != null && files.length > 0) {
            //Loop to list all files in the directory selected
            for (File file : files) {
                System.out.println(file.getName());
            }
        }
    }
}
