package manager;

import domain.FilmsPoster;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import repository.FilmsRepo;

@NoArgsConstructor
public class FilmManager {
    private FilmsRepo repository = new FilmsRepo();

    public FilmManager(FilmsRepo repository) {
        this.repository = repository;
    }

    public void save(FilmsPoster film) {
        repository.add(film);
    }

    public FilmsPoster[] findLastTen() {
        FilmsPoster[] films = repository.getAll();
        FilmsPoster[] result = new FilmsPoster[films.length];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }

    public FilmsPoster[] findAll() {

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


}
