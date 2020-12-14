package stringLab;

import java.util.Scanner;
/**
 * @author gorbenko
 */
public class ProbStringBuilder {
    public static void main(String[] args) {
        long t1,t2;
        int numsimb;
        Scanner sc=new Scanner(System.in);
        System.out.print("Какая должна быть длина последовательности? - ");
        numsimb=sc.nextInt();
        // Используем простой String
        String Key="";
        System.out.println(" Key = "+Key);
        t1=System.currentTimeMillis();
        for(int i=0; i<numsimb; i++) {
            Key += (char)((int)(Math.random()*255));
        }
        t2=System.currentTimeMillis();
        System.out.println(" Key = "+Key);
        System.out.println("Время вычисления = "+(double)(t2-t1)/1000+" s");
        System.out.println("Длина строки = "+Key.length());

        // Используем StringBuilder
        StringBuilder Key2=new StringBuilder("");
        System.out.println(" Key = "+Key2);
        t1=System.currentTimeMillis();
        for(int i=0; i<numsimb; i++) {
            Key2.append((char)((int)(Math.random()*255)));
        }
        t2=System.currentTimeMillis();
        System.out.println(" Key = "+Key2.toString());
        System.out.println("Время вычисления = "+(double)(t2-t1)/1000+" s");
        System.out.println("Длина строки = "+Key2.length());

        // Используем StringBuffer
        StringBuffer Key3 = new StringBuffer("");
        System.out.println(" Key = "+Key3);
        t1=System.currentTimeMillis();
        for(int i=0; i<numsimb; i++) {
            Key3.append((char)((int)(Math.random()*255)));
        }
        t2=System.currentTimeMillis();
        System.out.println(" Key = "+Key3.toString());
        System.out.println("Время вычисления = "+(double)(t2-t1)/1000+" s");
        System.out.println("Длина строки = "+Key3.length());

        String[] arrayofStr = {"First","Third","Second","Fourth"};

        StringBuffer[] arrayOfSBuf = {new StringBuffer("First"),
                new StringBuffer("Third"),
                new StringBuffer("Second"),
                new StringBuffer("Fourth")
        };

        StringBuilder[] arrayOfSBld = {new StringBuilder("First"),
                new StringBuilder("Third"),
                new StringBuilder("Second"),
                new StringBuilder("Fourth")
        };
        sortString(arrayofStr);
        sortStringBuffer(arrayOfSBuf);
        sortStringBuilder(arrayOfSBld);
    }

    private static void sortString(String[] arrayofStr){
        int size = arrayofStr.length;
        for(int i = 0; i<size-1; i++) {
            for (int j = i+1; j<arrayofStr.length; j++) {
                if(arrayofStr[i].compareTo(arrayofStr[j])>0) {
                    String temp = arrayofStr[i];
                    arrayofStr[i] = arrayofStr[j];
                    arrayofStr[j] = temp;
                }
            }
        }
        for (String s : arrayofStr) {
            System.out.println(s);
        }
    }

    private static void sortStringBuffer(StringBuffer[] arrayOfSBuf){
        int size = arrayOfSBuf.length;
        for(int i = 0; i<size-1; i++) {
            for (int j = i+1; j<arrayOfSBuf.length; j++) {
                if(arrayOfSBuf[i].compareTo(arrayOfSBuf[j])>0) {
                    StringBuffer temp = arrayOfSBuf[i];
                    arrayOfSBuf[i] = arrayOfSBuf[j];
                    arrayOfSBuf[j] = temp;
                }
            }
        }
        for (StringBuffer stringBuffer : arrayOfSBuf) {
            System.out.println(stringBuffer);
        }
    }

    private static void sortStringBuilder(StringBuilder[] arrayOfSBld){
        int size = arrayOfSBld.length;
        for(int i = 0; i<size-1; i++) {
            for (int j = i+1; j<arrayOfSBld.length; j++) {
                if(arrayOfSBld[i].compareTo(arrayOfSBld[j])>0) {
                    StringBuilder temp = arrayOfSBld[i];
                    arrayOfSBld[i] = arrayOfSBld[j];
                    arrayOfSBld[j] = temp;
                }
            }
        }
        for (StringBuilder stringBuilder : arrayOfSBld) {
            System.out.println(stringBuilder);
        }
    }
}
