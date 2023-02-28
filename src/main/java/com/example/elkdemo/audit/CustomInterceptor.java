package com.example.elkdemo.audit;

import lombok.extern.slf4j.*;
import org.hibernate.*;
import org.hibernate.type.Type;
import org.slf4j.event.*;
import org.springframework.stereotype.*;

import java.io.*;
import java.lang.reflect.*;
import java.text.*;
import java.util.*;
import java.util.stream.*;

@Slf4j
@Component
public class CustomInterceptor implements Interceptor, Serializable {

    private static final String SAVE_ACTION = "Create";
    private static final String FIELD_NAME_VALUE_FORMAT = "{0}: {1}";

    @Override
    public boolean onSave(Object entity, Object id, Object[] state, String[] propertyNames, Type[] types)
            throws CallbackException {
        StringBuilder sb = new StringBuilder("User action: ");
        sb.append(SAVE_ACTION).append(" ");
        sb.append("Entity: ");
        Map<String, Object> entityFieldsAsListOfString = getEntityFieldsAsListOfString(entity);
        entityFieldsAsListOfString.forEach((k, v) ->
                sb.append(MessageFormat.format(FIELD_NAME_VALUE_FORMAT, k, v)).append(" "));
        log.info("{}", sb);
        return true;
    }

    private Map<String, Object> getNewEntityFieldsAsListOfString(Object[] state, String[] propertyNames) {
        return IntStream.range(0, state.length)
                .boxed()
                .collect(Collectors.toMap(i -> propertyNames[i], i -> state[i]));
    }

    private Map<String, Object> getEntityFieldsAsListOfString(Object entity) {
        return Arrays.stream(entity.getClass().getDeclaredFields())
                .collect(Collectors.toMap(Member::getName, f -> getFieldValue(entity, f)));
    }

    private Object getFieldValue(Object entity, Field f) {
        try {
            f.setAccessible(true);
            return f.get(entity);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
