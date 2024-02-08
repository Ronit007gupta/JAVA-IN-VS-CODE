public class ReverseYourName {
    public static void main(String[] args) {
        // Reverse Your Name Using String Builder...



        StringBuilder name = new StringBuilder("Tourner dans la Vide");

        for(int u = 0; u<name.length()/2;u++){
            int front = u;
            int back = name.length()-1-u;

            //char is used for single character
            
            char frontchrctr = name.charAt(front);
             char backchrctr = name.charAt(back);

             name.setCharAt(front, backchrctr);
             name.setCharAt(back, frontchrctr);

        }
        System.out.println(name);
        




    }
}
