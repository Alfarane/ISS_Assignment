//package com.corejava.json;

public class JsonBasicsDemo {

    public static void main(String[] args) {

        /*
         * JSON (JavaScript Object Notation) is a lightweight
         * data interchange format used to exchange data.
         * Java does not support JSON natively, so it is usually
         * handled as String unless libraries like Jackson/Gson are used.
         */

        // JSON Object example
        String jsonObject = "{"
                + "\"id\": 1,"
                + "\"name\": \"Alpha\","
                + "\"active\": true"
                + "}";

        System.out.println("JSON Object:");
        System.out.println(jsonObject);

        // JSON Array example
        String jsonArray = "["
                + "\"Java\","
                + "\"Python\","
                + "\"C++\""
                + "]";

        System.out.println("\nJSON Array:");
        System.out.println(jsonArray);

        // JSON Array of Objects
        String jsonArrayOfObjects = "["
                + "{ \"id\": 1, \"name\": \"Alpha\" },"
                + "{ \"id\": 2, \"name\": \"Beta\" }"
                + "]";

        System.out.println("\nJSON Array of Objects:");
        System.out.println(jsonArrayOfObjects);

        // Nested JSON example
        String nestedJson = "{"
                + "\"student\": {"
                + "    \"id\": 1,"
                + "    \"name\": \"Alpha\""
                + "},"
                + "\"marks\": [85, 90, 88]"
                + "}";

        System.out.println("\nNested JSON:");
        System.out.println(nestedJson);

        /*
         * JSON Data Types:
         * String  -> "text"
         * Number  -> 10, 10.5
         * Boolean -> true / false
         * Object  -> { }
         * Array   -> [ ]
         * null    -> null
         */

        /*
         * JSON Rules:
         * - Keys must be in double quotes
         * - No trailing commas
         * - No comments allowed
         * - Uses : for key-value and , for separation
         */

        /*
         * JSON is commonly used in:
         * - REST API request and response
         * - Frontend to backend communication
         * - Microservices
         */

        // Example of JSON used as API response
        String apiResponse = "{"
                + "\"status\": \"success\","
                + "\"data\": {"
                + "    \"id\": 1,"
                + "    \"name\": \"Alpha\""
                + "}"
                + "}";

        System.out.println("\nSample API Response JSON:");
        System.out.println(apiResponse);
    }
}
