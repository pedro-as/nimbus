package ga.electrocaatin.nimbus.exception;

public class StorageException extends RuntimeException {
    public StorageException(String s) {
        super(s);
    }

    public StorageException(String s, Throwable cause) {
        super(s, cause);
    }
}
