#![cfg(target_os = "android")]
#![allow(non_snake_case)]
#[macro_use]
extern crate magic_crypt;
use jni::JNIEnv;
use jni::objects::{JObject, JString};
use jni::sys::jstring;
use std::ffi::{CStr, CString};

#[no_mangle]
pub unsafe extern fn Java_com_jizhi_rustonandroidtemplate_MainActivity_stringFromJNI(env: JNIEnv, _: JObject, j_recipient: JString) -> jstring {
    let recipient = CString::from(
        CStr::from_ptr(
            env.get_string(j_recipient).unwrap().as_ptr()
        )
    );
    let output = env.new_string("Hello ".to_owned() + recipient.to_str().unwrap()).unwrap();
    output.into_inner()
}

#[no_mangle]
pub unsafe extern fn Java_com_jizhi_stringfog_CustomStringFogImpl_decrypt(env: JNIEnv, _: JObject, j_recipient: JString)-> jstring{
    use magic_crypt::MagicCryptTrait;
    let mc = new_magic_crypt!("@rWgKBNYL7RO8Nh3vksASXK10##5DC8R", 256);
    let recipient = CString::from(
        CStr::from_ptr(
            env.get_string(j_recipient).unwrap().as_ptr()
        )
    );
    let output = env.new_string(mc.decrypt_base64_to_string(recipient.to_str().unwrap()).unwrap()).unwrap();
    output.into_inner()
}