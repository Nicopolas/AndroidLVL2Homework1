package com.zakharov.nicolay.androidlvl2homework1.mvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.zakharov.nicolay.androidlvl2homework1.R;

public class mvpMainActivity extends AppCompatActivity implements MainView, View.OnClickListener {

    private Model mModel;
    private Button btnCounter1;
    private Button btnCounter2;
    private Button btnCounter3;
    private Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mModel = Model.get();
        btnCounter1 = (Button) findViewById(R.id.btnCounter1);
        btnCounter2 = (Button) findViewById(R.id.btnCounter2);
        btnCounter3 = (Button) findViewById(R.id.btnCounter3);
        Model.get().putButtonIdInModel(btnCounter1);
        Model.get().putButtonIdInModel(btnCounter2);
        Model.get().putButtonIdInModel(btnCounter3);
        btnCounter1.setOnClickListener(this);
        btnCounter2.setOnClickListener(this);
        btnCounter3.setOnClickListener(this);
        mPresenter = new Presenter(this);
    }

    @Override
    public void onClick(View view) {
        mPresenter.buttonClick(view.getId());
    }

    @Override
    public void setButtonText(int btnIndex, int value) {
        ((Button) findViewById(btnIndex)).setText(getString(R.string.part_button_text) + value);
/*        switch (btnIndex) {
            case 1:
                btnCounter1.setText(getString(R.string.part_button_text) + value);
                break;
            case 2:
                btnCounter2.setText(getString(R.string.part_button_text) + value);
                break;
            case 3:
                btnCounter3.setText(getString(R.string.part_button_text) + value);
                break;
        }*/
    }
}
