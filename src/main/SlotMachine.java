package main;

import java.util.Objects;

public class SlotMachine {
    private int idToy;
    private String nameToy;
    private int quantityToy;
    private String shareToysInGame;

    public SlotMachine(int idToy, String nameToy, int quantityToy, String shareToysInGame) {
        this.idToy = idToy;
        this.nameToy = nameToy;
        this.quantityToy = quantityToy;
        this.shareToysInGame = shareToysInGame;
    }

    public int getIdToy() {
        return idToy;
    }

    public void setIdToy(int idToy) {
        this.idToy = idToy;
    }

    public String getNameToy() {
        return nameToy;
    }

    public void setNameToy(String nameToy) {
        this.nameToy = nameToy;
    }

    public int getQuantityToy() {
        return quantityToy;
    }

    public void setQuantityToy(int quantityToy) {
        this.quantityToy = quantityToy;
    }

    public String getShareToysInGame() {
        return shareToysInGame;
    }

    public void setShareToysInGame(String shareToysInGame) {
        this.shareToysInGame = shareToysInGame;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SlotMachine)) return false;
        SlotMachine that = (SlotMachine) o;
        return idToy == that.idToy && quantityToy == that.quantityToy && Objects.equals(nameToy, that.nameToy) && Objects.equals(shareToysInGame, that.shareToysInGame);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idToy, nameToy, quantityToy, shareToysInGame);
    }

    @Override
    public String toString() {
        return "SlotMachine{" +
                "idToy=" + idToy +
                ", nameToy='" + nameToy + '\'' +
                ", quantityToy=" + quantityToy +
                ", shareToysInGame='" + shareToysInGame + '\'' +
                '}';
    }
}
