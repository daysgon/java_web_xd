package com.xhxc.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileUtil {
    public static void storeFile(InputStream is, String path) throws IOException {
        File file = new File(path);
        FileOutputStream os = new FileOutputStream(file);
        byte[] bytes=new byte[1024];
        int read = is.read(bytes);
        while (read!=-1){
            os.write(bytes,0,read);
            read = is.read(bytes);
        }
        os.close();
    }
}
