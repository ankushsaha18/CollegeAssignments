package Assignment5;

public class Q1 {
    public static void main(String[] args) {
        String x = "BCDAACD";
        String y = "ACDBAC";
        LCS_length(x,y);
    }
    public static void LCS_length(String x,String y){
        int m = x.length();
        int n = y.length();
        int[][] dp = new int[m+1][n+1];
        char[][] direction = new char[m+1][n+1];
        for(int i = 0 ; i <= m ; i ++){
            dp[i][0] = 0;
        }
        for(int j = 0 ; j <= n ; j++){
            dp[0][j] = 0;
        }
        for(int i = 1 ; i <= m ; i++){
            for(int j = 1 ; j <= n ; j++){
                if(x.charAt(i-1) == y.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                    direction[i][j] = 'D';
                } else if(dp[i-1][j] >= dp[i][j-1]){
                    dp[i][j] = dp[i-1][j];
                    direction[i][j] = 'U';
                }else{
                    dp[i][j] = dp[i][j-1];
                    direction[i][j] = 'L';
                }
            }
        }
        System.out.println("Length of maximum subsequence = " + dp[m][n]);
        System.out.print("The subsequence is --> ");
        print_LCS(direction,x,m,n);
    }
    public static void print_LCS(char[][] direction,String x,int i,int j){
        if(i == 0 || j == 0){
            return;
        }
        if(direction[i][j] == 'D'){
            print_LCS(direction,x,i-1,j-1);
            System.out.print(x.charAt(i-1));
        }else if(direction[i][j] == 'U'){
            print_LCS(direction,x,i-1,j);
        }else {
            print_LCS(direction,x,i,j-1);
        }
    }
}
