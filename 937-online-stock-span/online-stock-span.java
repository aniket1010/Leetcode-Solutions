class StockSpanner {

    Stack<Pair> st ;
    int index;

    public StockSpanner() {
        st= new Stack<>();
        index=-1;
    }
    
    public int next(int price) {
        index++;
        int ans =0;
        while(!st.isEmpty() && st.peek().value<=price){
            st.pop();
        }
        if(st.isEmpty())ans = index+1;
        else ans = index-st.peek().index;

        st.push(new Pair(index,price));

        return ans;

    }
    class Pair{
        int index;
        int value;

        Pair(int i , int v){
            index=i;
            value=v;
        }
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */