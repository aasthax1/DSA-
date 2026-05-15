class Solution {

    public List<String> letterCombinations(String digits) {

        List<String> ans = new ArrayList<>();

        if(digits.isEmpty()){
            return ans;
        }

        String[] map = {
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };

        helper("", digits, ans, map);

        return ans;
    }

    static void helper(String p, String up,
                       List<String> ans,
                       String[] map){

        if(up.isEmpty()){
            ans.add(p);
            return;
        }

        int digit = up.charAt(0) - '0';

        String letters = map[digit];

        for(int i = 0; i < letters.length(); i++){

            char ch = letters.charAt(i);

            helper(p + ch,
                   up.substring(1),
                   ans,
                   map);
        }
    }
}