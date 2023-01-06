package All;

import All.Model.Input;
import java.util.Scanner;
public class ScannerInput implements Input {

    private Scanner scan = new Scanner(System.in);

    @Override
    public String read(String message) {
        System.out.print(message);
        return scan.nextLine();
    }

    @Override
    public Controller addJour() {
        return null;
    }

    @Override
    public Controller getJour() {
        return null;
    }


}
