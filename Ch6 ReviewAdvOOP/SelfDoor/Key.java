package int105.model;

public abstract class Key {
    private int keyId;

    public Key(int keyId) {
        this.keyId = keyId;
    }

    public int getKeyId() {
        return keyId;
    }

    public void setKeyId(int keyId) {
        this.keyId = keyId;
    }

    @Override
    public String toString() {
        return "Key{" + "keyId=" + keyId + '}';
    }

    

}
