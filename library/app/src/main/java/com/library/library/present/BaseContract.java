package com.library.library.present;


import java.util.HashMap;

/**
 * Created by Carl on 2017/12/5.
 * 
 */

public interface BaseContract {
    interface View<T extends Present> {
        void requestNet();

        void refreshData(Object data);

        void showErrorMessage(String message);

        void setLoadIndicator(boolean active);

        void setPresenter(T presenter);
    }

    interface Present {
        void subscibe();

        void unSubscibe();

        void refreshData();

        void requestNet(HashMap<String, String> paramsMap, HashMap<String, String> headerMap);
    }
}
