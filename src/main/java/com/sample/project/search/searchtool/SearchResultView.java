package com.sample.project.search.searchtool;

import com.fasterxml.jackson.databind.*;

import java.util.List;

public class SearchResultView {
    String title;
    List<String> authorOrArtists;
    String bookOrAlbum;

    public SearchResultView(String title, List<String> authorOrArtists, String bookOrAlbum){
        this.title = title;
        this.authorOrArtists = authorOrArtists;
        this.bookOrAlbum = bookOrAlbum;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getAuthorOrArtists() {
        return authorOrArtists;
    }

    public void setAuthorOrArtists(List<String> authorOrArtists) {
        this.authorOrArtists = authorOrArtists;
    }

    public String getBookOrAlbum() {
        return bookOrAlbum;
    }

    public void setBookOrAlbum(String bookOrAlbum) {
        this.bookOrAlbum = bookOrAlbum;
    }
}

