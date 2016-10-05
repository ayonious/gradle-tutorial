package libs;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class Libs {
    public static int add(int i1,int i2) {
      return i1+i2;
    }
	public static int subt(int i1,int i2) {
		return i1-i2;
	}
}
