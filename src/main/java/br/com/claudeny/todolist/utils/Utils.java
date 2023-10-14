package br.com.claudeny.todolist.utils;

import java.beans.PropertyDescriptor;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

public class Utils {

    public static void copyNomNullProperties(Object source, Object target) {
        BeanUtils.copyProperties(source, target, getNullPropertyName(source));
    }

    public static String[] getNullPropertyName(Object source) {
        final BeanWrapper src = new BeanWrapperImpl(source);
        PropertyDescriptor[] pds = src.getPropertyDescriptors();

        Set<String> empytNames = new HashSet<>();

        for (PropertyDescriptor pd : pds) {
            Object srcValue = src.getPropertyValue(pd.getName());
            if (srcValue == null) {
                empytNames.add(pd.getDisplayName());
            }
        }
        String[] result = new String[empytNames.size()];
        return empytNames.toArray(result);
    }

}
