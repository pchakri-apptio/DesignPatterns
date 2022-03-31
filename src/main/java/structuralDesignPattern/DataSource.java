package structuralDesignPattern;

public interface DataSource {

    String read();
    void write(String value);
}
