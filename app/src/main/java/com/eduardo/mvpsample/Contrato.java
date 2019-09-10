package com.eduardo.mvpsample;

public interface Contrato {

    interface View{
        void showResult(String result);
    }

    interface Presenter{
        void showResultPresenter(String result);
        void alCuadradoPresenter(String data);
    }

    interface Model{
        void alCuadradoModel(String data);
    }
}
