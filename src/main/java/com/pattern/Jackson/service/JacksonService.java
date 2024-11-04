package com.pattern.Jackson.service;

import com.fasterxml.jackson.core.*;

import java.io.IOException;
import java.io.StringWriter;

public class JacksonService {
    public void testMethod() throws IOException {

        // Создаем StringWriter для хранения JSON-результата
        StringWriter writer = new StringWriter();

        // Создаем JsonGenerator с использованием JsonFactory
        JsonFactory factory = new JsonFactory();
        JsonGenerator generator = factory.createGenerator(writer);

        generator.writeStartObject();



        generator.writeStartObject();
        generator.writeStringField("name", "Jane");
        generator.writeNumberField("age", 25);
        generator.writeStringField("city", "London");
        generator.writeEndObject();

        // Завершаем генерацию и выводим результат
        generator.close();
        System.out.println(writer);
    }
}
