package com.eduardo.mvpsample;

public class OperacionPresenter implements Contrato.Presenter {

    //1. El presenter es intermediaro entre el modelo y la vista
    private Contrato.View view;
    private Contrato.Model model;

    //2. Constructor
    public OperacionPresenter(Contrato.View view){
        this.view = view;
        model = new OperacionModel(this); //Inicialmente marca error si aun no tiene constructor nada en el model
    }

    @Override
    public void showResultPresenter(String result) {
        if (view != null) {
            view.showResult(result);
        }
    }

    @Override
    public void alCuadradoPresenter(String data) {
        if (view != null) {
            model.alCuadradoModel(data);
        }
    }
}
