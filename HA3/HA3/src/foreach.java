public class foreach {
    public static void main(String args []) {
        int nums[]=  {1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        for (int x :nums) {
            System.out.println("value is : " + x);
            sum += x;
        }
        System.out.println("summation:"+sum);
    }

    public static class breakloop {
        public static void main(String args[]) {
            int i =0;

            while(i<100) {
                if (i == 10) break;
                System.out.println("i:" + i);
                i++;
            }
            System.out.println("Loop complete");
        }

    }
}
