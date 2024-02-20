// Given an input string s, reverse the order of the words.

// A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

// Return a string of the words in reverse order concatenated by a single space.

// Simple 6 line solution

class Solution {
    public String reverseWords(String s) {
        String[] str=s.trim().split("\\s+");
        String out="";
        for(int i=str.length-1;i>0;i--){
            out=out+str[i]+" ";
        }
        out=out+str[0];
        return out;

    }
}

