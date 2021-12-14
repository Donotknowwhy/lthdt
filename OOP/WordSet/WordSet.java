/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testOOP.WordSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

/**
 *
 * @author Admin
 */
public class WordSet {
    private Set<String> list = new HashSet<>();

    public WordSet(String s1) {
        StringTokenizer stk1 = new StringTokenizer(s1, " ");
        while(stk1.hasMoreTokens()){
            String s = stk1.nextToken().toLowerCase();
            list.add(s);
        }
    }
    
    public WordSet union(WordSet w){
        WordSet c = new WordSet("");
        c.list.addAll(list);
        for(String s: w.list)
            if(!list.contains(s))
                c.list.add(s);
        return c;
    }
    
    public WordSet intersection(WordSet w){
        Set<String> set = new HashSet<>();
        for(String s: w.list)
            if(list.contains(s))
                set.add(s);
        WordSet w1 = new WordSet("");
        w1.list = set;
        return w1;
    }

    @Override
    public String toString() {
        String s = "";
        List<String> list1 = new ArrayList<>(list);
        Collections.sort(list1);
        for(String str:list1){
            s+= str+ " ";
        }
        return s;
    }
    
    
}
