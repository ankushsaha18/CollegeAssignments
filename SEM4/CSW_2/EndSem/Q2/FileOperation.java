package EndSem.Q2;

import java.io.*;
import java.util.regex.Pattern;

public class FileOperation {
    public static String extract(String expression){
        String[] Operators = {"+","-","*","/"};
        for(String op : Operators){
            if(expression.contains(op)){
                String[] result = expression.split(Pattern.quote(op));
                return "Op1:" + result[0] + " Operator:" + op + " Op2:" + result[1];
            }
        }
        return "Invalid";
    }
    public static void fileWrite(String s,String fileName) throws IOException{
        File f = new File(fileName);
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(f));
            pw.write(s);
            pw.close();
        }catch (IOException e){
            e.getMessage();
        }
    }
    public static void fileRead(String fileName) throws IOException{
        File f = new File(fileName);
        if(f.exists()){
            try {
                BufferedReader br = new BufferedReader(new FileReader(f));
                String s = br.readLine();
                System.out.println(s);
            }catch (IOException e){
                e.getMessage();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String s = extract("295*234");
        fileWrite(s,"abc.txt");
        fileRead("abc.txt");
    }
}
