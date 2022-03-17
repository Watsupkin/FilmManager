package Manager;

import domain.FilmsPoster;
import repository.FilmsRepo;


public class FilmManager {
    private FilmsRepo repository = new FilmsRepo();

    public FilmManager(FilmsRepo repository) {
        this.repository = repository;
    }


    public void save(FilmsPoster film) {
        repository.add(film);
    }

    public FilmsPoster[] findAll() {
       /* FilmsPoster[] films = repository.getAll();
        FilmsPoster[] result = new FilmsPoster[films.length];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;*/
        return repository.getAll();
    }

    public void removeById(int filmId) {
        repository.removeByFilmId(filmId);
    }

    public void removeAll() {
        repository.removeAll();
    }

    public FilmsPoster findById(int filmId) {
        FilmsPoster result = repository.findByFilmId(filmId);
        return result;
    }

    public FilmManager() {
    }


}
