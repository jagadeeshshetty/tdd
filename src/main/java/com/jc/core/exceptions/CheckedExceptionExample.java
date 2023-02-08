package com.jc.core.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionExample {
    public static void main(String args[]) {
        raedFile();
    }

    private static void raedFile() {
        try {
            FileInputStream file = new FileInputStream("file.txt");
            file.close();
        } catch (FileNotFoundException fife) {
            System.out.println("🔴File not found");
        } catch (IOException ioe) {
            System.out.println("🔴IO Exception");
        }
    }
}
