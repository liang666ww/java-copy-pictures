import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class 复制图片 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\2022暑java程序汇编\\证件照（王亮）.jpg");
        byte[] bys = new byte[1024];
        int len;
        FileOutputStream fos = new FileOutputStream("wl.jpg");
       while((len=fis.read(bys))!=-1){
           fos.write(bys,0,len);
       }
       fis.close();
       fos.close();
    }
}
