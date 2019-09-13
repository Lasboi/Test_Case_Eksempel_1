public class Main {

    public static void main(String[] args) {
        Tandbørste patrickstandbørste = new Tandbørste();
        patrickstandbørste.start();
        if (patrickstandbørste.erStartet == true)
            System.out.println("PASS");
        else
            System.out.println("FAIL");
    }
}
