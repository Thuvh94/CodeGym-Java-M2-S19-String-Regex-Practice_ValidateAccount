public class AccountExampleTest {
    static String[] validAccount = {"123abc_","_abc123","______","123456","abcdefg"};
    static String[] invalidAccount = {".@","12345","1234_","abcde"};

    public static void main(String[] args) {
        AccountExample accountExample = new AccountExample();
        for (int i = 0; i < validAccount.length; i++) {
            boolean isValid = accountExample.validate(validAccount[i]);
            System.out.println(validAccount[i] + " : " + isValid);
        }
        for (int i = 0; i < invalidAccount.length; i++) {
            boolean isValid = accountExample.validate(invalidAccount[i]);
            System.out.println(invalidAccount[i] +" : "+ isValid);
        }

    }
}
