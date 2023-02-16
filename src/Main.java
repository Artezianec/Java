import java.util.Arrays;

public class Main {
    //["byte","short","int","long","float","double","char"];
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Maximum value Byte = " + Byte.MAX_VALUE);
            System.out.println("Minimum value Byte = " + Byte.MIN_VALUE);
            System.out.println("<= **** =>");
            System.out.println("Maximum value Short = " + Short.MAX_VALUE);
            System.out.println("Minimum value Short = " + Short.MIN_VALUE);
            System.out.println("<= **** =>");
            System.out.println("Maximum value Integer = " + Integer.MAX_VALUE);
            System.out.println("Minimum value Integer = " + Integer.MIN_VALUE);
            System.out.println("<= **** =>");
            System.out.println("Maximum value Long = " + Long.MAX_VALUE);
            System.out.println("Minimum value Long = " + Long.MIN_VALUE);
            System.out.println("<= **** =>");
            System.out.println("Maximum value Float = " + Float.MAX_VALUE);
            System.out.println("Minimum value Float = " + Float.MIN_VALUE);
            System.out.println("<= **** =>");
            System.out.println("Maximum value Double = " + Double.MAX_VALUE);
            System.out.println("Minimum value Double = " + Double.MIN_VALUE);
            System.out.println("<= **** =>");
            System.out.println("Maximum value Char = " + Character.MAX_VALUE);
            System.out.println("Minimum value Char = " + Character.MIN_VALUE);
        } else {
/*            TypeCheck(args);*/
            for (int i = 0; i < args.length; i++) {
                if (args[i].toUpperCase().equals("BYTE")) {
                    System.out.println("Maximum value Byte = " + Byte.MAX_VALUE);
                    System.out.println("Minimum value Byte = " + Byte.MIN_VALUE);
                } else if (args[i].toUpperCase().equals("SHORT")) {
                    System.out.println("Maximum value Short = " + Short.MAX_VALUE);
                    System.out.println("Minimum value Short = " + Short.MIN_VALUE);
                } else if (args[i].toUpperCase().equals("INT")) {
                    System.out.println("Maximum value Integer = " + Integer.MAX_VALUE);
                    System.out.println("Minimum value Integer = " + Integer.MIN_VALUE);
                } else if (args[i].toUpperCase().equals("LONG")) {
                    System.out.println("Maximum value Long = " + Long.MAX_VALUE);
                    System.out.println("Minimum value Long = " + Long.MIN_VALUE);
                } else if (args[i].toUpperCase().equals("DOUBLE")) {
                    System.out.println("Maximum value Double = " + Double.MAX_VALUE);
                    System.out.println("Minimum value Double = " + Double.MIN_VALUE);
                } else if (args[i].toUpperCase().equals("CHAR")) {
                    System.out.println("Maximum value Char = " + Integer.toString(Character.MAX_VALUE));
                    System.out.println("Minimum value Char = " + Integer.toString(Character.MIN_VALUE));
                } else {
                    System.out.println(args[i] + " Wrong type");
                }
            }
        }
    }
}