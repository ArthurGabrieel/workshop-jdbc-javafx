package arthur.workshop.db;

public class DbIntegrityException extends RuntimeException{

    public DbIntegrityException(String message) {
        super(message);
    }
}
