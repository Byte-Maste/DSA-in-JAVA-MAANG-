/*
  
  Gfg link : https://www.geeksforgeeks.org/problems/reverse-a-stack/1
*/



/*************************************************************** JAVA ********************************************************/
//T.C : O(n^2)
//S.C : O(1) - Auxilary Space

class Solution
{ 
    static void reverse(Stack<Integer> s)
    {
        // add your code here
        reversestack(s);
    }
    static void reversestack(Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            return;
        }
        int top = s.pop();
        // leap faith in it
        reversestack(s);
        insertElementAtBottom(s,top);
    }
    static void insertElementAtBottom(Stack<Integer> s,int element)
    {
        if(s.isEmpty())
        {
            s.push(element);
            return;
        }
        int top = s.pop();
        //leap faith in it
        insertElementAtBottom(s,element);
        s.push(top);
    }
    
}