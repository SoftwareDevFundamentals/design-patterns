package bo.usfx.creational.singleton.lazyinitialization;

public class TestProgram {

    public static void main(String[] args) {
        SshConnection obj1 = SshConnection.getInstance();

        SshConnection obj2 = SshConnection.getInstance();
    }
}
