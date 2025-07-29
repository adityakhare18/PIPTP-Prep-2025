import java.util.*;

public class Accenture_PDF_Code{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        initialName(s);
        sc.close();
    }
    public static void initialName(String s){
        String[] arr = s.split(" ");
        if(arr.length == 2){
            StringBuilder sb = new StringBuilder();
            char ch = arr[0].charAt(0);
            sb.append(ch);
            sb.append('.');
            sb.append(arr[1]);
            System.out.println(sb.toString());
        }
        else{
            StringBuilder sb = new StringBuilder();
            char ch = arr[0].charAt(0);
            sb.append(ch);
            sb.append('.');
            char ch1 = arr[1].charAt(0);
            sb.append(ch1);
            sb.append('.');
            sb.append(arr[2]);
            System.out.println(sb.toString());
        }
    }
}