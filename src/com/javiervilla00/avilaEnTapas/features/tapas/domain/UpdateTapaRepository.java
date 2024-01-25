package com.javiervilla00.avilaEnTapas.features.tapas.domain;

public class UpdateTapaRepository {

    private TapaRepository tapaRepository;

    public UpdateTapaRepository(TapaRepository tapaRepository){
        this.tapaRepository = tapaRepository;
    }

    public void execute(Tapa tapa){
        this.tapaRepository.updateTapa(tapa);
    }

}
