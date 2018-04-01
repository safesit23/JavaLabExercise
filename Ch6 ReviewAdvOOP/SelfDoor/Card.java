/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int105.model;

/**
 *
 * @author Tisanai.Cha
 */
public class Card extends Key{

    private String identifyCode;
    private String nameOwner;

    public Card(int keyId, String identifyCode, String nameOwner) {
        super(keyId);
        this.identifyCode = identifyCode;
        this.nameOwner = nameOwner;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public String getIdentifyCode() {
        return identifyCode;
    }

    public void setIdentifyCode(String identifyCode) {
        this.identifyCode = identifyCode;
    }

    @Override
    public String toString() {
        return "Card{" + "identifyCode=" + identifyCode + ", nameOwner=" + nameOwner + '}';
    }
}
