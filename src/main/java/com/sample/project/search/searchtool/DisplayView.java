package com.sample.project.search.searchtool;


import java.util.List;

public class DisplayView {
    List<SearchResultView> list;
    long elapsedTimeBook;
    long elapsedTimeAlbum;
    public DisplayView(List<SearchResultView> list, long elapsedTimeBook, long elapsedTimeAlbum){
        this.list = list;
        this.elapsedTimeBook = elapsedTimeBook;
        this.elapsedTimeAlbum = elapsedTimeAlbum;
    }

    public List<SearchResultView> getList() {
        return list;
    }

    public void setList(List<SearchResultView> list) {
        this.list = list;
    }

    public long getElapsedTimeBook() {
        return elapsedTimeBook;
    }

    public void setElapsedTimeBook(long elapsedTime) {
        this.elapsedTimeBook = elapsedTimeBook;
    }

    public long getElapsedTimeAlbum() {
        return elapsedTimeAlbum;
    }

    public void setElapsedTimeAlbum(long elapsedTimeAlbum) {
        this.elapsedTimeAlbum = elapsedTimeAlbum;
    }
}
