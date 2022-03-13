public class FilmManager {


    private FilmsPoster[] films = new FilmsPoster[0];

    public void add(FilmsPoster film) {
        int length = films.length + 1;
        FilmsPoster[] tmp = new FilmsPoster[length];
        System.arraycopy(films, 0, tmp, 0, films.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }

    public FilmsPoster[] findAll() { return films;}

    public FilmsPoster[] showLastTen() {

        int resultLength;
        if (films.length < 10) {
            resultLength = films.length;
        } else {
            resultLength = 10;
        }

        FilmsPoster[] result = new FilmsPoster[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = films.length - i -1;
            result[i] = films[index];
        }
        return result;
    }


}
