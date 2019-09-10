package com.eduardo.mvpsample;

public class OperacionModel implements Contrato.Model{

    private Contrato.Presenter presenter;
    private double resultado;

    public OperacionModel(Contrato.Presenter presenter){
        this.presenter = presenter;
    }

    @Override
    public void alCuadradoModel(String data) {
        resultado = Math.pow(Double.parseDouble(data),2);
        presenter.showResultPresenter(String.valueOf(resultado));
    }
}
