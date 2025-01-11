/*
    	Company Tags 		     : OYO Rooms, Samsung, Goldman Sachs
    	Qn Link      		     : https://practice.geeksforgeeks.org/problems/tower-of-hanoi/0 
*/
/*************************************************************** JAVA ********************************************************/
//Time : O(2^n)
//Space : O(n) Recursion Stack Space

class Solution {

    public int towerOfHanoi(int n, int from, int to, int aux) {
        // Your code here
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            //System.out.println("move disk"+" "+n+" ""from rod"+" "+from+" ""to rod"+" "+n+" ");
            return 1;
        }
        // move all n-1 disk From->Aux with help of To
        int cnt = towerOfHanoi(n-1,from,aux,to);
        //move nth disk From -> To in 1 step
        cnt++;
         // move all n-1 disk Aux->To with help of From
        cnt += towerOfHanoi(n-1,aux,to,from);
        return cnt;
    }  
    
}