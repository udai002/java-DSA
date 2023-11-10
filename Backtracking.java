public class Backtracking {
    public static void permutation(String str , String perm , int idx){
        if(str.length() == 0){
            System.out.println(perm);
            return;
        }

        for(int i=0 ; i<str.length() ; i++){
            char currChar = str.charAt(i);// taking current string 
            String newStr = str.substring(0, i) + str.substring(i+1); // creating new string 
            
            permutation(newStr,perm + currChar, idx+1);// recursion to print permutation of string
        }
    }
    public static void main(String [] args){
        String str  = "ABC";
        permutation(str, "", 0);//print possible permutations
        
    }
}
