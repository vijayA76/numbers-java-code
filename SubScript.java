import java.util.Scanner;

class Number {
    public static String subScript(String l,int b){
        StringBuilder base = null;
        try {
            base = new StringBuilder();
            StringBuilder x = new StringBuilder();
            char[] arr = ("" + b).toCharArray();
            for (char c : arr) {
                switch (c) {
                    case '0':
                        x.append("\u2080");
                        break;
                    case '1':
                        x.append("\u2081");
                        break;
                    case '2':
                        x.append("\u2082");
                        break;
                    case '3':
                        x.append("\u2083");
                        break;
                    case '4':
                        x.append("\u2084");
                        break;
                    case '5':
                        x.append("\u2085");
                        break;
                    case '6':
                        x.append("\u2086");
                        break;
                    case '7':
                        x.append("\u2087");
                        break;
                    case '8':
                        x.append("\u2088");
                        break;
                    case '9':
                        x.append("\u2089");
                        break;
                }
                base.append(x);
                x.delete(0, (arr.length - 1));
            }
        } catch (Exception e) {
            System.out.println("Error..." + e);
        }
        return (l + base);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        String base=sc.next();
        System.out.print("Enter the subscript number: ");
        int supscript=sc.nextInt();

        String str=Number.subScript(base,supscript);
        System.out.print("The number is: "+str);
    }
}