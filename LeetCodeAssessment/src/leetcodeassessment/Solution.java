package leetcodeassessment;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    
    public List<String> letterCombinations(String digits) {
        
        if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }

       
        String[] phoneMap = {
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
        
        List<String> result = new ArrayList<>();
        backtrack(digits, 0, new StringBuilder(), result, phoneMap);
        return result;
    }
    
    
    private void backtrack(String digits, int index, StringBuilder currentCombination, List<String> result, String[] phoneMap) {
        
        if (index == digits.length()) {
            result.add(currentCombination.toString());
            return;
        }
        
        
        char digit = digits.charAt(index);
        String letters = phoneMap[digit - '0']; 
        
       
        for (char letter : letters.toCharArray()) {
            currentCombination.append(letter); 
            backtrack(digits, index + 1, currentCombination, result, phoneMap); 
            currentCombination.deleteCharAt(currentCombination.length() - 1);  
        }
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        
        System.out.println(solution.letterCombinations("23"));
        
       
        System.out.println(solution.letterCombinations(""));
        
        
        System.out.println(solution.letterCombinations("2"));
    }
}
