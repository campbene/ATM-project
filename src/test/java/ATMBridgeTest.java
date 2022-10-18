import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ATMBridgeTest {
    Scanner input = new Scanner(System.in);
    Atm atmTest = new Atm();

    @Test
    public void checksCorrectPin(){
        boolean defaultValue = atmTest.allowAccess("1234");
        assertEquals(true, defaultValue);
    }

//    @Test
//    public void checksIncorrectPin(){
//        boolean defaultValue = atmTest.allowAccess("1254");
//        assertEquals(true, defaultValue);
//    }

//    @Test
//    public void entersDeposit() {
//        double depositAmount = atmTest.deposit(510.62);
//        assertEquals(1510.62, balance);
//    }


}
