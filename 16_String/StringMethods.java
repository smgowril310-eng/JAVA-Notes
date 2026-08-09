//String Methods:
/**length():
 * Returns the length of the String
 * 
 * charAt():
 * Returns the character at the specified index
 * 
 * ==:
 * Compares memory addresses
 * 
 * equals():
 * Compares the contents of two Strings
 * 
 * equalsIgnoreCase():
 * Compares two String ignoring uppercase and lowercase
 * 
 * concat():
 * Joins two String
 * 
 * toUpperCase():
 * converts the String to upperCase
 * 
 * toLowerCase():
 * converts the String to lowerCase
 * 
 * startsWith():
 * Checks whether the String starts with the given text
 * 
 * endsWith():
 * Checks whether the String ends with the given text
 * 
 * replace():
 * Replaces one character or word with another
 * 
 * indexOf():
 * Returns the first index of the given character
 * 
 * lastIndexOf():
 * Returns the last index of the given character
 * 
 * contains():
 * Checks whether the String contains a word
 * 
 * repeat():
 * Repeats the String the Specified number of times
 * 
 * compare To():
 * compares two String lexicographically
 * 
 * compare To IgnoreCase():
 * compares two Strings ignoring case
 * 
 * isEmpty():
 * Check whether the string is empty
 * 
 * isBlank():
 * Check whether the String is empty or contains only spaces
 * 
 * subString():
 * Returns a part of the String
 * 
 * trim():
 * Removes spaces from the beginning and end of the string
 * 
 * split():
 * split the String into parts
 */

public class StringMethods {
    public static void main(String[] args) {
        String S = "Gowri";
        System.out.println(S.length());//length
        System.out.println(S.charAt(2));//charAt
        String a="Java";
        String b="Java";
        System.out.println(a==b);//==
        System.out.println(a.equals(b));//equals
        String c="java";
        System.out.println(a.equalsIgnoreCase(c));//equalsIgnoreCase
        System.out.println(a.concat("Programming"));//concat
        System.out.println(c.toUpperCase());//toUpperCase
        System.out.println(S.toLowerCase());//toLowerCase
        System.out.println(a.startsWith("Ja"));//startsWith
        System.out.println(a.endsWith("va"));//endsWith
        System.out.println(c.replace("j", "B"));//replace
        System.out.println(a.indexOf("a"));//indexOf
        System.out.println(a.lastIndexOf("a"));//lastIndexOf
        System.out.println(S.contains("Go"));//contains
        System.out.println(S.repeat(5));//repeat
        System.out.println(S.compareTo(a));//compare To
        System.out.println(a.compareToIgnoreCase(c));//compareToIgnoreCase
        String v =" ";
        System.out.println(v.isEmpty());//isEmpty
        System.out.println(v.isBlank());//isBlank
        System.out.println(S.substring(2,4));//subString
        System.out.println(S.trim());//trim
        String s ="Java,Python,C";
        String[] d =s.split(",");//split
        for(String e:d){
        System.out.println(e);
        }
    }
    
}
