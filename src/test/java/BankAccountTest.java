import com.example.bank.BankAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankAccountTest {


    @Test
    void testInitialBalance() {
        BankAccount account = new BankAccount(100);
        Assertions.assertEquals(100, account.getBalance());
    }

    // TODO: autres tests à ajouter
}
