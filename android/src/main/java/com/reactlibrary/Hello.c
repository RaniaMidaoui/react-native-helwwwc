#include <stdio.h>
#include <jni.h>
#include "JavaToC.h"
JNIEXPORT jstring JNICALL Java_com_reactlibrary_JavaToC_helloC(JNIEnv *env, jobject thiz)
{
	    char msg[60] = "Hello world : fromC ";
	    jstring result;
	    result = (*env)->NewStringUTF(env,msg);
	    return result;
}
