public class StringUtil {
    private static final String TEXT = "We are living in an yellow submarine. We don't have anything";
    //method 1
    public static String method(String a, String b) {
        return a + b;
    } 
    public static String method(int a, int b, String c) {
        return a + b + c;
    }
    public static String method(String a, int b, String c) {
        return a + b + c;
    }
    public static String method(String a, int b, int c, String d) {
        return a + b + c + d;
    }
    //method 2
    public static void method(String text) {
        System.out.println(text.replace(" ", "\n"));
    }
    //method 3
    public static String reverse(String text) {
        return new StringBuilder(text).reverse().toString();
    }
    //method 4
    public static int method4(String line, String token) {
        if (line == null || token == null || token.isEmpty()) {
            return 0;
        }
        int count = 0;
        int index = line.indexOf(token);
        while (index != -1) {
            count++;
            index = line.indexOf(token, index + token.length());
        }
        return count;
    }
    //method 5 (string)
    public static String method5_1(String text) {
        return text.toUpperCase();
    }
    //method 5 (builder)
    public static String method5_2(String text) {
        StringBuilder a = new StringBuilder(text);
        for (int i = 0; i < a.length(); i++) {
            a.setCharAt(i, Character.toUpperCase(a.charAt(i)));
        }
        return a.toString();
    }
    //method 7 (string)
    public static String removeString(String text) {
        return text.replace("a", "");
    }
    //method 7 (builder)
    public static String removeBuilder(String text) {
        StringBuilder a = new StringBuilder(text);
        for (int i = a.length() - 1; i >= 0; i--) {
            if (a.charAt(i) == 'a') {
                a.deleteCharAt(i);
            }
        }
        return a.toString();
    }
    //method 8
    public static String replace2(String text) {
        return text.replace('a', '*');
    }
    //method 9
    public static String method9(String text) {
        String longest = "";
        for (String word : text.split(" ")) {
            String clean = word.replaceAll("[^\\p{L}']", "");
            if (clean.length() > longest.length()) {
                longest = clean;
            }
        }
        return longest;
    }
    //method 10
    public static int method10(String text, String c) {
        return text.indexOf(c);
    }
    //method 11 (String)
    public static void method11(String line, int n) {
    if (n < 0 || n >= line.length()) {
    System.out.println("Index out of range");
    return;
    }
    System.out.println(line.substring(0, n + 1));
    }
     //method 11 (builder)
     public static void method11(StringBuilder line, int n) {
     if ( n < 0 || n >= line.length()) {
     System.out.println("Index out of range");
     return;
   }
 System.out.println(line.substring(0, n + 1));
}
    //method 12
    public static boolean method12(String str) {
        return str != null && !str.isEmpty();
    }
     //method 13
     public static String method13(String text) {
     String longest = "";
for (String part : text.split(",")) {
String trimmed = part.trim();
if (trimmed.length() > longest.length()) {
longest = trimmed;
}
}
return longest;
}

public static void main(String[] args) {
      System.out.println(method("hello", "world"));
System.out.println(method(1, 2, "hello"));
System.out.println(method("1", 2, "hello"));
System.out.println(method("hello", 1, 2, "world"));
method("We are living in");
System.out.println(reverse("sample"));
System.out.println(method4(TEXT, "in"));
System.out.println(method5_1(TEXT));
System.out.println(method5_2(TEXT));
System.out.println(removeString(TEXT));
System.out.println(removeBuilder(TEXT));
System.out.println(replace2(TEXT));
System.out.println(method9(TEXT));
System.out.println(method10(TEXT, "a"));
method11("We are living", 4);
method11(new StringBuilder("We are living"), 4);
System.out.println(method12(null));
System.out.println(method12(""));
System.out.println(method12("hello"));
System.out.println(method13("We, are, living, in an, yellow, submarine, We don't, have anything"));
      }
}