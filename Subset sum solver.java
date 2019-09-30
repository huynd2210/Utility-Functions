//use getSolution() method 

import java.util.ArrayList;

public class SubsetSumSolver {
    private static boolean[][] dp;
    private static ArrayList<ArrayList<Integer>> solution = new ArrayList<>();

    public SubsetSumSolver(int[] arr, int sum){
        getAllSubsetSum(arr, sum);
    }
    

    public ArrayList<ArrayList<Integer>> getSolution(){
        return this.solution;
    } //Get Solution

    private static void getSubsetSum(int[] arr, int index, int sum, ArrayList<Integer> resultSet){
        if (index == 0 && sum != 0 && dp[0][sum]){
            resultSet.add(arr[index]);
            solution.add(resultSet);
            return;
        }
        if (index == 0 && sum == 0){
            solution.add(resultSet);
            return;
        }

        if (dp[index - 1][sum]){
            ArrayList<Integer> pathList = new ArrayList<>();
            pathList.addAll(resultSet);
            getSubsetSum(arr, index - 1, sum, pathList);
        }

        if (sum >= arr[index] && dp[index - 1][sum - arr[index]]){
            resultSet.add(arr[index]);
            getSubsetSum(arr, index - 1, sum - arr[index], resultSet);
        }
    }

    public static void getAllSubsetSum(int[] arr, int sum){
        int length = arr.length;
        if (length == 0 || sum < 0){
            return;
        }

        dp = new boolean[length][sum + 1];

        for (int i = 0; i < length; ++i){
            dp[i][0] = true;
        }

        if (arr[0] <= sum){
            dp[0][arr[0]] = true;
        }

        for (int i = 1; i < length; ++i){
            for (int j = 0; j < sum + 1; ++j){
                dp[i][j] = (arr[i] <= j) ? (dp[i-1][j] ||
                        dp[i-1][j-arr[i]])
                        : dp[i - 1][j];
            }
        }

        if (!dp[length - 1][sum]){
            System.out.println("There are no subsets with" + " sum " + sum);
            return;
        }
        ArrayList<ArrayList<Integer>> resultSet = new ArrayList<>();
        getSubsetSum(arr, length - 1, sum, new ArrayList<Integer>());
    }
}
