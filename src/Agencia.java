import java.util.List;

public class Agencia {

    private int codigo;


    public Agencia(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Agencia{" +
                "codigo=" + codigo +
                '}';
    }

    public int getCodigo() {
        return codigo;
    }

}
