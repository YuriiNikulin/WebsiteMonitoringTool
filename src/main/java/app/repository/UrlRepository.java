package app.repository;

import app.model.Url;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by yurii on 10.09.17.
 */
public interface UrlRepository extends CrudRepository<Url, Integer> {

    Url findUrlById(int id);

}
