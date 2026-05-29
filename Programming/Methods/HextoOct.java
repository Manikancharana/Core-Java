package Programming.Methods;

import java.util.Scanner;

public class HextoOct {

    static int hextodec(String hd){
        int dec=0,p=0;
       
        for(int i=hd.length()-1;i>=0;i--){
            char ch=hd.charAt(i);
            if(ch>='0' && ch<='9'){
                 dec+=(ch-48)*(int)Math.pow(16,p++);
            }
            else if(ch>='A' && ch<='F'){
                dec+=(ch-55)*(int)Math.pow(16, p++);
            }
            else if(ch>='a' && ch<='f'){
                dec+=(ch-87)*(int)Math.pow(16, p++);
            }
            else{
                return -1;
            }
        }
        return dec;
    }

    static void dectooct(int dec){
        String oct="";
        if(dec==0) {
            System.out.println("0");
            return;
        }
        while (dec>0) {
           int r = dec%8;
           dec/=8;
           oct=r+oct;
        }
        System.out.print(oct);
    }
    public static void main(String[] args){
    Scanner sc =  new  Scanner(System.in);
    String hd=sc.next();
    int dec=hextodec(hd);

    if(dec==-1){
                System.out.print("Invalid ");
    }
    else
    dectooct(dec);
}
}