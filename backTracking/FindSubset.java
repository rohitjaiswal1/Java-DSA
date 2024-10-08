package backTracking;
//find & print all subsets of a given string "abc" in java language.

public class FindSubset {

    public static void findSubsets(String str, String ans, int i){
        //base case
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }
        //Yes choice
        findSubsets(str, ans+str.charAt(i), i+1);
        //No choice
        findSubsets(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, "", 0);
    }
}
