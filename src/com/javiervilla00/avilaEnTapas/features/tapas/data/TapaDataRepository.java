package com.javiervilla00.avilaEnTapas.features.tapas.data;

import com.javiervilla00.avilaEnTapas.features.tapas.domain.Tapa;
import com.javiervilla00.avilaEnTapas.features.tapas.domain.TapaRepository;

import java.util.ArrayList;
import java.util.Iterator;

public class TapaDataRepository implements TapaRepository {
    private static TapaDataRepository instance = null;
    private ArrayList<Tapa> localTapas = new ArrayList<>();
    private TapaDataRepository(){
        initData();
    }



    private void initData() {
        localTapas.add(new Tapa("1", "Albóndiga de faisán en escabeche con caldo clarificado de gambón salvaje", "Vermutería el Atrio", "0 Ptos", "0.0", "28", "0", "faisán, gambón salvaje"));
        localTapas.add(new Tapa("2","Albóndiga de venado y arándanos en salsa de cerveza Terra Levis, Sierra de Ávila, almendras tostadas y fideos fritos", "Bar restaurante Soul Kitchen","0 Ptos", "0.0", "28", "0", "venado, arándanos, cerveza, almendras, fideos"));

    }

    public static TapaDataRepository newInstance(){
        if (instance == null){
            instance = new TapaDataRepository();
        }
        return instance;
    }

    @Override
    public ArrayList<Tapa> obtainTapas() {
        return localTapas;
    }

    @Override
    public Tapa obtainTapa(String tapaId) {
        for (Tapa tapa : localTapas){
            if (tapa.getId().equals(tapaId)){
                return tapa;
            }
        }
        return null;
    }

    @Override
    public void deleteTapa(String tapaId) {
        for (int i=0; i<localTapas.size(); i++){
            if (localTapas.get(i).getId().equals(tapaId)){
                localTapas.remove(i);
            }
        }
    }

    @Override
    public void saveTapa(Tapa tapa) {
        localTapas.add(tapa);
    }

    @Override
    public void updateTapa(Tapa tapa) {
        deleteTapa(tapa.getId());
        saveTapa(tapa);
    }
}
