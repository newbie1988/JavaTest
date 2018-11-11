package com.test1;

import java.io.IOException;

public class Operator {
    private LogFile logFile;
    public void init() throws IOException {
        System.out.println("Operator Init");
        logFile.getOut().write("Operator Init\n".getBytes());
    }
    public void destroy() throws IOException {
        System.out.println("Operator Destroy");
        logFile.getOut().write("Operator Destroy\n".getBytes());
    }
    public void write(String ss) throws IOException {
        logFile.getOut().write(ss.getBytes());
    }
    public void setLogFile(LogFile logFile) {
        this.logFile = logFile;
    }
}
