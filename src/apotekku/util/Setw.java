/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apotekku.util;

/**
 *
 * @author Adhyaksa57
 */
public class Setw {
    // ==== setwL ======================================================================
    //
    // - Set field width left -
    //
    // This method mimics the C++ 'setw' function, which is used to format data to the
    // screen. This function right justifies string data of size "width," filling 
    // the width to the left of the string with whitespace (' ').
    //
    // - USAGE -
    // setwL(<String> the text you wish to format, <int> size of width to be formated);
    //
    // =================================================================================	

    public String setwL(String str, int width) {
        String result = "";
        for (int x = str.length(); x < width; ++x) {
            result +=' ';
        }
//		System.out.print(str);
            result +=str;
        return result;
    }// end of setwL

    // ==== setwR ======================================================================
    //
    // - Set field width right -
    //
    // This method mimics the C++ 'setw' function, which is used to format data to the
    // screen. This function left justifies string data of size "width," filling 
    // the width to the right of the string with whitespace (' ').
    //
    // - USAGE -
    // setwR(<String> the text you wish to format, <int> size of width to be formated);
    //
    // =================================================================================
    public String setwR(String str, int width) {
        String result = "";
        result += str;
        for (int x = str.length(); x < width; ++x) {
            result += ' ';
        }
        return result;
    }// end of setwR

    // ==== setwLF ======================================================================
    //
    // - Set field width left fill -
    //
    // This method mimics the C++ 'setw' & 'setfill' functions, which are used to format 
    // data to the screen. This function right justifies string data of size "width," 
    // filling the width to the left of the string with a filler character.
    //
    // Use this method (instead of using 'setwL/setwR') when you want so specify the  
    // type of filler you want to use
    //
    // - USAGE -
    // setwLF(<String> the text you wish to format, 
    // <int> size of width to be formated, <char> the type of filler to be displayed);
    //
    // =================================================================================		
    public void setwLF(String str, int width, char fill) {
        for (int x = str.length(); x < width; ++x) {
            System.out.print(fill);
        }
        System.out.print(str);
    }// end of setwLF

    // ==== setwRF ======================================================================
    //
    // - Set field width right fill -
    //
    // This method mimics the C++ 'setw' & 'setfill' functions, which are used to format 
    // data to the screen. This function left justifies string data of size "width," 
    // filling the width to the right of the string with a filler character.
    //
    // Use this method (instead of using 'setwL/setwR') when you want so specify the  
    // type of filler you want to use
    //
    // - USAGE -
    // setwLF(<String> the text you wish to format, 
    // <int> size of width to be formated, <char> the type of filler to be displayed);
    //
    // =================================================================================
    public void setwRF(String str, int width, char fill) {
        System.out.print(str);
        for (int x = str.length(); x < width; ++x) {
            System.out.print(fill);
        }
    }// end of setwRF
}// http://programmingnotes.org/
