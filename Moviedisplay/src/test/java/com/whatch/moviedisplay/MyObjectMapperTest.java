package com.whatch.moviedisplay;
import com.whatch.moviedisplay.jsonreader.MyObjectMapper;
import org.junit.Test;

import static org.junit.Assert.*;


public class MyObjectMapperTest {
    @Test
    public void testReadJsonWithObjectMapper() throws Exception{
        MyObjectMapper myObjectMapper = new MyObjectMapper();
        myObjectMapper.readJsonWithObjectMapper();
    }
}
