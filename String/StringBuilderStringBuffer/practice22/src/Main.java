public class Main {
    public static void main(String[] args) {

        String str = "Hello World";
        StringBuilder sb = new StringBuilder(str);
        System.out.println("String -> StringBuilder: " + sb);

        StringBuffer sbf = new StringBuffer(str);
        System.out.println("String -> StringBuffer: " + sbf);

        StringBuilder sb2 = new StringBuilder("Java Programming");
        String strFromSb = sb2.toString();
        System.out.println("StringBuilder -> String: " + strFromSb);

        StringBuffer sbf2 = new StringBuffer("Python Coding");
        String strFromSbf = sbf2.toString();
        System.out.println("StringBuffer -> String: " + strFromSbf);

        StringBuilder sb3 = new StringBuilder("Convert to StringBuffer");
        StringBuffer sbf3 = new StringBuffer(sb3.toString());
        System.out.println("StringBuilder -> StringBuffer: " + sbf3);

        StringBuffer sbf4 = new StringBuffer("Convert to StringBuilder");
        StringBuilder sb4 = new StringBuilder(sbf4.toString());
        System.out.println("StringBuffer -> StringBuilder: " + sb4);

    }
}