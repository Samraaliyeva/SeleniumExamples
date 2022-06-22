package Path;

import org.testng.annotations.Test;

import java.io.*;
import java.util.Properties;

public class amazonn {

    Properties property;
    FileInputStream in;

    @Test
    public void mine() throws IOException {

        in=new FileInputStream(System.getProperty("browser"));
        property=new Properties();
        property.load(in);
        property.getProperty("url");

    }
}
