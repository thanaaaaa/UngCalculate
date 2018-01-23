package masterung.androidthai.in.th.ungcalculate.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import masterung.androidthai.in.th.ungcalculate.MainActivity;
import masterung.androidthai.in.th.ungcalculate.R;

/**
 * Created by masterung on 9/1/2018 AD.
 */

public class CalculateFragment extends Fragment implements View.OnClickListener {

    // Explicit
    private TextView textView;
    private Button buttonC, button1, button2, button3, button4,
            button5, button6, button7, button8, button9, button0,
            buttonDivide, buttonMultiply, buttonAdd, buttonMinus, buttonEqual;
    private String displayString = "";


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Create Toolbar
        createToolbar();

//        Initial View

        initialView();

//        One controler
        oneControler();

//         Two controler
        twoControler();

//         three controler

        threeControler();

//        four controler

        fourControler();

//        Number coltroler
        numberColtroler();


    }   // Main Method

    private void numberColtroler() {
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button0.setOnClickListener(this);

        buttonAdd.setOnClickListener(this);
        buttonMinus.setOnClickListener(this);
        buttonMultiply.setOnClickListener(this);
        buttonEqual.setOnClickListener(this);
        buttonDivide.setOnClickListener(this);
        buttonC.setOnClickListener(this);
    }

    private void fourControler() {
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showdisplay("4");
            }
        });
    }

    private void threeControler() {
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showdisplay("3");
            }
        });
    }

    private void twoControler() {
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showdisplay("2");

            }
        });
    }

    private void oneControler() {
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


//                show display
                showdisplay("1");

            }
        });
    }

    private void showdisplay(String strDisplay) {
        StringBuilder stringBuilder = new StringBuilder();
        displayString = displayString + stringBuilder.append("strDisplay").toString();
        textView.setText(displayString);
    }

    private void initialView() {
        textView = getView().findViewById(R.id.txtDisplay);
        buttonC = getView().findViewById(R.id.btnC);
        button1 = getView().findViewById(R.id.btn1);
        button2 = getView().findViewById(R.id.btn2);
        button3 = getView().findViewById(R.id.btn3);
        button4 = getView().findViewById(R.id.btn4);
        button5 = getView().findViewById(R.id.btn5);
        button6 = getView().findViewById(R.id.btn6);
        button7 = getView().findViewById(R.id.btn7);
        button8 = getView().findViewById(R.id.btn8);
        button9 = getView().findViewById(R.id.btn9);
        button0 = getView().findViewById(R.id.btn0);

        buttonAdd = getView().findViewById(R.id.btnAdd);
        buttonMinus = getView().findViewById(R.id.btnMinus);
        buttonDivide = getView().findViewById(R.id.btnMultiply);
        buttonEqual = getView().findViewById(R.id.btnDivide);
        buttonMultiply = getView().findViewById(R.id.btnEqual);


    }

    private void createToolbar() {

        Toolbar toolbar = getView().findViewById(R.id.toolbarCalculate);
        ((MainActivity) getActivity()).setSupportActionBar(toolbar);

        ((MainActivity) getActivity()).getSupportActionBar()
                .setTitle("Calculate");

        ((MainActivity) getActivity()).getSupportActionBar()
                .setHomeButtonEnabled(true);
        ((MainActivity) getActivity()).getSupportActionBar()
                .setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calculate, container, false);
        return view;
    }

    @Override
    public void onClick(View view) {


        switch (view.getId()) {
            case R.id.btn5:
                showdisplay("5");
                break;

            case R.id.btn6:
                showdisplay("6");
                break;

            case R.id.btn7:
                showdisplay("7");
                break;

            case R.id.btn8:
                showdisplay("8");
                break;

            case R.id.btn9:
                showdisplay("9");
                break;

            case R.id.btn0:
                showdisplay("0");
                break;




        }      //  switch


    }
}   // Main Class
