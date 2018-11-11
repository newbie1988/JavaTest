package com.test1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class LogFile {
    private File file;
    private FileOutputStream out;
    public void init() {
        System.out.println("LogFile Init");
        try {
            out = new FileOutputStream(file);
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void destroy() {
        System.out.println("LogFile Destroy");
        try {
            out.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public FileOutputStream getOut() {
        return out;
    }
    public void setFile(File file) {
        System.out.println("setFile");
        this.file = file;
    }

}
