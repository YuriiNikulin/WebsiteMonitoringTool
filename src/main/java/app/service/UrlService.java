package app.service;

import app.model.Url;

import java.util.List;

/**
 * Created by yurii on 10.09.17.
 */
public interface UrlService {

    Url addUrl(Url url);

    Url dellUrl(int id);

    List<Url> getAllUrl();

}
