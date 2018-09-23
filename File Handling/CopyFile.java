import java.io.*;
public class CopyFile {



    public static void main(String[] args) throws IOException{

        String FILENAME = "C:\\Users\\ksred\\IdeaProjects\\jav1\\src\\input.txt";
        String FILENAME1 = "C:\\Users\\ksred\\IdeaProjects\\jav1\\src\\input2.txt";


        BufferedReader br =new BufferedReader(new FileReader(FILENAME));
        BufferedWriter bw =new BufferedWriter(new FileWriter(FILENAME1));
        String s="";
        while((s=br.readLine())!=null){
            bw.write(s);
            bw.write(" \n");

        }

        System.out.println("Done");

        bw.close();




    }

