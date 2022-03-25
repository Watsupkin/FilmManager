package repository;

import domain.FilmsPoster;
import domain.NotFoundException;

public class FilmsRepo {
    private FilmsPoster[] films = new FilmsPoster[0];

    public void add(FilmsPoster item) {
        int length = films.length + 1;
        FilmsPoster[] tmp = new FilmsPoster[length];
        System.arraycopy(films, 0, tmp, 0, films.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        films = tmp;
    }

    public FilmsPoster[] getAll() {
        return films;
    }

    public FilmsPoster findByFilmId(int id) {            //Мокито
        for (FilmsPoster film : films) {
            if (film.getFilmId() == id) {
                return film;
            }
        }
        return null;
    }

    public void removeByFilmId(int filmId) {
        if (findByFilmId(filmId) == null) {
            throw new NotFoundException(filmId);
        }
        int length = films.length - 1;
        FilmsPoster[] tmp = new FilmsPoster[length];
        int index = 0;
        for (FilmsPoster film : films) {
            if (film.getFilmId() != filmId) {
                tmp[index] = film;
                index++;
            }
        }
        films = tmp;
    }

    public void removeAll() {
        FilmsPoster[] tmp = new FilmsPoster[0];
        films = tmp;
    }

}
