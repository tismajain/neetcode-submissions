class Solution {
    
    public int carFleet(int target, int[] position, int[] speed) {
        int count=0;
        
        int n = position.length;

        int[][] cars = new int[n][2];

        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        // sort by position descending
        Arrays.sort(cars, (a, b) -> b[0] - a[0]);
        Deque<Double> st=new ArrayDeque<>();
        for(int i=0;i<position.length;i++)
        {
            double time =
                (double)(target - cars[i][0]) / cars[i][1];
            if(st.isEmpty() || time>st.peek())
            {
                st.push(time);
            }
            
            
        }
        return st.size();
    }
}
