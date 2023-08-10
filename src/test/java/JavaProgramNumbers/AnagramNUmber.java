package JavaProgramNumbers;

import java.util.LinkedHashMap;

public class AnagramNUmber {
    public static void main(String[] args) {
        String s1="care";
        String s2="race";
        LinkedHashMap<Character,Integer>map1=new LinkedHashMap<Character,Integer>();
        LinkedHashMap<Character, Integer> map2 = new LinkedHashMap<Character, Integer>();
        if(s1.length()==s2.length())
        {
            for (int i=0;i<s1.length();i++)
            {
                if (map1.containsKey(s1.charAt(i)))
                {
                   int count=map1.get(s1.charAt(i));
                    map1.put(s1.charAt(i),count+1);
                }
                else
                {
                    map1.put(s1.charAt(i),1);
                }
                if(map2.containsKey(s2.charAt(i)))
                {
                    int count = map1.get(s2.charAt(i));
                    map2.put(s2.charAt(i),count+1);
                }
                else {
                    map2.put(s2.charAt(i),1);
                }
            }
            if (map1.equals(map2))
            {
                System.out.println("anagram");
            }
            else {
                System.out.println("not anagram");
            }
        }
        else
        {
            System.out.println("not anagram");
        }
    }
}
