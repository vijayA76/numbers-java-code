import java.util.Scanner;

class Number {
    public static String superScript(String b,int p){
        StringBuilder power = null;
        try {
            power = new StringBuilder();
            StringBuilder x = new StringBuilder();
            char[] arr = ("" + p).toCharArray();
            for (char c : arr) {
                switch (c) {
                    case '0':
                        x.append("\u2070");
                        break;
                    case '1':
                        x.append("\u00B9");
                        break;
                    case '2':
                        x.append("\u00B2");
                        break;
                    case '3':
                        x.append("\u00B3");
                        break;
                    case '4':
                        x.append("\u2074");
                        break;
                    case '5':
                        x.append("\u2075");
                        break;
                    case '6':
                        x.append("\u2076");
                        break;
                    case '7':
                        x.append("\u2077");
                        break;
                    case '8':
                        x.append("\u2078");
                        break;
                    case '9':
                        x.append("\u2079");
                        break;
                }
                power.append(x);
                x.delete(0, (arr.length - 1));
            }
        } catch (Exception e) {
            System.out.println("Error..." + e);
        }
        return ( b + power);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        String base=sc.next();
        System.out.print("Enter the superscript number: ");
        int supscript=sc.nextInt();
        
        String str=Number.superScript(base,supscript);
        System.out.print("The number is: "+str);
    }
}