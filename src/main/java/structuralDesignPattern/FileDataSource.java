package structuralDesignPattern;

public class FileDataSource implements DataSource{

    @Override
    public String read() {
        return "Base";
    }

    @Override
    public void write(String value) {
        System.out.println("Base source");
    }
}
