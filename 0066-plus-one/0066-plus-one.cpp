class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        /*int n=digits.size();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            int dg=digits[i];
            sum=sum*10+dg;
        }
        sum=sum+1;
        int m=sum;
        vector<int> ans;
        while(sum!=0)
        {
            int dg1=sum%10;
            sum=sum/10;
            ans.push_back(dg1);
            n--;
        }
        reverse(ans.begin(),ans.end());
        return ans;
        */

        int n=digits.size();
        for(int i=n-1;i>=0;i--)
        {
            if(digits[i]<9)
            {
                digits[i]++;
                return digits;
            }
            else
            {
                digits[i]=0;
            }
        }
        //if all digits are 9 then add 1 to the beginning
        digits.insert(digits.begin(),1);
        return digits;
    }
};