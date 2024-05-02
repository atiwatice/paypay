package com.paypay.paypay.utilities;

import java.lang.reflect.Field;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Component;

import com.paypay.paypay.constant.FieldNameMap;

@Component
public class UtilitiesService {
    public String generateRandomUUID(String inputParameter) {
        String randomUUID = UUID.nameUUIDFromBytes(inputParameter.getBytes()).toString();
        return randomUUID;
    }

    public LocalDateTime localDateTimeNow() {
        return LocalDateTime.now();
    }

    public String localDateTimeToString(LocalDateTime localDatetime, String formatDateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatDateTime);
        return localDatetime.format(formatter);
    }

    public LocalDateTime stringToLocalDateTime(String dateTimeString, String formatDateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatDateTime);
        return LocalDateTime.parse(dateTimeString, formatter);
    }

    public void compareObjects(Object obj1, Object obj2, Map<String, String> differences) {
        Class<?> clazz = obj1.getClass();

        Field[] fields = clazz.getDeclaredFields();
        // Map<String, String> differences = new HashMap<>();

        for (Field field : fields) {
            field.setAccessible(true);
            try {
                Object value1 = field.get(obj1);
                Object value2 = field.get(obj2);

                if (value1 == null && value2 == null) {
                    continue; // Both values are null, so no difference
                } else if (value1 == null || !value1.equals(value2)) {
                    differences.put(FieldNameMap.FIELD_NAMES_MAP.get(field.getName()), "Before: " + value1 + ", After: " + value2);

                }

            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
