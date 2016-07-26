import java.util.ArrayList;

public class MinStack {


    public ArrayList<Integer> values ;
    public ArrayList <Integer>mins ;
    
    /** initialize your data structure here. */
    public MinStack() {
        values  = new ArrayList<Integer>();
        mins = new ArrayList<Integer>();
    }
    
    public void push(int x) {
        values.add(x);
        if(mins.size() == 0)
            mins.add(x);
        else if( (Integer) mins.get(mins.size() - 1)  < x)
            mins.add(mins.get(mins.size() - 1) );
        else
            mins.add(x);
        
            
    }
    
    public void pop() {
        values.remove(values.size() - 1);
        mins.remove(mins.size() - 1);
    }
    
    public int top() {
        return ((Integer) values.get(values.size() - 1)).intValue();
    }
    
    public int getMin() {
        return ((Integer) mins.get(mins.size() - 1)).intValue();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */