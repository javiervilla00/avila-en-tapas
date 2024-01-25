package com.javiervilla00.avilaEnTapas.features.tapas.domain;

import java.util.ArrayList;

public class GetTapasUseCase {
    private TapaRepository tapaRepository;

    public GetTapasUseCase(TapaRepository tapaRepository){
        this.tapaRepository = tapaRepository;
    }

    public ArrayList<Tapa> execute(){
        return tapaRepository.obtainTapas();
    }
}
