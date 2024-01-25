package com.javiervilla00.avilaEnTapas.features.tapas.domain;

import java.util.ArrayList;

public class GetTapaUseCase {
    private TapaRepository tapaRepository;
    public GetTapaUseCase(TapaRepository tapaRepository){
        this.tapaRepository=tapaRepository;
    }
   public ArrayList<Tapa> execute(){
        return tapaRepository.obtainsTapa();
   }
}
