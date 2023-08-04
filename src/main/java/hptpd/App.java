package hptpd;

import com.hj212.format.hbt212.core.T212Mapper;
import com.hj212.format.hbt212.exception.T212FormatException;
import com.hj212.format.hbt212.model.Data;

import java.io.IOException;
import java.util.Map;

/**
 * Hello world!
 *
 * @author tracy4262
 */
public class App {
    public static void main(String[] args) throws T212FormatException, IOException {

        T212Mapper mapper = new T212Mapper().enableDefaultVerifyFeatures().enableDefaultParserFeatures();
        String value = "##0354QN=20230803171130538;ST=31;CN=2011;PW=123456;MN=88888880000001234567;Flag=5;CP=&&DataTime=20230803165500;w01001-Rtd=0.000,w01001-Flag=N;w21003-Rtd=0.000,w21003-Flag=N;w01018-Rtd=0.000,w01018-Flag=N;e01002-Rtd=0.000,e01002-Flag=N;w01010-Rtd=0.000,w01010-Flag=N;e01001-Rtd=0.000,e01001-Flag=N;w01003-Rtd=0.000,w01003-Flag=N;w21011-Rtd=0.000,w21011-Flag=N&&A141\r\n";
        Map _map= mapper.readDeepMap(value);
        Data _data= mapper.readData(value);
        System.out.println("Hello World!");
    }
}
