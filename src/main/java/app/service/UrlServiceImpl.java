package app.service;

import app.model.Url;
import app.repository.UrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yurii on 10.09.17.
 */

@Service
public class UrlServiceImpl implements UrlService {

    @Autowired
    private UrlRepository urlRepository;

    @Override
    public Url addUrl(Url url) {
        return urlRepository.save(url);
    }

    @Override
    public Url dellUrl(int id) {
        Url url = urlRepository.findUrlById(id);
        urlRepository.delete(id);
        return url;
    }

    @Override
    public List<Url> getAllUrl() {
        List<Url> urlList = null;

        for (Url url : urlRepository.findAll()) {
            urlList.add(url);
        }

        return urlList;
    }
}
