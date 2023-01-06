package ua.lyashko.module2;

import java.io.FileNotFoundException;

public class MyException extends FileNotFoundException {
    @Override
    public String getMessage () {
        return "Error";
    }
}