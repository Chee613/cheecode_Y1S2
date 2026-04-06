public class T1Q1 {
    public static void main(String[] args) {
        // Instantiate 5 Telephone objects and store them in an array
        Telephone[] phones = new Telephone[5];
        
        for (int i = 0; i < 5; i++) {
            phones[i] = new Telephone("03", "7967630" + i);
        }

        // Iterate through the array to print the full number
        for (Telephone phone : phones) {
            System.out.println(phone.makeFullNumber());
        }
    }
}
