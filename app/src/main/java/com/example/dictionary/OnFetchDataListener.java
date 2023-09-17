package com.example.dictionary;

import com.example.dictionary.Models.APIResponse;

public interface OnFetchDataListener {
    void onfetchData(APIResponse apiResponse , String message);
    void onError(String message);

}
