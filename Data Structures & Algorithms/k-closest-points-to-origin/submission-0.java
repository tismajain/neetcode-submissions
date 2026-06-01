class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<double[]> pq=new PriorityQueue<>((a, b) -> Double.compare(b[0], a[0]));
        int[][] ans=new int[k][2];
        for(int[] p:points)
        {
            double d=(p[0]*p[0])+(p[1]*p[1]);
            pq.add(new double[]{d, p[0], p[1]});
            if(pq.size()>k)
            {
                pq.poll();
            }
        }
        int i=0;
        while(!pq.isEmpty())
        {
            double[] x=pq.poll();
            int x1=(int) x[1];
            int x2=(int) x[2];
            ans[i][0]=x1;
            ans[i][1]=x2;
            i++;
        }
        return ans;

    }
}
