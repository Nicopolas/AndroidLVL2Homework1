package com.zakharov.nicolay.androidlvl2homework1.mvp;

/**
 * Created by 1 on 14.06.2018.
 */

public class Presenter {

    private Model mModel;
    private MainView view;

    public Presenter(MainView view) {
        this.mModel = Model.get();
        this.view = view;
    }

    private int calcNewModelValue(int modelElementIndex) {
        int currentValue = mModel.getElementValueAtIndex(modelElementIndex);
        return currentValue + 1;
    }

    public void buttonClick(int btnIndex) {
        int newModelValue;
        newModelValue = calcNewModelValue(btnIndex);
        mModel.setElementValueAtIndex(btnIndex, newModelValue);
        view.setButtonText(btnIndex, newModelValue);

/*        switch (btnIndex) {
            case R.id.btnCounter1:
                newModelValue = calcNewModelValue(0);
                mModel.setElementValueAtIndex(0, newModelValue);
                view.setButtonText(1,newModelValue);
                break;
            case R.id.btnCounter2:
                newModelValue = calcNewModelValue(1);
                mModel.setElementValueAtIndex(1, newModelValue);
                view.setButtonText(2,newModelValue);
                break;
            case R.id.btnCounter3:
                newModelValue = calcNewModelValue(2);
                mModel.setElementValueAtIndex(2, newModelValue);
                view.setButtonText(3,newModelValue);
                break;

        }*/
    }
}
