package demo.baitapvenha2;

public class Factory extends Staff {
    private int idFactory;
    private String type;

    public Factory(int id, String phone, String name, String position, int idFactory, int type) {
        super(id, phone, name, position);
        this.idFactory = idFactory;
        this.type = String.valueOf(type);
    }

    public int getIdFactory() {
        return idFactory;
    }

    public void setIdFactory(int idFactory) {
        this.idFactory = idFactory;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + "type:" + type + ", " + "idFactory:" + idFactory +
                '}';
    }
}
