package org.onosproject.ustc;

import com.google.common.annotations.Beta;
import org.onlab.osgi.DefaultServiceDirectory;

@Deprecated
@Beta
public  abstract  class UsalCommAbstract {
    public static <T> T get(Class<T> serviceClass) {
        return DefaultServiceDirectory.getService(serviceClass);
    }


    public void print(String format, Object... args) {
        System.out.println(String.format(format, args));
    }


}
