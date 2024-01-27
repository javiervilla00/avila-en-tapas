package com.javiervilla00.avilaEnTapas.features.tapas.presentation;

import com.javiervilla00.avilaEnTapas.features.tapas.data.*;
import com.javiervilla00.avilaEnTapas.features.tapas.domain.*;

import java.util.ArrayList;

public class MainTapa {

    public static void printTapas() {
        GetTapasUseCase tapasUseCase = new GetTapasUseCase(TapaDataRepository.newInstance());
        ArrayList<Tapa> tapas = tapasUseCase.execute();
        //imprimir cada una de las tapas
        System.out.println(tapas.toString());
    }

    public static void printTapa(String tapaId) {
        GetTapaUseCase getTapaUseCase = new GetTapaUseCase(TapaDataRepository.newInstance());
        Tapa tapa = getTapaUseCase.execute(tapaId);
        System.out.println(tapa.toString());
    }

    public static String newIdTapa() {
        GetTapasUseCase tapasUseCase = new GetTapasUseCase(TapaDataRepository.newInstance());
        ArrayList<Tapa> tapas = tapasUseCase.execute();
        return Integer.toString(tapas.size() + 1);
    }

    public static void deleteTapa(String tapaId) {
        DeleteTapaUseCase deleteTapaUseCase = new DeleteTapaUseCase(TapaDataRepository.newInstance());
        deleteTapaUseCase.execute(tapaId);
    }

    public static void createTapa(Tapa tapa) {
        TapaDataRepository tapaDataRepository = TapaDataRepository.newInstance();
        SaveTapaUseCase saveTapaUseCase = new SaveTapaUseCase(tapaDataRepository);
        saveTapaUseCase.execute(tapa);
    }

    public static void updateTapa(Tapa tapa) {
        UpdateTapaUseCase updateTapaUseCase = new UpdateTapaUseCase(TapaDataRepository.newInstance());
        updateTapaUseCase.execute(tapa);

        System.out.println(" ");
    }

    public static void voteTapa(String tapaId, double votePuntuacion) {
        VoteTapaUseCase voteTapaUseCase = new VoteTapaUseCase(TapaDataRepository.newInstance());
        voteTapaUseCase.execute(tapaId, votePuntuacion);
    }

    public static String obtainNameTapa(String tapaId) {
        GetTapaUseCase getTapaUseCase = new GetTapaUseCase(TapaDataRepository.newInstance());
        Tapa tapa = getTapaUseCase.execute(tapaId);
        return tapa.getName();
    }
}
