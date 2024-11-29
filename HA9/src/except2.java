public class except2 {
    public static void main(String[] args) {
        int i=4;
        int j=0;

        int nums[] = new int[5];
        try{
            j=18/i;
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        catch(ArithmeticException e){
            System.out.println("cannot divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("stay in your limit");
        }
        catch (Exception e) {
            System.out.println("something wrong");
        }
        System.out.println(j);
    }
}
