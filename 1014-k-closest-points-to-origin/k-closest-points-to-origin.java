class Solution {
    public int[][] kClosest(int[][] points, int k) {
        HashMap<int[],Double> map=new HashMap<>();
        for(int i=0;i<points.length;i++)
        {
            double d=Math.pow(points[i][0],2)+Math.pow(points[i][1],2);
            double m=Math.sqrt(d);
            map.put(points[i],d);
        }
        List<Map.Entry<int[],Double>> list=new ArrayList<>();
        list.addAll(map.entrySet());
        Collections.sort(list,(a,b)->Double.compare(a.getValue(),b.getValue()));
        int[][] ans=new int[k][2];
        for(int i=0;i<k;i++)
        {
            Map.Entry<int[],Double> entry=list.get(i);
            ans[i]=entry.getKey();
        }

        return ans;
        
    }
}