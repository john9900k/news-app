package br.edu.ifce.newsapp;

import java.util.List;

import br.edu.ifce.newsapp.Models.NewsHeadlines;

public interface OnFetchDataListener<NewsApiResponse> {
    void onFetchData(List<NewsHeadlines> list, String message);
    void onError(String message);

}
