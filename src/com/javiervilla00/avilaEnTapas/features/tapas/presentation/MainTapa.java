package com.javiervilla00.avilaEnTapas.features.tapas.presentation;

import com.javiervilla00.avilaEnTapas.features.tapas.data.*;
import com.javiervilla00.avilaEnTapas.features.tapas.domain.*;

import java.util.ArrayList;

public class MainTapa {

    /**
     * Mostrar un listado de tapas
     */

    public static void printTapas(){
        GetTapasUseCase tapasUseCase = new GetTapasUseCase(TapaDataRepository.newInstance());
        ArrayList<Tapa> tapas = tapasUseCase.execute();
        //imprimir cada una de las tapas
        System.out.println(tapas.toString());
    }

    public static void printTapa(String tapaId){
        GetTapaUseCase getTapaUseCase = new GetTapaUseCase(TapaDataRepository.newInstance());
        Tapa tapa = getTapaUseCase.execute(tapaId);
        System.out.println(tapa.toString());
    }

    public static void deleteTapa(String tapaId){
        DeleteTapaUseCase deleteTapaUseCase = new DeleteTapaUseCase(TapaDataRepository.newInstance());
        deleteTapaUseCase.execute(tapaId);
    }

    public static void createTapa(Tapa tapa){
        TapaDataRepository tapaDataRepository = TapaDataRepository.newInstance();
        SaveTapaUseCase saveTapaUseCase = new SaveTapaUseCase(tapaDataRepository);
        saveTapaUseCase.execute(tapa);
    }

    public static void updateTapa(Tapa tapa){
        UpdateTapaRepository updateTapaRepository = new UpdateTapaRepository(TapaDataRepository.newInstance());
        updateTapaRepository.execute(tapa);

        System.out.println(" ");
    }
}
