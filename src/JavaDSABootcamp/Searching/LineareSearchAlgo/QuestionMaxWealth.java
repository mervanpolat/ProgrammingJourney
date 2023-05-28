package JavaDSABootcamp.Searching.LineareSearchAlgo;

public class QuestionMaxWealth {
    public static void main(String[] args) {
        //https://leetcode.com/problems/richest-customer-wealth/
        //Q6: Richest Customer Wealth

        //Declaration
        int[][]accounts = {
                {1,2,3},
                {3,2,1}
        };

        int[][]accounts2 = {
                {4,2,3},
                {3,2,1}
        };

        //Method Call
        maximumWealth(accounts);
        System.out.println(maximumWealth(accounts));
        //Prints 6

        //Method Call
        maximumWealth(accounts2);
        System.out.println(maximumWealth(accounts2));
        //Prints 9
    }

    static int maximumWealth(int[][] accounts) {
        // person = row
        // account = col
        int ans = Integer.MIN_VALUE;
        int sum = 0;

        for (int person = 0; person < accounts.length; person++) {
            sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                //Calculating the sum of the ith account
                sum = sum + accounts[person][account];
            }
            //now we have sum of accounts of person
            //check with overall answer
            if (sum>ans) {
                ans = sum;
            }
        }
        //Return ans
        return ans;
    }
}
