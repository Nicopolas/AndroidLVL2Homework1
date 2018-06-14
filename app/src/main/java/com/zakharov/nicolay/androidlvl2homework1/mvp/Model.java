package com.zakharov.nicolay.androidlvl2homework1.mvp;

import android.content.Context;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/**
 * Created by 1 on 14.06.2018.
 */

public class Model {
    private static Model sModel;
    private List<Integer> mList;
    private Map<Integer, Integer> mMap;

    private Model(){
        mMap = new HashMap<>();
        mList = new ArrayList<>(3);
        mList.add(0);
        mList.add(0);
        mList.add(0);
    }

    public void putButtonIdInModel(View view){
        mMap.put(view.getId(), 0);
    }

    public static Model get(){
        if (sModel == null) {
            sModel = new Model();
        }
        return sModel;
    }

    public int getElementValueAtIndex(int _index){
        return mMap.get(_index);
        /*return mList.get(_index);*/
    }

    public void setElementValueAtIndex(int _index, int value){
        if(!mMap.containsKey(_index)){
            Log.e("setElementValueAtIndex ","не найден эллемент в Model");
            return;
        }
        mMap.put(_index, value);
        /*mList.set(_index, value);*/
    }
}
