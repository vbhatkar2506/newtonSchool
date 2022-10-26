import java.util.Scanner;

public class IsAnagram {
    public static void main(String[] args) {
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        if(s.length() != t.length())
        {
            System.out.print("Not Anagram");
        }
        else
        {
            int[] a = new int[26];
        for(char k:s.toCharArray())
        {
            a[k-'a']++;
        }
        for(char k:t.toCharArray())
        {
            if(a[k-'a']-- == 0)
            {
                System.out.print("Not Anagram");
                flag = true;
            }
            
        }
        if(!flag)
        {
            System.out.print("Anagram");
        }

        }
        
    }
}
