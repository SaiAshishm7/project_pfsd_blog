public class throw3 {
    public static void main(String[] args) {
        String text = null;

        try{
            printmessage(text);
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
    public static void printmessage(String text){
        if(text == null){
            throw new NullPointerException("text is null");
        }
        System.out.println(text);
    }
}
