package com.javiervilla00.avilaEnTapas.features.tapas.domain;

public class SaveTapaUseCase {

    private TapaRepository tapaRepository;

    public SaveTapaUseCase(TapaRepository tapaRepository){
        this.tapaRepository = tapaRepository;
    }

    public void execute(Tapa tapa){
        this.tapaRepository.saveTapa(tapa);
    }
}
