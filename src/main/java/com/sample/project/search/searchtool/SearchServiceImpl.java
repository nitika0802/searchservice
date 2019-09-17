package com.sample.project.search.searchtool;

import com.google.gson.Gson;
import com.sample.project.search.configuration.ReadProperties;
import com.sample.project.search.util.SearchUtil;

import java.util.ArrayList;
import java.util.List;

public class SearchServiceImpl {

    public static String getDisplayViewJson(String searchTerm){
        String displayViewJson = null;
        try{
            displayViewJson = new Gson().toJson(getDisplayView(searchTerm)).toString();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return displayViewJson;
    }

    public static DisplayView getDisplayView(String searchTerm) throws Exception{
        List<String> properties = new ReadProperties().getProperties();
        int maxFetchSize = Integer.parseInt(properties.get(0));
        List<SearchResultView> searchResultViewList = new ArrayList<>();
        long bookStartTime = System.currentTimeMillis();
        searchResultViewList.addAll(SearchUtil.getBookListView(SearchUtil.getResponse(searchTerm, maxFetchSize, properties.get(1))));
        long elapsedTimeBook = System.currentTimeMillis() - bookStartTime;
        long albumStartTime = System.currentTimeMillis();
        searchResultViewList.addAll(SearchUtil.getAlbumListView(SearchUtil.getResponse(searchTerm, maxFetchSize, properties.get(2))));
        long elapsedTimeAlbum = System.currentTimeMillis() - albumStartTime;
        DisplayView displayView = new DisplayView(searchResultViewList,elapsedTimeBook,elapsedTimeAlbum);
        return displayView;
    }
}
