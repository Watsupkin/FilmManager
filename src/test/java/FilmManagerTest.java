import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmManagerTest {

    @Test
    void shouldAdd() {
        FilmsPoster first = new FilmsPoster(11, "BloodShot");
        FilmsPoster second = new FilmsPoster(22, "Vpered");
        FilmsPoster third = new FilmsPoster(33, "HotelBelgrad");
        FilmsPoster fourth = new FilmsPoster(44, "Gentlemens");
        FilmsPoster fifth = new FilmsPoster(55, "InvisibleMen");
        FilmsPoster sixth = new FilmsPoster(66, "Trolls");
        FilmsPoster seventh = new FilmsPoster(77, "NumberOne");

        FilmManager fm = new FilmManager();
        fm.add(first);
        fm.add(second);
        fm.add(third);
        fm.add(fourth);
        fm.add(fifth);
        fm.add(sixth);

        fm.add(seventh);

        FilmsPoster[] expected = {first,second,third,fourth,fifth,sixth,seventh};
        FilmsPoster[] actual = fm.findAll();
        assertArrayEquals(expected, actual);

    }

    @Test
    void shouldShowLastTenIfLengthLessThenTen() {
        FilmsPoster first = new FilmsPoster(11, "BloodShot");
        FilmsPoster second = new FilmsPoster(22, "Vpered");
        FilmsPoster third = new FilmsPoster(33, "HotelBelgrad");
        FilmsPoster fourth = new FilmsPoster(44, "Gentlemens");
        FilmsPoster fifth = new FilmsPoster(55, "InvisibleMen");
        FilmsPoster sixth = new FilmsPoster(66, "Trolls");
        FilmsPoster seventh = new FilmsPoster(77, "NumberOne");

        FilmManager fm = new FilmManager();
        fm.add(first);
        fm.add(second);
        fm.add(third);
        fm.add(fourth);
        fm.add(fifth);
        fm.add(sixth);
        fm.add(seventh);

        fm.showLastTen();

        FilmsPoster[] expected = {seventh,sixth,fifth,fourth,third,second,first};
        FilmsPoster[] actual = fm.showLastTen();
        assertArrayEquals(expected, actual);

    }

    @Test
    void shouldShowLastTenIfLengthIsTen() {
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

        FilmManager fm = new FilmManager();
        fm.add(first);
        fm.add(second);
        fm.add(third);
        fm.add(fourth);
        fm.add(fifth);
        fm.add(sixth);
        fm.add(seventh);
        fm.add(eighth);
        fm.add(ninth);
        fm.add(tenth);

        fm.showLastTen();

        FilmsPoster[] expected = {tenth,ninth,eighth,seventh,sixth,fifth,fourth,third,second,first};
        FilmsPoster[] actual = fm.showLastTen();
        assertArrayEquals(expected, actual);

    }

    @Test
    void shouldShowLastTenIfLengthOverTen() {
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

        FilmManager fm = new FilmManager();
        fm.add(first);
        fm.add(second);
        fm.add(third);
        fm.add(fourth);
        fm.add(fifth);
        fm.add(sixth);
        fm.add(seventh);
        fm.add(eighth);
        fm.add(ninth);
        fm.add(tenth);
        fm.add(eleventh);

        fm.showLastTen();

        FilmsPoster[] expected = {eleventh,tenth,ninth,eighth,seventh,sixth,fifth,fourth,third,second};
        FilmsPoster[] actual = fm.showLastTen();
        assertArrayEquals(expected, actual);

    }
}
