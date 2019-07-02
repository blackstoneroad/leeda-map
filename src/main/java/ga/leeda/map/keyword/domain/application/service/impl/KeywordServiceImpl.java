package ga.leeda.map.keyword.domain.application.service.impl;

import ga.leeda.map.keyword.domain.Keyword;
import ga.leeda.map.keyword.domain.KeywordRepository;
import ga.leeda.map.keyword.domain.application.service.KeywordService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KeywordServiceImpl implements KeywordService {

    private final KeywordRepository repository;

    public KeywordServiceImpl(final KeywordRepository repository) {
        this.repository = repository;
    }


    @Override
    public List<Keyword> getTopRankKeywordList(int resultCount) {
        return repository.findTopRankKeyword(resultCount);
    }
}
