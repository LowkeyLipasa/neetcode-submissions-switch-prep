class Solution {
    public boolean isAnagram(String s, String t) {
        //frequency map
        // if(s.length()!=t.length())
        //     return false;
        // int n=s.length();
        // int freq[]=new int[26];
        // for(char c: s.toCharArray())
        //     freq[c-'a']++;

        // for(char c: t.toCharArray())
        //     freq[c-'a']--;

        // for(int i=0;i<26;i++)
        //     if(freq[i]!=0)
        //         return false;
        
        // return true;

        //hash map
        Map<Character,Integer> map=new HashMap<>();
        for(char c: s.toCharArray())
            map.put(c,map.getOrDefault(c,0)+1);

        for(char c: t.toCharArray()){
            if(!map.containsKey(c))
                return false;

            map.put(c,map.get(c)-1);

            if(map.get(c)==0)
                map.remove(c);
        }

        return (map.size()==0) ? true : false;
        
    }
}
