package com.javiervilla00.avilaEnTapas.features.tapas.domain;

public class Tapa {
    private String id;
    private String name;
    private String establishment;
    private String totalPoints;
    private String averageVotes;
    private String participantsNumber;
    private String totalVotes;
    private String ingredients;

    public Tapa(String id, String name, String establishment, String totalPoints, String averageVotes, String participantsNumber, String totalVotes, String ingredients){
        this.id = id;
        this.name = name;
        this.establishment = establishment;
        this.totalPoints = totalPoints;
        this.averageVotes = averageVotes;
        this.participantsNumber = participantsNumber;
        this.totalVotes = totalVotes;
        this.ingredients = ingredients;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEstablishment() {
        return establishment;
    }

    public void setEstablishment(String establishment) {
        this.establishment = establishment;
    }

    public String getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(String totalPoints) {
        this.totalPoints = totalPoints;
    }

    public String getAverageVotes() {
        return averageVotes;
    }

    public void setAverageVotes(String averageVotes) {
        this.averageVotes = averageVotes;
    }

    public String getParticipantsNumber() {
        return participantsNumber;
    }

    public void setParticipantsNumber(String participantsNumber) {
        this.participantsNumber = participantsNumber;
    }

    public String getTotalVotes() {
        return totalVotes;
    }

    public void setTotalVotes(String totalVotes) {
        this.totalVotes = totalVotes;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }
}
