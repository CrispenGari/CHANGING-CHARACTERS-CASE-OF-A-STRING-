package Crispen_Gari.com;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
import java.util.Date;
import java.util.List;
import java.util.regex.*;
import java.lang.annotation.Annotation;
import java.util.function.IntUnaryOperator;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.sql.*;
import java.util.stream.Stream;

/*
CHANGING CHARACTERS CASE OF A STRING:
A JAVA SIMPLE PROGRAM THAT WILL CHANGE THE CHARACTERS OF A GIVEN STRING
TO EITHER UPPER CASE OR LOWER CASE. THAT IS IF A CHARACTER IN A STRING
GIVEN IS UPPERCASE CHARACTER IT WILL BE CHANGED TO A LOWERCASE OTHERWISE
UPPERCASE. (The user must give us a character that is in the given string
            inorder for us to convert it).

 */

class myClass{
    myClass(){
        System.out.println("ENTER A STRING THAT YOU WANT TO WORK WITH:");
    }
    void convetor(String str, char character, int length){
        char characters[] = str.toCharArray();
        try {
            for(int i=0;i<length;i++){
                if(characters[i]==character){
                    if(character>='a' && character<='z'){
                        // convert to uppercase
                        character -=32;
                    }else if( character>='A' && character<='Z'){
                        // convert it to lower case
                        character+=32;
                    }else{
                        System.out.println("The character is not a letter of ALPHABET");
                    }
                    characters[i] = character;
                    break;
                }
            }
            str = String.valueOf(characters);
            System.out.println("The string is now conveted to: "+ str);
        }catch (Exception e){
            throw e;
        }finally {
            System.out.println("DONE CONVERTING GOOD LUCK WITH JAVA!!");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        myClass ob1 = new myClass();
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println("Enter a character that you want to convert: ");
        char ch;
        String str_ = input.next();
        ch = str_.charAt(0);
        int len = str.length();
        ob1.convetor(str,ch,len);
    }
}



