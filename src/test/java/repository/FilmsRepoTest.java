package repository;

import domain.FilmsPoster;
import domain.NotFoundException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmsRepoTest {


    FilmsRepo repo = new FilmsRepo();
    FilmsPoster first = new FilmsPoster(11, "BloodShot");
    FilmsPoster second = new FilmsPoster(22, "Vpered");
    FilmsPoster third = new FilmsPoster(33, "HotelBelgrad");

    @Test
    void shouldRemoveByFilmId() {
        repo.add(first);
        repo.add(second);
        repo.add(third);

        repo.removeByFilmId(11);

        FilmsPoster[] expected = {second,third};
        FilmsPoster[] actual = repo.getAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldException() {
        repo.add(first);
        repo.add(second);
        repo.add(third);

        assertThrows(NotFoundException.class, () -> {
            repo.removeByFilmId(500);
        });
    }
}