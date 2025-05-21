import java.io.File;
import java.io.IOException;

public class CreatingAndRenamingFiles {
    public static void main(String[] args) {
        String filepath = "src/createdFile.txt";

        String renamedFilePath = "src/renamedFile.txt";

        File file = new File(filepath);

        //file creation
        if (file.exists()) {
            System.out.println("File already exists");
        }else{
            System.out.println("File does not exist");
            try{
                if(file.createNewFile()){
                    System.out.println("File created");
                }else{
                    System.out.println("File already exists");
                }
            }catch(IOException e){
                System.out.println("Error creating file");
                e.printStackTrace();
            }
        }

        System.out.println("File name is: " + file.getName());
        System.out.println("File path is: " + file.getPath());

        //File renaming

        File  renamedFile = new File(renamedFilePath);
        if (file.renameTo(renamedFile)){
            System.out.println("File renamed to: " + renamedFile.getName());
        }else{
            System.out.println("File renaming failed");
        }

        //To delete the file
       if(renamedFile.delete()) {
           System.out.println("File deleted");
       }else{
           System.out.println("File deletion failed");
       }
    }
}
