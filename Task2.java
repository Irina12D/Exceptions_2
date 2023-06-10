package org.example;

import java.util.Scanner;

public class Task2 {

    /*
        Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
        Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
     */

    public static void main(String[] args) {

        processInput();
    }

    public static void processInput(){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        try{
            System.out.println(inputData(s));
        }
        catch (NullPointerException e) {
            System.out.println("Ошибка! Нет данных");
        }
        catch (MyDataException ex) {
            System.out.println(ex);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            scanner.close();
        }
    }

    private static String inputData(String inputString) throws MyDataException{
        if (inputString.isEmpty())
            throw new MyDataException("Пустые строки вводить нельзя");
        return inputString;
    }
}

    abstract class MyException extends Exception {
        public MyException(String message) {
            super(message);
        }
    }
    class MyDataException extends MyException {
        public MyDataException(String message) {
            super(message);
        }
    }

