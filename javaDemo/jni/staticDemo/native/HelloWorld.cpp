#include "javaDemo_jni_staticDemo_HelloWorld.h"
#include <iostream>
#include <cstring>
#include <string>

#ifdef __cplusplus  
extern "C"  
{  
#endif  

JNIEXPORT jstring JNICALL Java_javaDemo_jni_staticDemo_HelloWorld_getFromNative
  (JNIEnv *env, jclass jcl, jstring jstr){
    const char *cstr = env->GetStringUTFChars(jstr, NULL);
    std::string str = std::string(cstr);
    str = str + " -> Yes, you're right!";

    char cc[128];
    strcpy(cc, str.c_str());
    return env->NewStringUTF(cc);
}


#ifdef __cplusplus  
}  
#endif  