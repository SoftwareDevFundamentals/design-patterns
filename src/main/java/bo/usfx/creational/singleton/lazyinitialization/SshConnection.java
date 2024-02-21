package bo.usfx.creational.singleton.lazyinitialization;

public final class SshConnection {

    private static SshConnection instance;

    private SshConnection() {
        // TODO: SSH connection.
    }

    public static synchronized SshConnection getInstance() {
        if (instance == null) {
            instance = new SshConnection();
        }
        return instance;
    }
}
