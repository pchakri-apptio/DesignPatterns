package structuralDesignPattern;

public class EncryptedDataSource implements DataSource{

    public DataSource dataSource;

    public EncryptedDataSource(DataSource dataSource){
        this.dataSource = dataSource;
    }
    @Override
    public String read() {
        String value = dataSource.read();
        return decrypt(value);
    }

    private String decrypt(String value) {
        return "decrypt";
    }

    @Override
    public void write(String value) {
        String encryptValue = encrypt(value);
        dataSource.write(encryptValue);
    }

    private String encrypt(String value) {
        return "encrypt";
    }
}
