package structuralDesignPattern;

public class CompressedDataSource implements DataSource{

    public DataSource dataSource;

    public CompressedDataSource(DataSource dataSource){
        this.dataSource = dataSource;
    }

    @Override
    public String read() {
        String value = dataSource.read();
        return decompress(value);
    }

    private String decompress(String value) {
        return "decompress";
    }

    @Override
    public void write(String value) {
        String compressedValue = compress(value);
        dataSource.write(compressedValue);
    }

    private String compress(String value) {
       return  "compress" + value;
    }
}
