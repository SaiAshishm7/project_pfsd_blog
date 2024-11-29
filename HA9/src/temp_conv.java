public class temp_conv {
    public double celtofar(double celsius) throws IllegalArgumentException{
        if(celsius < -273.5 ){
            throw new IllegalArgumentException("temperature less than -273.5");
        }
        return (celsius * 9/5) + 32;
    }
    public static void main(String[] args) {
        temp_conv temp = new temp_conv();
        try{
            double celsius = temp.celtofar(-293 );
            System.out.println(celsius);
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
