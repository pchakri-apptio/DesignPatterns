package structural.decorator;

import org.junit.Before;
import org.junit.Test;
import structuralDesignPattern.CompressedDataSource;
import structuralDesignPattern.DataSource;
import structuralDesignPattern.EncryptedDataSource;
import structuralDesignPattern.FileDataSource;

import static org.junit.Assert.assertEquals;

public class DataSourceDecoratorTest {

    DataSource dataSource = null;

    @Before
    public void setUp(){
        dataSource = new FileDataSource();
    }

    @Test
    public void baseTest(){
        String value = dataSource.read();
        assertEquals("if base datasource is used","Base",value);
    }

    @Test
    public void compressedDataTest(){
        DataSource compressedDataSource = new CompressedDataSource(dataSource);
        assertEquals("if compressed datasource is used","decompress",compressedDataSource.read());
    }

    @Test
    public void compressedAndEncryptedDataTest(){
        DataSource compressedDataSource = new CompressedDataSource(dataSource);
        DataSource encryptedDataSource = new EncryptedDataSource(compressedDataSource);
        assertEquals("if encryption datasource is used","decrypt",encryptedDataSource.read());
    }

}
