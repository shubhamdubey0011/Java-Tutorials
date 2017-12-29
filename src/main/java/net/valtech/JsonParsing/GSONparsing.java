package net.valtech.JsonParsing;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class GSONparsing {

	private static final Class<Person> String = null;
	static String json;

	public static void main(String[] args) throws JsonProcessingException,
			IOException {

		// Using Gson jar
		Gson gs = new Gson();
		Person person = gs.fromJson("{\"name\": \"3360\"}", Person.class);
		// Person person = gs.fromJson("{\"name\": \"3360\"}", String);
		System.out.println(person.name);

		
		// Using org.json jar
		json = "{\"userName\": \"Shubham\" }";
		JSONObject jsonObject = new JSONObject(json);
		System.out.println(jsonObject.getString("userName"));

		// Using jackson-databind jar
		ObjectMapper mapper = new ObjectMapper();
		json = "{\"LastName\": \"Dubey\" }";
		JsonNode jsonNode = mapper.readTree(json);
		JsonNode statusNode = jsonNode.get("LastName");
		String statusValue = statusNode.textValue();
		System.out.println(statusValue);
		
		
		
		
		//byte[] mapData = Files.readAllBytes(Paths.get("data.txt"));
		json = "{\"Empname\": \"Shubham_Dubey\",\"EmpId\": \"3360\",\"Role\": \"Automation Engineer\" }";
		Map<String,String> myMap = new HashMap<String, String>();

		ObjectMapper objectMapper = new ObjectMapper();
		myMap = objectMapper.readValue(json, HashMap.class);
		System.out.println("Map is: "+myMap);

		//another way
		myMap = objectMapper.readValue(json, new TypeReference<HashMap<String,String>>() {});
		System.out.println("Map using TypeReference: "+myMap);

	}

}
