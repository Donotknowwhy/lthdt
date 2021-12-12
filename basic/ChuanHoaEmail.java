/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testhuongdoituong;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author huy
 */
public class ChuanHoaEmail {
    static Map<String, Integer> map = new HashMap<>();
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while (t-->0) {
            String s=in.nextLine();
            String x=chuanHoa(s);
            if(map.get(x)==null){
                System.out.println(x+"@ptit.edu.vn");
                map.put(x, 1);
            }
            else{
                System.out.println(x+(map.get(x)+1)+"@ptit.edu.vn");
                map.put(x,(map.get(x)+1));
            }
        }
    }
    public static String chuanHoa(String s){
        String x[]=s.trim().toLowerCase().split("\\s+");
        String kq=" ";
        kq+=x[x.length-1];
        for(int i=0;i<x.length-1;i++){
            kq+=x[i].charAt(0);
        }
        return kq;
    }
}
