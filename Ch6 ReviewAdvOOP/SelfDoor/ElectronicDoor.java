/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int105.model;

public class ElectronicDoor extends Door{

    private String identifyCode;
    private String model;

    public ElectronicDoor(int doorId, String identifyCode, String model) {
        super(doorId);
        this.identifyCode = identifyCode;
        this.model = model;
    }

    @Override
    public boolean lock(){
        setStatus(false);
        return isStatus();
    }
    
    @Override
    public boolean unlockkey(Key key){
        Card card = (Card) key;     //Casting จากคุณสมบัติของ Polymorphism
        if(this.identifyCode.equals(card.getIdentifyCode())){
            setStatus(true);
        }
        return isStatus();
    }

    public String getIdentifyCode() {
        return identifyCode;
    }

    public void setIdentifyCode(String identifyCode) {
        this.identifyCode = identifyCode;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "ElectronicDoor{" + "identifyCode=" + identifyCode + ", model=" + model + '}';
    }


}
