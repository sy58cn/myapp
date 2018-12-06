package com.myapp.myapp.present;
import com.library.library.present.BaseContract;

import java.util.HashMap;

public interface MainContract{
    interface View extends BaseContract.View<Present>{
        void showData(Object data);
    }

    interface Present extends BaseContract.Present{
        void changeData(Object data);
    }
}
