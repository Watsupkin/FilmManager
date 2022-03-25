package manager;

import domain.FilmsPoster;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmManagerTest {
    FilmManager fm = new FilmManager();
    FilmsPoster first = new FilmsPoster(11, "BloodShot");
    FilmsPoster second = new FilmsPoster(22, "Vpered");
    FilmsPoster third = new FilmsPoster(33, "HotelBelgrad");
    FilmsPoster fourth = new FilmsPoster(44, "Gentlemens");
    FilmsPoster fifth = new FilmsPoster(55, "InvisibleMen");
    FilmsPoster sixth = new FilmsPoster(66, "Trolls");
    FilmsPoster seventh = new FilmsPoster(77, "NumberOne");
    FilmsPoster eighth = new FilmsPoster(88, "Spider-man");
    FilmsPoster ninth = new FilmsPoster(99, "Batman");
    FilmsPoster tenth = new FilmsPoster(101, "Superman");
    FilmsPoster eleventh = new FilmsPoster(111, "Cat-women");
    FilmsPoster twelfth = new FilmsPoster(112, "Joker");

    @Test
    void shouldSave() {
        fm.save(first);
        fm.save(second);
        fm.save(third);

        fm.save(fourth);

        FilmsPoster[] expected = {first, second, third, fourth};
        FilmsPoster[] actual = fm.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindAll() {
        fm.save(first);
        fm.save(second);
        fm.save(third);
        fm.save(fourth);
        fm.save(fifth);
        fm.save(sixth);
        fm.save(seventh);

        fm.findAll();

        FilmsPoster[] expected = {first, second, third, fourth, fifth, sixth, seventh};
        FilmsPoster[] actual = fm.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveById() {
        fm.save(first);
        fm.save(second);
        fm.save(third);
        fm.save(fourth);
        fm.save(fifth);
        fm.save(sixth);
        fm.save(seventh);

        fm.removeById(11);

        FilmsPoster[] expected = {second, third, fourth, fifth, sixth, seventh};
        FilmsPoster[] actual = fm.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveAll() {
        fm.save(first);
        fm.save(second);
        fm.save(third);
        fm.save(fourth);
        fm.save(fifth);
        fm.save(sixth);
        fm.save(seventh);

        fm.removeAll();

        FilmsPoster[] expected = {};
        FilmsPoster[] actual = fm.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindById() {
        fm.save(first);
        fm.save(second);
        fm.save(third);
        fm.save(fourth);
        fm.save(fifth);
        fm.save(sixth);
        fm.save(seventh);

        FilmsPoster expected = third;
        FilmsPoster actual = fm.findById(33);
        assertEquals(expected, actual);
    }
}