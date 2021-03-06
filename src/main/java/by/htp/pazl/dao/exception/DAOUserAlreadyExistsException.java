package by.htp.pazl.dao.exception;

public class DAOUserAlreadyExistsException extends DAOException {
    public DAOUserAlreadyExistsException() {
        super();
    }

    public DAOUserAlreadyExistsException(String message) {
        super(message);
    }

    public DAOUserAlreadyExistsException(String message, Throwable cause) {
        super(message, (Exception) cause);
    }

    public DAOUserAlreadyExistsException(Throwable cause) {
        super(cause);
    }
}

