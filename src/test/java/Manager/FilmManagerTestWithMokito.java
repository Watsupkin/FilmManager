package Manager;

import domain.FilmsPoster;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import repository.FilmsRepo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class FilmManagerTestWithMokito {
    @Mock
    private FilmsRepo repo = Mockito.mock(FilmsRepo.class);
    @InjectMocks
    private FilmManager fm = new FilmManager(repo);
    private FilmsPoster first = new FilmsPoster(11, "BloodShot");
    private FilmsPoster second = new FilmsPoster(22, "Vpered");
    private FilmsPoster third = new FilmsPoster(33, "HotelBelgrad");

    @Test
    void shouldSave() {
        FilmsPoster[] returned = {first,second,third};
        doReturn(returned).when(repo).getAll();

        fm.save(third);

        FilmsPoster[] expected = {first,second,third};
        FilmsPoster[] actual = fm.findAll();
        assertArrayEquals(expected,actual);

        verify(repo).add(third);
    }

    @Test
    void shouldFindAll() {
        FilmsPoster[] returned = {first,second,third};
        doReturn(returned).when(repo).getAll();

        FilmsPoster[] expected = {first,second,third};
        FilmsPoster[] actual = fm.findAll();
        assertArrayEquals(expected,actual);

        verify(repo).getAll();
    }
}