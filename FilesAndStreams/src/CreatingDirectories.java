import java.io.File;

public class CreatingDirectories {
    public static void main(String[] args) {

        String dirPath = "src/newFile";
        //Creates 2 files within a file
        String nestedDirPath = "src/newFile/nestedFile1/nestedFile2";

        File dir = new File(dirPath);
        if (!dir.exists()) {
            //method to create a directory
            if (dir.mkdir()) {
                System.out.println("Directory created");
            }else{
                System.out.println("Directory not created");
            }
            }else{
            System.out.println("Directory: "+dir.getName()+" already exists");
        }

        File nestedDirs = new File(nestedDirPath);
        if (!nestedDirs.exists()) {
            if (nestedDirs.mkdirs()) {
                System.out.println("Directories created");
            }else{
                System.out.println("Directories not created");
            }
        }else{
            System.out.println("Directories: " + nestedDirs.getName() + " already exists");
        }
        }
    }

