package ga.electrocaatin.nimbus.exception;

public class StorageFileNotFoundException extends StorageException {
    public StorageFileNotFoundException(String s) {
        super(s);
    }

    public StorageFileNotFoundException(String s, Throwable cause) {
        super(s, cause);
    }
}
