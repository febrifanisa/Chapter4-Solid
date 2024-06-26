package single_responsibilitiy;
import single_responsibilitiy.Author;
public interface AuthorRepo {
    boolean checkAuthorId(int authorId);
    void save(Author author);
}
