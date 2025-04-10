class Solution {
    public String[] findWords(String[] words) {
        
        String str1 = "qwertyuiop";
        String str2 =  "asdfghjkl";
        String str3 = "zxcvbnm";
        Set<Character> set1 = str1.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
        Set<Character> set2 = str2.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
        Set<Character> set3 = str3.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
        System.out.println(set1 + " " + set2 + " " + set3);

        List<String> ans = new ArrayList<>();
        for(int i = 0;i<words.length;i++) {

            String str = words[i].toLowerCase();
            Set<Character> tempSet = str.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());

            Set<Character> dummySet = new HashSet<>(tempSet);

            tempSet.removeAll(set1);

            if(tempSet.isEmpty()){
                ans.add(words[i]);
            }
            tempSet = new HashSet<>(dummySet);
            tempSet.removeAll(set2);

            if(tempSet.isEmpty()){
                ans.add(words[i]);
            }
            tempSet = new HashSet<>(dummySet);

            tempSet.removeAll(set3);

            if(tempSet.isEmpty()){
                ans.add(words[i]);
            }
        }

        return ans.toArray(new String[0]);
    }
}
