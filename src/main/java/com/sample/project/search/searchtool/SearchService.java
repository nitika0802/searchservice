package com.sample.project.search.searchtool;

import java.util.*;
public interface SearchService {
    List<SearchResultView> findSearchResultView(String searchTerm);
}
