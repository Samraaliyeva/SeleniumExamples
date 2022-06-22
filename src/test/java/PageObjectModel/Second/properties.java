package PageObjectModel.Second;

import First.a;

import java.io.*;
import java.util.Properties;

public class properties {

    public static void main(String[] args) throws IOException {

        Readbrowser();
        m();
       // browser();
    }
    public static void Readbrowser() throws IOException {

        Properties pro=new Properties();
        InputStream mypropertyPath=new FileInputStream("src/test/java/Second/config.properties");
        pro.load(mypropertyPath);
       // System.out.println(pro.getProperty("browser"));
        a.browser=pro.getProperty("browser");
        System.out.println(a.browser +" my browser");

    }

    public static void m() throws IOException {

        OutputStream output=new FileOutputStream("src/test/java/Second/config.properties");
        Properties pro=new Properties();
        //pro.setProperty("result", "pass");
        pro.store(output,"anything");
    }
}
