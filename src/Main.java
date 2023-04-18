import java.io.File;
public class Main {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\lango\\OneDrive\\Desktop\\da_file.txt");

        if (file.exists()) {

            System.out.println("this file exists");

        } else {

            System.out.println("where is the file man!!!!!!!");
            System.out.println(file.getPath()); // displays file name
            System.out.println(file.getAbsolutePath()); // displays directory
            System.out.println(file.isFile()); // sees if file is a file (boolean)
            // file.delete(); // will delete file in project folder
        }
    }
}


// file - an abstract representation of file and directory pathnames

// within file object, place the pathway of your file when its not in the project folder