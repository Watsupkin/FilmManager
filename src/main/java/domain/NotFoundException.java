package domain;

public class NotFoundException extends RuntimeException{

    public NotFoundException(int filmId) {

        super("Film with this Id: " + filmId + " doesn't exist.");
    }
}
