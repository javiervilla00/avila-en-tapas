package com.javiervilla00.avilaEnTapas.features.tapas.domain;

public class UpdateTapaUseCase {

    private TapaRepository tapaRepository;

    public UpdateTapaUseCase(TapaRepository tapaRepository) {
        this.tapaRepository = tapaRepository;
    }

    public void execute(Tapa tapa) {
        this.tapaRepository.updateTapa(tapa);
    }

}
