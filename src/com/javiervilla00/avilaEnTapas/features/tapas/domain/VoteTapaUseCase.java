package com.javiervilla00.avilaEnTapas.features.tapas.domain;

public class VoteTapaUseCase {
    private TapaRepository tapaRepository;

    public VoteTapaUseCase(TapaRepository tapaRepository) {
        this.tapaRepository = tapaRepository;
    }

    public void execute(String tapaId, double votePuntuacion) {
        tapaRepository.voteTapa(tapaId, votePuntuacion);
    }
}
