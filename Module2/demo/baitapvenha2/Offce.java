package demo.baitapvenha2;

import java.io.IOException;

public class Offce extends Staff {

    public Offce(int id, String phone, String name, String position) {
        super(id, phone, name, position);
    }
    @Override
    public void ab() throws Exception {
        throw new IOException("asdsd");
    }

}
