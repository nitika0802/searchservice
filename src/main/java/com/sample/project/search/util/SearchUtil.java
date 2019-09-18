package com.sample.project.search.util;

import com.sample.project.search.searchtool.SearchResultView;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

public class SearchUtil {

   public static JSONObject getResponse(String query, int maxFetchSize,String requestQuery) throws Exception{
       JSONObject searchResponse = null;
       query = URLEncoder.encode(query,"UTF-8");
        String url = String.format(requestQuery,query,maxFetchSize);
        //System.out.println("URL= " + url);
        URL obj = new URL(url);
        HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
        conn.setRequestMethod("GET");
        int responseCode = conn.getResponseCode();

        if(responseCode == 200) {
            BufferedReader in = new BufferedReader(new InputStreamReader((conn.getInputStream())));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            if (!response.equals(null)) {
                searchResponse = new JSONObject(response.toString());
            }
        }
        return searchResponse ;
    }

        public static ArrayList<SearchResultView> getBookListView(JSONObject obj){
        String title = ""; List<String> authorOrArtists = new ArrayList<String>(); String bookOrAlbum = "Book";
        ArrayList<SearchResultView> list = new ArrayList<SearchResultView>();
        if(obj!=null) {
            JSONArray items = obj.getJSONArray("items");
            for (int i = 0; i < items.length(); i++) {
                JSONObject item = items.getJSONObject(i);
                if(item!=null) {
                    if(item.has("volumeInfo"))
                    title = item.getJSONObject("volumeInfo").get("title").toString();
                    if(item.getJSONObject("volumeInfo").has("authors"))
                    authorOrArtists = jsonArrayToStringArray(item.getJSONObject("volumeInfo").getJSONArray("authors"));
                    SearchResultView resultView = new SearchResultView(title, authorOrArtists, bookOrAlbum);
                    list.add(resultView);
                }
            }
        }
        return list;
    }

        public static ArrayList<SearchResultView> getAlbumListView(JSONObject obj){
        String title = ""; List<String> authorOrArtists = new ArrayList<String>(); String bookOrAlbum = "Album";
            String artistName="";
            ArrayList<SearchResultView> list = new ArrayList<SearchResultView>();
        if(obj!=null) {
            JSONArray items = obj.getJSONArray("results");
            for (int i = 0; i < items.length(); i++) {
                authorOrArtists = new ArrayList<String>();
                JSONObject item = items.getJSONObject(i);
                if(item!=null) {
                    if(item.has("trackName"))
                    title = item.get("trackName").toString();
                    if(item.has("artistName"))
                    artistName = item.get("artistName").toString();
                    authorOrArtists.add(artistName);
                    SearchResultView resultView = new SearchResultView(title, authorOrArtists, bookOrAlbum);
                    list.add(resultView);
                }
            }
        }
        return list;
    }

    public static ArrayList<String> jsonArrayToStringArray(JSONArray jsArray) {
        ArrayList<String> strArray = new ArrayList<String>();

        for (int j = 0; j < jsArray.length(); j++) {
            try {
                strArray.add(jsArray.get(j).toString());

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return strArray;
    }
}
