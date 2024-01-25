package com.javiervilla00.avilaEnTapas.features.tapas.data;

import com.javiervilla00.avilaEnTapas.features.tapas.domain.Tapa;
import com.javiervilla00.avilaEnTapas.features.tapas.domain.TapaRepository;

import java.util.ArrayList;

public class TapaDataRepository implements TapaRepository {
    private static TapaDataRepository instance = null;
    private ArrayList<Tapa> localTapa = new ArrayList<>();
    private TapaDataRepository(){
        initData();
    }

    private void initData() {
        localTapa.add(new Tapa("1", "Albóndiga de faisán en escabeche con caldo clarificado de gambón salvaje", "Vermutería el Atrio", "0 Ptos", "0.0", "28", "0", "faisán, gambón salvaje"));
        localTapa.add(new Tapa("2","Albóndiga de venado y arándanos en salsa de cerveza Terra Levis, Sierra de Ávila, almendras tostadas y fideos fritos", "Bar restaurante Soul Kitchen","0 Ptos", "0.0", "28", "0", "venado, arándanos, cerveza, almendras, fideos"));

    }

    public static TapaDataRepository newInstance(){
        if (instance == null){
            instance = new TapaDataRepository();
        }
        return instance;
    }

}
