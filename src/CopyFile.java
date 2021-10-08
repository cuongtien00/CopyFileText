import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        copyFile("Test.txt","Test_Copy.txt");
    }

    private static void copyFile(String file,String fileCopy) {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try{
            inputStream = new FileInputStream(file);
            outputStream = new FileOutputStream(fileCopy);

            int ch = 0;
            while((ch = inputStream.read())!=-1){
                System.out.println((char)ch);
                outputStream.write(ch);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try{
                if(inputStream != null){
                    inputStream.close();
                }
                if(outputStream!=null){
                    outputStream.close();
                }
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
