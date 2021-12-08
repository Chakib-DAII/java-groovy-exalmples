#include <jni.h>
#include "com_example_java_groovy_nativec_NativeCalls.h"         /* Generated JNI file. */
#include <stdio.h>         /* Standard C IO stuff. */

/*
 * Class:     com_example_java_groovy_nativec_NativeCalls
 * Method:    printText
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_com_example_java_groovy_nativec_NativeCalls_printText__
  (JNIEnv *env, jclass classJava){
    puts ("Text Sample");
    }

/*
 * Class:     com_example_java_groovy_nativec_NativeCalls
 * Method:    printText
 * Signature: (Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_com_example_java_groovy_nativec_NativeCalls_printText__Ljava_lang_String_2
  (JNIEnv *env, jobject objectJava, jstring strJava){
      char buf[128];
      const char *str = (*env)->GetStringUTFChars(env, strJava, 0);
      printf("%s\n", str);
      (*env)->ReleaseStringUTFChars(env, strJava, str);
    }

