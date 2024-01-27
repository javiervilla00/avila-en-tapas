package com.javiervilla00.avilaEnTapas.features.tapas.domain;

import java.util.*;

public interface TapaRepository {
    ArrayList<Tapa> obtainTapas();

    Tapa obtainTapa(String tapaId);

    void deleteTapa(String TapaId);

    void saveTapa(Tapa tapa);

    void updateTapa(Tapa tapa);

    void voteTapa(String tapa, double votePuntuacion);

}
